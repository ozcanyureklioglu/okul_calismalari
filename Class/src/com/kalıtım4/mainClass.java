package com.kalıtım4;

public class mainClass {

	
	public static void main(String[] args) {
		
		Kisi Ali=new Ogrenci();
		Kisi Veli=new Ogretmen();
		Kisi Feridun=new Ogretmen();
		
		Ders matematik=new Ders();
		
		matematik.Kaydet(Ali);
		matematik.Kaydet(Veli);
		matematik.Kaydet(Feridun);
		
		
		((Ogretmen)Veli).notVer((Ogrenci)Ali);
		
		
		
		
		System.out.println();
	}
	
	
	

	
	
	
	public String al(String s){
		return "Merhaba";
		
		
	}
	
	
	
}
