package ders3;

public class Personal {

	private String ad;
	private String departman;
	private int yas;
	
	static int sayac;
	
	public Personal(){
		
		
	}



	public Personal(String ad, String departman, int yas) {
		sayac++;
		this.ad = ad;
		this.departman = departman;
		this.yas = yas;
	}


	
	public static int nesneSayici(){
		return sayac;
		
	}
	

	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getDepartman() {
		return departman;
	}



	public void setDepartman(String departman) {
		this.departman = departman;
	}



	public int getYas() {
		return yas;
	}



	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	
	
	
	
	
}
