package classPackage;

public class Araba {

	String renk;
	int kapasite;
	boolean benzinli;
	boolean calısıyor;
	int hiz;
	
	
	
	public void calıstır(){
		this.calısıyor=true;
		hiz=0;
	
	}
	
	
	public void durdur(){
		this.calısıyor=false;
		hiz=0;
	
	}
	
	public void yolVer(int x){
		hiz+=x;
		System.out.println("Hız istediğiniz oranda arttı..!");
		
	}
	
	public void yolKes(int y){
		if(hiz>y){
		 hiz-=y;
		}
		else{
		System.err.println("Ani duruş yapıyorsunuz!!!!!!!!");
		 hiz=0;
		 
		}
		
	}
	
	
	public void bilgiAl(){
		System.out.println(this.hiz);
		System.out.println(this.calısıyor);
		System.out.println(this.renk);
		System.out.println("Bu arabanın canı cehenneme");
		
	}
	
	
	
	
	
	
}//araba sinifi kapama
