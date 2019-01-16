package ders4;

public class main {

	
	public static void main(String[] args) {
		
		
		
		ogrenci ogr=new ogrenci("Cumali","aksoy",3948);
		Adres a=new Adres("Izmir","Dikili","Gazipasa",12);
		
		ogr.setAdres(a);
		
		System.out.println("Adresi :"+ogr.getIsim()+ " ");
		ogr.bilgiAl();
		
		System.out.println(ogrenci.al()); 
	
		
		
	}
	
	
}
