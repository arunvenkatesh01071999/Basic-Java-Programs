
package exceptionn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	

	public static void main(String[] args) {
			
		ExceptionDemo ed = new ExceptionDemo();
		System.out.println("enter a and b");
		ed.divide();
		ed.add();
	}
	private void add() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= a+b;
		System.out.println(c);
		sc.close();
	}
	

	private void divide() {
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
				int c= a/b;
				System.out.println(c);
				sc.close();
		   }
		catch(ArithmeticException ae)
		{
			System.out.println("check the second number is zero ");
			divide();
		}
		catch(InputMismatchException ime) 
		{
			System.out.println(" string cher tharakudathu ");
			divide();
		}
		catch(Exception e)
		{
			System.out.println(" unknown exception ");
			divide();
		}
		add();
		
		
	}
	

}
