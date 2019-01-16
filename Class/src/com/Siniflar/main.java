package com.Siniflar;

public class main {

	public static void main(String[] args) {
		
		ogrenci o=new ogrenci();
		ogrenci o2=new ogrenci();
		
		o.setIsim("Ahmet");
		o.setSoyad("Ali");
		o.setNo(34);
		
		
		o2.setIsim("Ali");
		o2.setSoyad("Ahmet");
		o2.setNo(34);
		
		if(o.equals(o2)){
			System.out.println("Aynı kişi no  olamaz..");
		}else{
			System.out.println("Kişiler no aynı değil ");
		}
		
		
		
		
		
		
	}
	
	
}
