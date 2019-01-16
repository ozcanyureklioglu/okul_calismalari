package ders3;

public class Thsirt {

	public static final int SMALL=0;
	public static final int MEDIUM=1;
	public static final int LARGE=2;
	
	private int tip;
	
	
	
	
	public Thsirt(int tip){
		this.tip=tip;
		
	}
	
	
	public double getFiyat(){
		
		switch (tip) {
		case 0:
			return 12.0;
						
		case 1:
			return 15.0;
			
		case 2:
			return 18.0;
			
		default:
			return 0.00;
			
		}
		
		
	}
	
	
	
	
	public int getTip() {
		return tip;
	}
	
	public void setTip(int tip){
		this.tip=tip;
		
		
	}
	
	
	
	
	
	
	
	
}
