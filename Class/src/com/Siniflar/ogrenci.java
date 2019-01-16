package com.Siniflar;

public class ogrenci {

	private String isim;
	private String soyad;
	private int no;
	
	
	
	
	
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
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.getNo()==((ogrenci)obj).getNo()){
			return true;
			
			
		}
		else{
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
