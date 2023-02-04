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
	double unit_price=100d;
	double total_amount;
	
	Scanner objs = new Scanner(System.in);
	unit=objs.nextDouble();
	System.out.println(unit +"  customer quentity");
	
	total_amount=unit*unit_price;  //1 unit=100
	
	if(total_amount>1000) {
		double discount =total_amount*0.10;
		total_amount=total_amount-discount;
		System.out.println(total_amount +"owr discount with price");
	}
	else {
		System.out.println(total_amount +"you have no discount");
	}
	
}
}
