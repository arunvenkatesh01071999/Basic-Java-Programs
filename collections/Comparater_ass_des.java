package collections;

import java.util.Comparator;

public class Comparater_ass_des implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2=(String)o2;
		int result=s1.compareTo(s2);
		if(result>0)
			return +2;
		else if(result<0)
			return -3;
		else
		return 0;
	}

}
