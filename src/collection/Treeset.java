package collection;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(5);
		ll.add(10);
		ll.add(4);
		ll.add(20);
		System.out.println(ll);
		TreeSet<Integer> ts = new TreeSet<>(ll);
		System.out.println(ts);
	}

}
