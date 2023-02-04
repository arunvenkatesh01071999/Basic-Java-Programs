package collection;
import java.util.*;
import java.util.Collection;

public class Hashmapdemo {

	public static void main(String[] args) {
			HashMap hm = new HashMap();
			hm.put("Arun",01);
			hm.put("kumar",11);
			hm.put("Arul",8);
			hm.put("hari",2);
			//System.out.println(hm);
			Set s =hm.keySet();
			//System.out.println("key"+s);
			Collection c=hm.values();
			//System.out.println("value"+c);
			Set s2 = hm.entrySet();
			//System.out.println("key & value"+s2);
			
			Iterator i = s2.iterator();
			
			while(i.hasNext()) {
				
				Map.Entry me =(Map.Entry)	i.next();
				//System.out.println(i.next());
				//System.out.println(me.getKey() +":"+me.getValue());
				if(me.getKey().equals("Arun"))
					//System.out.println(me.getValue());
					me.setValue(100);
				System.out.println(me);
			}
			
			
			
	}

}
