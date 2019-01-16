package ders4;

public class Adres {

	private String Sehir;
	private String ilce;
	private String mah;
	private int no;
	
	
	public Adres(){
		
		
	}
	
	
	public String getAdres(){
	     return Sehir +" "+ilce+" "+mah+" "+no;
	}


	public Adres(String sehir, String ilce, String mah, int no) {
		super();
		Sehir = sehir;
		this.ilce = ilce;
		this.mah = mah;
		this.no = no;
	}





	public String getSehir() {
		return Sehir;
	}


	public void setSehir(String sehir) {
		Sehir = sehir;
	}


	public String getIlce() {
		return ilce;
	}


	public void setIlce(String ilce) {
		this.ilce = ilce;
	}


	public String getMah() {
		return mah;
	}


	public void setMah(String mah) {
		this.mah = mah;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}
	
	 
	
	
	
	
	
	
	
	
}
