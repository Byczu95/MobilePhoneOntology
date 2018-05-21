package Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import javax.xml.bind.JAXBException;


import org.eclipse.rdf4j.model.Model;

public class Main {

	public static void main(String[] args) throws IOException, JAXBException {
		
		//ArrayList<TreeMap<String,String>> phones = Scraper.getAllProducts();
		
		//ArrayList<TreeMap> phondesRDF = wywoalc metode z Mobilephone generate modelS 
		
		//String Path = "phonesListInXML.xml";
		//XMLHelper.WriteAllPhones(Path, phones);
		
		//List<Model> rdfList = MobilePhone.GeneratePhoneModels(phones);
		

		String path = "C:\\Users\\7\\workspace\\ZTI_Project\\mobile-phone-ontology\\phonesListInXML.xml";
		List<Model> rdfList = MobilePhone.GeneratePhoneModels(XMLHelper.ReadAllPhones(path));
		MobilePhone.SaveToFile("RdfModel.txt",rdfList);
		int a = 1;
	}
}