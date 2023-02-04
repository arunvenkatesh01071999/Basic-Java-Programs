package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		MobilesHashMap2 m1=new MobilesHashMap2("vivo",4,8500);
		MobilesHashMap2 m2=new MobilesHashMap2("oppo",6,7500);
		MobilesHashMap2 m3=new MobilesHashMap2("samsung",8,10500);
		
		HashMap hm = new HashMap();
		hm.put(m1,101);
		hm.put(m2,105);
		hm.put(m3,102);
		
		//System.out.println(hm);
		//entry set ah mathanum.
	    Set s =hm.entrySet();
	    Iterator  i=s.iterator();
		
	    while(i.hasNext())
	    {
		    Map.Entry me=(Map.Entry)i.next();
		    //System.out.println(me.getKey());
		    //System.out.println(me.getValue());
	    	
	    	//System.out.println(i.next());
		    
		    Object oKey=me.getKey();
		    Object oValue=me.getValue();
		    MobilesHashMap2 mhm=(MobilesHashMap2)oKey;
		    
		    if(oValue.equals(101))
		    {
		    	//System.out.println(oKey);
		    	//System.out.println(mhm.price);
		    	mhm.price=1111;
		    }
		    System.out.println(hm);
	    }
		
		
		
		
		
	}

}
