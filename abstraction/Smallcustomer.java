package abstraction;

public class Smallcustomer extends Customer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smallcustomer obj = new Smallcustomer();
		
		obj.bill();
		obj.pay();
	}
	
	void bill() {
		System.out.println("bill");
	}

}




