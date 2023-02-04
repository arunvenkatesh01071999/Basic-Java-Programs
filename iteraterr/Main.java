package iteraterr;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList names = new ArrayList();
		names.add("Arun");
		names.add("hari");
		names.add("prakash");
		names.add(3);
		System.out.println(names);
		
		Iterator i = names.iterator();
		
				
		while(i.hasNext())//has next is a values checking 
		{  
			System.out.println(i.next()); //is a printing values
			i.remove();//remove all the element in a array
		}
		System.out.println(names);	
		
	}

}
