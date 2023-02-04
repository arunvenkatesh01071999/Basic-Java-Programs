package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class EntryMap {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put("idly",10);
		hm.put("dosai", 15);
		hm.put("poori",20);
		//System.out.println(hm);
		//Set s = hm.entrySet();
		//System.out.println(s);
		//Collection c = hm.values();
		//System.out.println(c);
		System.out.println(hm.keySet());
		

	}

}
