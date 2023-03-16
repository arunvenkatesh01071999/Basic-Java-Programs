package javaeight;

public class FunctionInterface {

	interface Myinterface{
		
		void run();//only one abstract method having 
		
		default void walk() {
			System.out.println("my default method");
		}
		static void walk2() {
			System.out.println("my static methode");
		}
	}
}