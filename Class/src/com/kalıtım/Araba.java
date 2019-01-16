package com.kalıtım;

public class Araba extends Arac {

	private String kasaTipi;
	
	
	
	
	
	public Araba(String kasaTipi,int hacim,int tet,String vites,String renk)
	{    super(hacim,tet,vites,renk);
	   this.kasaTipi=kasaTipi;
	   System.out.println("Arabın consu");
	}
	
	public String getKasaTipi() {
		return kasaTipi;
	}









	public void setKasaTipi(String kasaTipi) {
		this.kasaTipi = kasaTipi;
	}









	
	

	
	
	
	
	
	
	
	
}
