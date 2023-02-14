package task;

import java.util.Comparator;

public class Namessdemo implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o1;
		if (s1.length() > s2.length()) {
			return -2;
		}
		if (s1.length() < s2.length()) {
			return 2;
		} else
			return 0;
	}

}
