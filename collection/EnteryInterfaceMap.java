package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnteryInterfaceMap {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put("chennai exp",1070);
		hm.put("cheran exp", 1565);
		hm.put("truoati exp",6257);
		//System.out.println(hm);   //key & value thani
		Set s = hm.entrySet();
		System.out.println("before" + s);    //its 3 entry 
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());
			Object o = i.next();
			Map.Entry e =(Map.Entry)o;
		       //System.out.println(e.getKey());
		       //System.out.println(e.getValue());
			Object train =e.getKey();
				Object trainName =e.getValue();
			if(train.equals("chennai exp"))
			{
				//System.out.println(trainName);
				e.setValue(1555);
			}
		}
		System.out.println("After set" + s);
		

	}

}
