package Kitapci;

import static Kitapci.Degiskenler.kitapListesi;
import static Kitapci.Degiskenler.scan;

public class KitapSilme {
	
	static int i=0;
	static boolean bulunduMu;
	
public static void kitapSil() {
	
	System.out.println("Silmek Istediginiz Kitabin Numarasini Giriniz: ");
	int num = scan.nextInt(); 
	
	for(i=0; i<kitapListesi.size(); i++) 
	{
		if(kitapListesi.get(i).getKitapNo() == num) 
		{
			bulunduMu=true;
			break;
		}
		
		
	}
	if(bulunduMu) 
	{
		kitapListesi.remove(i);
		System.out.println("Kitap Silinmistir");
	}
	else 
	{
		System.out.println("Aradiginiz Kitap Listemizde Bulunamamaktadir.");
	}
		
		
	}

}
