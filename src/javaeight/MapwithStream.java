package javaeight;

import java.util.ArrayList;
import java.util.List;


public class MapwithStream {

	public static void main(String[] args) 
	{

			ArrayList<String> myFruites= new ArrayList<>();
			
			myFruites.add("mango");
			myFruites.add("orange");
			myFruites.add("pineApple");
			myFruites.add("mango");
			System.out.println("my list of fruites"+myFruites);
						
	List<Integer> myList = myFruites.stream()
			               .map(String ::length).toList();
			              
			System.out.println(myList);
			
		
	}
	MapwithStream(){
		super();
	}

}
