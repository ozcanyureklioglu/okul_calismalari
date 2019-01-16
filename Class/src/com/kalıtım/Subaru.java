package com.kalıtım;

public class Subaru extends Araba {

	
	private String tip;

	
	
	public Subaru(String tip,String kasaTipi,int hacim,int tet,String vites,String renk){
		super(kasaTipi,hacim,tet,vites,renk);
		this.tip=tip;
		System.out.println("Subaru consu");
		
		
		
	}
	
	
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
	
	
	
	
	
}
