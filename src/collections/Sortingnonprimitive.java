package collections;
import java.util.Arrays;
import java.util.Comparator;

public class Sortingnonprimitive {

	public static void main(String[] args) {

		String[] names= {"Arun","Hari","Prakash","Kumar","Guna"};
		
		Comparator<Object> comp=new Comparaterdemo();
		

		Arrays.sort(names,comp);
		for(String i:names)
			System.out.println(i);
	
	}

}
