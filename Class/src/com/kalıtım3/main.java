package com.kalıtım3;

public class main {

	public static void main(String[] args) {
		
		
		Mudur mudur=new Mudur();
		Personel isci=new Isci();
		Personel ogr=new Ogretmen();
		
		mudur.iseAL(isci);
		mudur.iseAL(ogr);
		
		mudur.terfiEttir(ogr);
		
		
		
		
	}
	
	
	
}
