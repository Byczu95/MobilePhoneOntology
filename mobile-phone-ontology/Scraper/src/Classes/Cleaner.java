package Classes;

public class Cleaner {

	static public String ClearValue(String Key, String Value){	
		String clearedValue = "_";
		//Key = Cleaner.ClearKey(Key);
		if(Value != null)
			try {
				switch(Key)
				{
				case"_3G": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Akcelerometr": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Aktualizacja": 
				 	 clearedValue = Value; //???
				 	 break;
				case"Akumulator": 
				 	 clearedValue = Value.replaceAll("[^\\d.]", "");
				 	 break; 
				case"Alarm_wibracyjny": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Aparat_glowny": 
				 	 clearedValue = Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Aparat_podwojny_Dual": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Bezprzewodowe_ladowanie": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break;
				case"Bluetooth": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"CSD": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break; 
				case"Czas_czuwania_w_2G_h": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Czas_czuwania_w_3G_h": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Czas_odtwarzania_muzyki_h": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Czas_rozmów_w_2G_min": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Czas_rozmów_w_3G_min": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Czujnik_oswietlenia": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Czujnik_zblizeniowy": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Czytnik_linii_papilarnych": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Dual_SIM": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Dyktafon": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"EDGE": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"EMS": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Email": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"FM_transmiter": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"GPRS": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break;
				case"GPS": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"GSM": 
				 	 clearedValue =  Value;
				 	 break;
				case"HD_Voice": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"HSCSD": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break;
				case"HSDPA": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"HSPA": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break; 
				case"HSPA_Plus": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"HSUPA": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"IM": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Inne": 
				 	 clearedValue =  Value;
				 	 break;
				case"IrDA": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Java": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Klawiatura_sprzetowa": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Kompas_cyfrowy": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"LTE": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"MMS": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Masa_g": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"Modul_TV": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"NFC": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Nazwa": 
				 	 clearedValue =  Value;
				 	 break; 
				case"Ochrona_wyswietlacza": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Odpornosc_na_wstrzasy,_wode_i_pyl": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Odtwarzacz_muzyki": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Odtwarzacz_wideo": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Polifonia": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Procesor": 
				 	 clearedValue = Value; //??? 
				 	 break;
				case"Profile": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break; 
				case"Przedni_aparat": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Przegladarka": 
				 	 clearedValue =  Value; //???
				 	 break;
				case"RSS": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Radio": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"SAR_EU_cialo": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"SAR_EU_glowa": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"SAR_US_cialo": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"SAR_US_glowa": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"SMS": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Siec_-_opis_dodatkowy": 
				 	 clearedValue =  Value;
				 	 break;
				case"System": 
				 	 clearedValue = Value;  
				 	 break;
				case"System_glosnomowiacy": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Szybkie_ladowanie": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Slownik_SMS": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Terminarz": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Typ_SIM": 
				 	 clearedValue =  Value;
				 	 break;
				case"Typ_budowy": 
				 	 clearedValue = Value; //??? 
				 	 break;
				case"Typ_urzadzenia": 
				 	 clearedValue =  Value; //???
				 	 break;
				case"USB": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"WCDMA": 
				 	 clearedValue =  Value;
				 	 break;
				case"WLAN": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";  //???
				 	 break;
				case"WLAN_Dual_Band": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break;
				case"WiMAX": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Wideorozmowa": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break;
				case"Wybieranie_glosowe": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Wyjscie_TV": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Wymiary_wys_x_szer_x_grub_mm": 
				 	 clearedValue =  Value; //???
				 	 break;
				case"Wymienny_akumulator": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Wyswietlacz_dodatkowy": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"Wyswietlacz_glowny": 
				 	 clearedValue =  Value; //???
				 	 break;
				case"Zaprezentowany": 
				 	 clearedValue =  Value; //??? Tylko rok proponuje
				 	 break;
				case"Zlacze_jack": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "").length() > 0 ? "Tak"  : "Nie"; //???
				 	 break;
				case"autofocus": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie"; 
				 	 break;
				case"filmy": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break;
				case"flesz": 
				 	 clearedValue = Value.contentEquals("Tak") ? "Tak"  : "Nie";  
				 	 break; 
				case"karta_pamieci": 
				 	 clearedValue =  Value;
				 	 break;
				case"karta_pamieci_-_max_wielkosc": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break;
				case"karta_pamieci_w_zestawie": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"kolory": 
				 	 clearedValue = Value.replaceAll("[^\\d.]", ""); 
				 	 break;
				case"ksiazka_adresowa_wielkosc": 
				 	 clearedValue =  Value;
				 	 break; 
				case"rozdzielczosc": 
				 	 clearedValue = Value; //??? Usunac pix
				 	 break;
				case"typ_USB": 
				 	 clearedValue = Value; 
				 	 break; 
				case"wielkosc": 
				 	 clearedValue =  Value.replaceAll("[^\\d.]", "");
				 	 break; 
				case"wielkosc_pamieci_wbudowanej": 
				 	 clearedValue =  Value.split(" ")[0];
				 	 break;
				case"znany_takze_jako": 
				 	 clearedValue =  Value;
				 	 break;
				case"zoom_optyczny": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Ladowanie_przez_USB": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				case"Zyroskop": 
				 	 clearedValue =  Value.contentEquals("Tak") ? "Tak"  : "Nie";
				 	 break;
				default:
					return clearedValue;
				}
			} catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		return clearedValue;
	}
	
	static public String ClearKey(String Key)
	{
		if(Key.contentEquals("3G")) return "_3G";
		if(Key.contentEquals("HSPA+")) return "HSPA_Plus";
		if(Key.contentEquals("Aparat podwójny (Dual)")) return "Aparat_podwojny_Dual";
		if(Key.contentEquals("Czas czuwania w 2G (h)")) return "Czas_czuwania_w_2G_h";
		if(Key.contentEquals("Czas czuwania w 3G (h)")) return "Czas_czuwania_w_3G_h";
		if(Key.contentEquals("Czas odtwarzania muzyki (h)")) return "Czas_odtwarzania_muzyki_h";
		if(Key.contentEquals("Czas rozmów w 2G (min)")) return "Czas_rozmow_w_2G_min";
		if(Key.contentEquals( "Czas rozmów w 3G (min)")) return "Czas_rozmow_w_3G_min";
		if(Key.contentEquals("Masa (g)")) return "Masa_g";
		if(Key.contentEquals("SAR EU (ciało)")) return "SAR_EU_cialo";
		if(Key.contentEquals("SAR EU (głowa)")) return "SAR_ES_glowa";
		if(Key.contentEquals("SAR US (ciało)")) return "SAR_US_cialo";
		if(Key.contentEquals("SAR US (głowa)")) return "SAR_US_glowa";
		if(Key.contentEquals("WLAN Dual Band (2,4GHz/5GHz)")) return "WLAN_Dual_Band";
		if(Key.contentEquals("Wymiary (wys. x szer. x grub.) mm")) return "Wymiary_wys_x_szer_x_grub_mm";		
		return Key
				.replaceAll(" ", "_")				
				.replaceAll(",", "_")
				.replaceAll("\\.", "_")
				.replaceAll("ą", "a")
				.replaceAll("ć", "c")
				.replaceAll("ę", "e")
				.replaceAll("ł", "l")
				.replaceAll("ó", "o")
				.replaceAll("ś", "s")
				.replaceAll("ż", "z")
				.replaceAll("ź", "z");
	}	
}
