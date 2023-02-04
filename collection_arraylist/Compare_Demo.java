package collection_arraylist;

import java.util.*;

public class Compare_Demo implements Comparator {

	@Override
	public int compare(Object v1, Object v2) {
		// TODO Auto-generated method stub
		Laptop s1= (Laptop)v1;
		Laptop s2 = (Laptop)v2;
		
//		if(s1.price>s2.price)
//		{
//			return +2;
//		}
//		else if(s1.price<s2.price)
//		{
//			return -1;
//		}
		int result=s1.model.compareTo(s2.model);
		if(result>0) {
			return +1;
		}
		else if(result<0) {
			return -1;
		}
		return 0;
	}

}
