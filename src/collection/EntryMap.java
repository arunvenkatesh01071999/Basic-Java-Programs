package collection;


import java.util.HashMap;


public class EntryMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm= new HashMap< >();
		hm.put("idly",10);
		hm.put("dosai", 15);
		hm.put("poori",20);
		System.out.println(hm.keySet());
		

	}

}
