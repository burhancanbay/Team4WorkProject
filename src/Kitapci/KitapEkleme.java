package Kitapci;

import static Kitapci.Degiskenler.*;

public class KitapEkleme {
	
static void kitapEkle() {
	
	Kitap kitap1 = new Kitap();
	
	System.out.println("Lutfen Eklemek Istediginiz Kitabin Adini Giriniz: ");
	scan.nextLine();
	kitap1.setKitapAdi(scan.nextLine());
	
	System.out.println("Lutfen Eklemek Istediginiz Kitabin Yazarini Giriniz: ");
	kitap1.setYazarAdi(scan.nextLine());
	
	System.out.println("Lutfen Eklemek Istediginiz Kitabin Fiyatini Giriniz: ");
	kitap1.setFiyat(scan.nextDouble());
	
	kitap1.setKitapNo(numara);
	kitapListesi.add(kitap1);
	numara++;
	
	System.out.println("Ekleme Islemi Basarili.");
		
		
	}


}
