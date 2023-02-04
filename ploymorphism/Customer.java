package ploymorphism;

//it is a method over loading

public class Customer {

	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.fillform("Arun",3);
		obj.fillform("hari");
	}
	void fillform(String name,int no) {  //same method.
		System.out.println(name +no);
	}
	void fillform(String name) {      //same method.
		System.out.println(name);
	}
	
}
