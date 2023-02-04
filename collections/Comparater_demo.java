package collections;
import java.util.Comparator;

public class Comparater_demo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String) o1;
		String s2=o2.toString();//type casting object to string.
		
		if(s1.length()>s2.length()) {
			return +2;
		}
		else if(s1.length()<s2.length()) {
			return -20;
		}
		else
			return 0;
		
	}

}
