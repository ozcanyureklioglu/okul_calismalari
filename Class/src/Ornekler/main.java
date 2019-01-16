package Ornekler;

public class main {

	public static void main(String[] args) {
		
		counstractor araba1=new counstractor("Mavi",5,true);
		
		counstractor araba2=araba1;
		
		araba1.hiz=3;
		araba2.renk="kırmızı";
		
		araba1.bilgiAl();
		araba2.bilgiAl();
		
		
		
		
		
		
	}

}
