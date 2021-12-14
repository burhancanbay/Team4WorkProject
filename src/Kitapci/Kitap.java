package Kitapci;

public class Kitap {
	
	private String kitapAdi;
	private String yazarAdi;
	private double fiyat;
	private int kitapNo;
	
	
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getKitapNo() {
		return kitapNo;
	}
	public void setKitapNo(int kitapNo) {
		this.kitapNo = kitapNo;
	}
	
	@Override
	public String toString() {
		return "kitapAdi=" + kitapAdi + "/ yazarAdi=" + yazarAdi + "/ fiyat=" + fiyat + "/ kitapNo=" + kitapNo
				+"\n";
	}
	
	
	

}
