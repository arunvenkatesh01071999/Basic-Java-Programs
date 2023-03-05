package sridhar;

import java.util.ArrayList;
import java.util.Iterator;

public class Employedemo {

	public static void main(String[] args) {

			Employee labour1 =new  Employee("AT001","SridharNagar",10000);
			Employee labour2 = new Employee("AT002","ArunVenkatesh",20000);
			Employee labour3 =new  Employee("AT003","hariVishnu",30000);
			
			ArrayList<Object> myList=new ArrayList< >();
			
			myList.add(labour1);
			myList.add(labour2);
			myList.add(labour3);
			
			
			Iterator<Object> i =myList.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			
			
			
	}

	

	

}
