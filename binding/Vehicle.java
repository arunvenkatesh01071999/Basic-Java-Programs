package binding;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bc = new Bike();
		bc.speed();
		
		 bc = new Car();//same object so it is dynamic binding
		bc.speed();
		
		
		
	}

}
