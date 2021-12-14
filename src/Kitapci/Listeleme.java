package Kitapci;

import static Kitapci.Degiskenler.*;

public class Listeleme {
	
public static void listele() {
	
	if(kitapListesi.size()<0) 
	{
		System.out.println("Hic Kitabiniz Yoktur.");
	}
	else 
	{
		System.out.println(kitapListesi);
	}
		
		
	}

}
