package com.interfaces;

public class mainClass {

	
	public static void main(String[] args){
		
		
		Tamirci AliUsta=new Tamirci();
		
		Araba Subaru=new Araba();
		Kamyon Volvo=new Kamyon();
		Otobus Mercedes=new Otobus();
		
		AliUsta.tamirEt(Subaru);
		AliUsta.tamirEt(Volvo);
		AliUsta.tamirEt(Mercedes);
		
		
		
		
		
	}
	
}
