package collection;

import java.util.TreeMap;
public class Treemapp {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(1, "Arun");
		tm.put(2, "Ajith");
		tm.put(01, "Arun");
		TreeMap tm2 = new TreeMap();
		tm2.putAll(tm);
		System.out.println(tm2);
	}

}
