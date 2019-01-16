package ders3;

public class getSet {

	private String renk;
	private String renk2;
	
	
	
	public void setRenk(String renk){
		this.renk=renk;
		
	}
	public String getRenk(){
		return renk;
		
	}
	public void setRenk2(String renk2){
		this.renk2=renk2;
		
	}
	public String getRenk2(){
		return renk2;
		
	}
	
	public void bilgiAl(){
		System.out.println(renk+"\n"+renk2);
	}
	
	
	
	
	
	
	
}
