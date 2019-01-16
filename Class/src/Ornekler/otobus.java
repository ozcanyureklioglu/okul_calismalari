package Ornekler;

public class otobus {

	int kapasite;
	int kaydedilenYolcu;
	String nerden;
	String nereye;
	boolean aktif;
	
	public void yolcuAl(){
		if(aktif){
			kaydedilenYolcu++;
			if(kaydedilenYolcu==kapasite){
				System.out.println("Otobus doldu!!!");
				
			}
		}
		else{
			System.out.println("Otobus garajda. :(");
		}
	}
	
	
	public void yolcuCikar(){
		kaydedilenYolcu--;
		
		
	}
	
	
	public void bilgiAl(){
		System.out.println("Kapasite: "+kapasite);
		System.out.println("Yolcu: "+kaydedilenYolcu);
	}
	
}
