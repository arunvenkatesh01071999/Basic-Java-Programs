package task;
import java.util.Scanner;



//A shop will give discount of 10% if the
//cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.


public class IFcondition {
	
public static void main(String []args) {
	
	System.out.println("enter the quantity unit");
	double unit;
	double unitPrice=100d;
	double totalAmount;
	
	Scanner objs = new Scanner(System.in);
	
	unit=objs.nextDouble();
	objs.close();
	System.out.println(unit +"  customer quentity");
	
	totalAmount=unit*unitPrice;  //1 unit=100
	
	if(totalAmount>1000) {
		double discount =totalAmount*0.10;
		totalAmount=totalAmount-discount;
		System.out.println(totalAmount +"owr discount with price");
	}
	else {
		System.out.println(totalAmount +"you have no discount");
	}
	
}
}
