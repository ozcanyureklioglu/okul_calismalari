package ders4;

public class ogrenci {

	
	
	private String isim;
	private String soyad;
	private int no;
	
	
	private Adres adres;
	
	
    public ogrenci() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public ogrenci(String isim, String soyad, int no,Adres a) {
		
		this.isim = isim;
		this.soyad = soyad;
		this.no = no;
		this.adres=a;
	}

	public void bilgiAl(){
		System.out.println(adres.getSehir() +" "+adres.getIlce());
		
	}
	
	

	public ogrenci(String isim, String soyad, int no) {
		
		this.isim = isim;
		this.soyad = soyad;
		this.no = no;
	}

	
	
	

	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public Adres getAdres() {
		return adres;
	}


	public void setAdres(Adres adres) {
		this.adres = adres;
	}



	
	public static String al(){
		
		return "3";
	}
	
	
	public enum boy{SMALL,LARGE,MEDIUM};
		
	
	
	
}
