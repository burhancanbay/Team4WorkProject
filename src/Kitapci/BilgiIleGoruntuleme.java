package Kitapci;

import static Kitapci.Degiskenler.*;

public class BilgiIleGoruntuleme {
	
	static boolean bulunduMu;
	static int i=0;
	
	
	/*
	public static void main(String[] args) { 
		
		System.out.println("Lutfen Goruntuleme Tipini Seciniz: "
				+ "\nKitap Adi Ile Goruntulemek Icin 1'i"
				+ "\nYazar Adi Ile Goruntulemek Icin 2'i "
				+ "\nTuslayiniz");
		
		String secim = scan.next();
		
		switch(secim) 
		{
		case "1":
			kitapAdiIleGoruntuleme();
			break;
		case "2":
			yazarAdiIleGoruntuleme();
			break;
			
			
		}
		
	}
	*/
	
	
public static void kitapAdiIleGoruntuleme() {
	
	System.out.println("Goruntulemek Istediginiz Kitabin Adini Giriniz: ");
	
	scan.nextLine();
	String kitapAdi = scan.nextLine();
	
	for( i=0; i<kitapListesi.size(); i++) 
	{
		if(kitapListesi.get(i).getKitapAdi().equals(kitapAdi)) 
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
		System.out.println("Aradiginiz Kitap Bizde Bulunmamaktadir.");
	}
	
		
		
	}

public static void yazarAdiIleGoruntuleme() 
{
	System.out.println("Goruntulemek Istediginiz Kitabin Yazarini Giriniz: ");
	
	scan.nextLine();
	String yazarAdi = scan.nextLine();
	
	for( i=0; i<kitapListesi.size(); i++) 
	{
		if(kitapListesi.get(i).getYazarAdi().equals(yazarAdi)) 
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
		System.out.println("Aradiginiz Kitap Bizde Bulunmamaktadir.");
	}
	
	
		
	
}	
	
}

