package collection;
import java.util.*;
public class Linkedhashlist {
			
		public String toString() {
			return "Abc";
		}
	public static void main(String[] args) {
		Linkedhashlist lhs = new Linkedhashlist();
		LinkedList<Object> ls= new LinkedList< >();
		ls.add(5);
		ls.add(10);
		ls.add(6);
		ls.add(22);
		ls.add(lhs);
		
		System.out.println(ls);
		HashSet<Object> hs=new HashSet<>(ls);
		System.out.println(hs);
	}

}
