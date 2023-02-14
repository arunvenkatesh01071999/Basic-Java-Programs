package abstraction;

public class Smallcustomer extends Customer{

	public static void main(String[] args) {
		Smallcustomer obj = new Smallcustomer();
		
		obj.bill();
		obj.pay();
	}
	
	@Override
	void bill() {
		System.out.println("bill");
	}

}




