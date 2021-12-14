package Kitapci;

import static Kitapci.Degiskenler.*;

public class NumaraIleGoruntuleme {
	static int i=0;
	static boolean bulunduMu;
	
public static void numaraIleKitapGoruntuleme() {
		
	System.out.println("Goruntulemek Istediginiz Kitabin Numarasini Giriniz: ");
	int num = scan.nextInt(); 
	
	for(i=0; i<kitapListesi.size(); i++) 
	{
		if(kitapListesi.get(i).getKitapNo() == num) 
		{
			bulunduMu =true;
			break;
		}
		
		
	}

	if(bulunduMu) 
	{
		System.out.println(kitapListesi.get(i));
	}
	else 
	{
		System.out.println("Aradiginiz Kitap Listemizde Bulunamamaktadir.");
	}
		
	
	}

}
