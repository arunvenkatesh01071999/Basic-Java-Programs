package collections;

import java.util.Arrays;
import java.util.Comparator;
public class Names_assen_desending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"Arun","kumar","hari","Ajith"};
		Comparater_ass_des comp =new Comparater_ass_des();
		Arrays.sort(names, comp);
		for(String i:names)
			System.out.println(i);
	}

}
