package collections;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting_non_primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"Arun","Hari","Prakash","Kumar","Guna"};
		/*Arrays.sort(names);
		for(String i:names)
			System.out.println(i);*/
		
		Comparator comp=new Comparater_demo();
		

		Arrays.sort(names,comp);
		for(String i:names)
			System.out.println(i);
	
	}

}
