package enumarationss;

public class Actorss {
	
	Actor a;
	
	public Actorss(Actor a) {
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
