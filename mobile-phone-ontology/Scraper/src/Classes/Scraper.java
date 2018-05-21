package Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {
	
	static private ArrayList<String> getLinksForAllProducers() throws IOException{
		String url = "http://m.telepolis.pl/telefony-link,4,11,0.html";
        Document document = Jsoup.connect(url).get();

        Elements links = document.select("li").select("a");
        
        ArrayList<String> Producers = new ArrayList<String>();
        
        for (Element link : links) {          
            if(link.attr("href").startsWith("http://m.telepolis.pl/telefony,4,1,")){
            	Producers.add(link.attr("href"));
            }
        }
        return Producers;
	}
	
	static private ArrayList<String> getLinksForAllProductsForOneProducer(String ProducerLink) throws IOException{
        Document document = Jsoup.connect(ProducerLink).get();
        
        Elements links = document.select("li").select("div").select("a");
        
        ArrayList<String> Products = new ArrayList<String>();
        
        for (Element link : links) {          
            if(link.attr("href").startsWith("http://m.telepolis.pl/telefony/")){
            	Products.add(link.attr("href"));
            }
        }
		return Products;
	}
	
	static private ArrayList<String> getLinksForAllProducts() throws IOException{
		ArrayList<String> Products = new ArrayList<String>();
		
		for(String ProducerLink : Scraper.getLinksForAllProducers()){
			ArrayList<String> ProductsForOneProducer = Scraper.getLinksForAllProductsForOneProducer(ProducerLink);
			
			for(String elem : ProductsForOneProducer)
				Products.add(elem);
        }
		return Products;
	}	
    
	static public TreeMap<String,String> getProductFromURL(String URL) throws IOException{
        Document document = Jsoup.connect(URL).get();
        
        TreeMap<String, String> FeaturesMap = new TreeMap<>();
        
        Elements features = document.select("table").select("tbody").select("tr").select("td");
        
        String Key;
        String Value;
        
        //Od i = 10 zaczynaja sie przydatne dane
        for (int i = 10; i < features.size(); i+=2) {          
            if(features.get(i).hasText()){
            	Key = Cleaner.ClearKey(features.get(i).text());
            	Value = Cleaner.ClearValue(Key,features.get(i+1).text());
            	if(Key != null)
            		if(Value != null)
            			FeaturesMap.put(Key, Value); //???
            }
        }
		return FeaturesMap;
	}
	
	static public ArrayList<TreeMap<String,String>> getAllProducts() throws IOException{
		
		ArrayList<TreeMap<String,String>> Products = new ArrayList<TreeMap<String,String>>();
		
		for(String link : getLinksForAllProducts()){
			Products.add(getProductFromURL(link));
		}
		return Products;
	}
}
