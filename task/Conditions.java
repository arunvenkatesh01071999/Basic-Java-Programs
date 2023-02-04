package task;
import java.util.Scanner;



//then find values of the following expressions:
//a. x == 2
//b. x != 5
//c. x != 5 && y >= 5
//d. z != 0 || x == 2
//e. !(y < 10)


public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		System.out.println("enter three numbers");
		Scanner objj = new Scanner(System.in);
		x=objj.nextInt();
		y=objj.nextInt();
		z=objj.nextInt();
		
		if(x == 2) {
			System.out.println("X is equal to two");
			
		if(x != 5) {
			System.out.println("X is not equal to five");
			
		if(x != 5 && y >= 5) {
			System.out.println("X is not equal to five y greater than five");
			
		if(z != 0 || x == 2) {
			System.out.println("X is equal to 2 and z not a zero");
			
		if(!(y < 10) ){
				System.out.println("y greater than 10");
			}
		}
		}
		}
		
		}
		 
		
	

	}	
	}


