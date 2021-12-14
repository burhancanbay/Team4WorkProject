package Kitapci;

import static Kitapci.Degiskenler.*;

public class Runner {
	
	{
		// Bir kitapci icin program yazalim
		
		//**********************************
				
		// Kitap No 1000'den baslayacak ve sirali olarak artacak 
		// Program baslayinca Menu isminde bir method calissin
		// 1-Kitap Ekle
		// 2-Numara Ile Kitap Goruntule
		// 3-Bilgi Ile Kitap Goruntule
		// 4-Numara Ile Kitap Sil
		// 5-Tum kitaplari Listele
		// 6-Cikis
				
		//*********************************
				
		// 1. olarak her kitaba ait kitap no olacak
		// Sonra kitap adi olacak
		// Buna ait yazar adi olacak
		// Ve de kitap fiyati olacak
		// Ve bu bilgilerin tutulacagi bir yer olmali yani bir list'te tutmamiz gerek
		
		// 2. olarak Kitap numarasi 1000'den baslamali, 
		// Her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilir
		// count=1000; 
		// menu isminde bir method olusturmaliyim
				
		// 3. olarak kitap ekle diye bir method olusturmaliyim
		// bu method farkli bir classta olmali
				
		// 4. olarak Kullanicidan Kitap Adi Yazar Adi ve Fiyat Bilgileri Istenmeli
		}

	public static void main(String[] args) {
		
		menu();

	}

	private static void menu() {
		
		
		
		while(mainMenu) 
		{
			System.out.println(MAIN_MENU_TEXT);
			
			String secim = scan.next();
			
			switch(secim) 
			{
				case "1":KitapEkleme.kitapEkle();
					break;
				case "2":NumaraIleGoruntuleme.numaraIleKitapGoruntuleme();
					break;	
				case "3":BilgiIleGoruntuleme.kitapAdiIleGoruntuleme();
					break;
				case "4":
					BilgiIleGoruntuleme.yazarAdiIleGoruntuleme();
					break;
				case "5":
					KitapSilme.kitapSil();
					break;
				case "6":
					Listeleme.listele();
					break;
				case"7":
					mainMenu=false;
					System.out.println("Hosca kalin,tekrar gorusmek dilegiyle...");
					break;
				default:
					System.out.println("Hatali Giris Yaptiniz. Lutfen Tekrar Deneyiniz.");
					break;
						
					
					
				
			}
			
		}
		
		
		
	}

	

	

	

	

	
}
