package task;

import java.util.ArrayList;
import java.util.Collections;

public class MobileAssen {

	public static void main(String[] args) {
		Mobiles samsung = new Mobiles("a30s", 4, 64, 12000);
		Mobiles vivo = new Mobiles("a20", 6, 128, 10500);
		Mobiles oppo = new Mobiles("f15", 8, 64, 11000);

		ArrayList<Object> mobilelist = new ArrayList<>();

		mobilelist.add(samsung);
		mobilelist.add(vivo);
		mobilelist.add(oppo);

		AssendingDemo compObject = new AssendingDemo();

		Collections.sort(mobilelist, compObject);

		System.out.println(mobilelist);

	}

}
