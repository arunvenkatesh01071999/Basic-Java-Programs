package binding;

public class Staticsize {

	//method over loading
	final void area(float r) {
		System.out.println("circle area is " + 3.14*r);
	}
	final void area(int l,int b) {
		System.out.println("rectangular area is "+l*b);
	}
	
	public static void main(String[] args) {
		
		
		//compile time execution
		Staticsize ss = new Staticsize();
		ss.area(5.5f);
		ss.area(2,5);
	}

}
