package task;

import java.util.Arrays;

public class Namess {

	public static void main(String[] args) {

		String[] myNames = { "arun", "hari", "sridhar", "vishak", "uno" };
		Namessdemo comp = new Namessdemo();
		Arrays.sort(myNames, comp);
		for (int i = 0; i < myNames.length; i++) {
			System.out.println(myNames[i]);
		}
	}

}
