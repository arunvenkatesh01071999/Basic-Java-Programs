package collection_arraylist;

import java.util.*;

public class Comparedemo implements Comparator<Object> {

	public int compare(Object v1, Object v2) {
		Laptop s1= (Laptop)v1;
		Laptop s2 = (Laptop)v2;

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
