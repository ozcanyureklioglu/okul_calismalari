package Ornekler;

public class counstractor {

	String renk;
	int hiz;
	boolean benzinTipi;
	
	
	
	public counstractor(String renk, int hiz, boolean benzinTipi) {
		this.renk = renk;
		this.hiz = hiz;
		this.benzinTipi = benzinTipi;
	}
	
	
	public void bilgiAl(){
		System.out.println("renk: "+renk);
		System.out.println("hiz: "+hiz);
		System.out.println(benzinTipi);
		System.out.println("----------------------");
		
		
	}
	
	
	
	
	
	
}
