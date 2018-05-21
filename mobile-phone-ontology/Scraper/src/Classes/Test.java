package Classes;

import java.util.ArrayList;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		Test_XMLFileWith2Phone();
	}
	
	public static void Test_XMLFileWith2Phone(){
		ArrayList<TreeMap<String,String>> phones = new ArrayList<TreeMap<String,String>>();
		
		TreeMap<String,String> phone1 = generatePhoneWithAllFeatures("Test1");
		
		TreeMap<String,String> phone2 = generatePhoneWithAllFeatures("Test2");
		
		phones.add(phone1);
		phones.add(phone2);
		
		String Path = "phonesList.xml";
		XMLHelper.WriteAllPhones(Path, phones);
	}
	
	private static TreeMap<String,String> generatePhoneWithAllFeatures(String Name)
	{
		TreeMap<String,String> phone = new TreeMap<String,String>();
		
		phone.put("_3G" , "Tak");
		phone.put("Akcelerometr" , "Tak");
		phone.put("Aktualizacja" , "");
		phone.put("Akumulator" , "Li-Ion 1300 mAh");
		phone.put("Alarm_wibracyjny" , "Tak");
		phone.put("Aparat_glowny" , "2 Mpix");
		phone.put("Aparat_podwojny_Dual" , "Nie");
		phone.put("Bezprzewodowe_ladowanie" , "Nie");
		phone.put("Bluetooth" , "40");
		phone.put("CSD" , "Nie");
		phone.put("Czas_czuwania_w_2G__h" , "200");
		phone.put("Czas_czuwania_w_3G_h" , "");
		phone.put("Czas_odtwarzania_muzyki_h" , "");
		phone.put("Czas_rozmow_w_2G_min" , "180");
		phone.put("Czas_rozmow_w_3G_min" , "");
		phone.put("Czujnik_oswietlenia" , "--brak danych--");
		phone.put("Czujnik_zblizeniowy" , "--brak danych--");
		phone.put("Czytnik_linii_papilarnych" , "Nie");
		phone.put("Dual_SIM" , "Nie");
		phone.put("Dyktafon" , "Tak");
		phone.put("EDGE" , "Tak");
		phone.put("EMS" , "Nie");
		phone.put("Email" , "Tak");
		phone.put("FM_transmiter" , "Nie");
		phone.put("GPRS" , "Tak");
		phone.put("GPS" , "Tak z AGPS");
		phone.put("GSM" , "850, 900, 1800, 1900");
		phone.put("HD_Voice" , "Nie");
		phone.put("HSCSD" , "Nie");
		phone.put("HSDPA" , "21 Mbps");
		phone.put("HSPA" , "Tak");
		phone.put("HSPA_Plus" , "Tak");
		phone.put("HSUPA" , "576 Mbps");
		phone.put("IM" , "Tak");
		phone.put("Inne" , "");
		phone.put("IrDA" , "Nie");
		phone.put("Java" , "Tak");
		phone.put("Klawiatura_sprzetowa" , "Nie");
		phone.put("Kompas_cyfrowy" , "Tak");
		phone.put("LTE" , "");
		phone.put("LTE" , "Nie");
		phone.put("MMS" , "Tak");
		phone.put("Masa_g" , "130");
		phone.put("Modul_TV" , "Nie");
		phone.put("NFC" , "Nie");
		phone.put("Nazwa" , "Acer Liquid Z205");
		phone.put("Ochrona_wyswietlacza" , "Nie");
		phone.put("Odpornosc_na_wstrzasy_wode_i_pyl" , "Nie");
		phone.put("Odtwarzacz_muzyki" , "Tak,");
		phone.put("Odtwarzacz_wideo" , "Tak,");
		phone.put("Polifonia" , "Tak");
		phone.put("Procesor" , "dual-core, MediaTek MT6572M, 1 GHz");
		phone.put("Profile" , "Tak");
		phone.put("Przedni_aparat" , "Nie");
		phone.put("Przegladarka" , "HTML");
		phone.put("RSS" , "Tak");
		phone.put("Radio" , "Tak z RDS");
		phone.put("SAR_EU_cialo" , "");
		phone.put("SAR_ES_glowa" , "");
		phone.put("SAR_US_cialo" , "");
		phone.put("SAR_US_glowa" , "");
		phone.put("SMS" , "Tak");
		phone.put("Siec_-_opis_dodatkowy" , "");
		phone.put("System_glosnomowiacy" , "Tak");
		phone.put("System" , "Android v44");
		phone.put("Szybkie_ladowanie" , "Nie");
		phone.put("Slownik_SMS" , "Tak");
		phone.put("Terminarz" , "Tak");
		phone.put("Typ_SIM" , "microSIM");
		phone.put("Typ_budowy" , "jednobrylowy (Bar)");
		phone.put("Typ_urzadzenia" , "Smartfon");
		phone.put("USB" , "20");
		phone.put("WCDMA" , "850, 900, 2100");
		phone.put("WLAN_Dual_Band" , "Nie");
		phone.put("WLAN" , "Tak, 80211b/g/n");
		phone.put("WiMAX" , "Nie");
		phone.put("Wideorozmowa" , "Nie");
		phone.put("Wybieranie_glosowe" , "Tak");
		phone.put("Wyjscie_TV" , "Nie");
		phone.put("Wymiary_wys_x_szer_x_grub_mm" , "1265 x 65 x 105");
		phone.put("Wymienny_akumulator" , "Tak");
		phone.put("Wyswietlacz_dodatkowy" , "Nie");
		phone.put("Wyswietlacz_glowny" , "kolorowy, IPS LCD dotykowy, pojemnosciowy multi-touch,");
		phone.put("Zaprezentowany" , "grudzień 2014");
		phone.put("Zlacze_jack" , "35 mm");
		phone.put("autofocus" , "Nie");
		phone.put("filmy" , "Tak,");
		phone.put("flesz" , "Nie");
		phone.put("karta_pamieci_-_max_wielkosc" , "32 GB");
		phone.put("karta_pamieci_w_zestawie" , "Nie");
		phone.put("karta_pamieci" , "microSDHC");
		phone.put("kolory" , "16 mln kolorow");
		phone.put("ksiazka_adresowa_wielkosc" , "bez ograniczeń");
		phone.put("rozdzielczosc" , "480 x 800 pix");
		phone.put("typ_USB" , "microUSB");
		phone.put("wielkosc_pamieci_wbudowanej" , "4 GB 512 MB RAM");
		phone.put("wielkosc" , "4 cali");
		phone.put("znany_takze_jako" , "");
		phone.put("zoom_optyczny" , "Nie");
		phone.put("ladowanie_przez_USB" , "Nie");
		phone.put("zyroskop" , "--brak danych--");
		
		return phone;
	}
}