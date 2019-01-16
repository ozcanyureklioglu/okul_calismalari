package Ornekler;

public class ortalamaHesapla {

	
	
	
	public double hesapla(double... rakamlar){
		
		double toplam=0;
		double sayi=0;
		
		for(double d:rakamlar){
			toplam+=d;
			sayi++;
			
		}
		
		return toplam/sayi;	
			
		
	}
	
}
