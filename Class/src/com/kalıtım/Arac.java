package com.kalıtım;

public class Arac {

	private int motorHacmi;
	private int tekerlekSayisi;
	private String vitesTipi;
	private String renk;
	
	
	


	public Arac(int motorHacmi, int tekerlekSayisi, String vitesTipi, String renk) {
		super();
		this.motorHacmi = motorHacmi;
		this.tekerlekSayisi = tekerlekSayisi;
		this.vitesTipi = vitesTipi;
		this.renk = renk;
		System.out.println("Aracın consu");
	}


	public int getMotorHacmi() {
		return motorHacmi;
	}


	public void setMotorHacmi(int motorHacmi) {
		this.motorHacmi = motorHacmi;
	}


	public int getTekerlekSayisi() {
		return tekerlekSayisi;
	}


	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi;
	}


	public String getVitesTipi() {
		return vitesTipi;
	}


	public void setVitesTipi(String vitesTipi) {
		this.vitesTipi = vitesTipi;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
