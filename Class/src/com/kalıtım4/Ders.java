package com.kalıtım4;

public class Ders {

	
	
	String ad;
	String saat;
	
	
	public void Kaydet(Kisi kisi){
		if(kisi instanceof Ogrenci){
		((Ogrenci)kisi).kaydol();
		}else{
			System.out.println("Sadece öğrenciler kayıt olabilir..");
		}
		
	}
	
	
}
