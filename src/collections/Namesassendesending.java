package collections;

import java.util.Arrays;
public class Namesassendesending {

	public static void main(String[] args) {


		String[] names= {"Arun","kumar","hari","Ajith"};
		ComparaterAssDes comp = new ComparaterAssDes();
		Arrays.sort(names, comp);
		for(String i:names)
			System.out.println(i);
	}

}
