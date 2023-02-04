package enumarationss;

public class Actorss {
	
	
	//public enum Actor {
		//AJITH,VIJAY,SURYA
	//}
	
	
	
	
	
	
	Actor a;
	
	public Actorss(Actor a) {
		// TODO Auto-generated method stub
		this.a=a;
	}
	
	
	public static void main(String[] args) {
	
		Actorss obj = new Actorss(Actor.AJITH);
		obj.act();
		
	}
	void act(){
		System.out.println("hi");
	}

	
}
