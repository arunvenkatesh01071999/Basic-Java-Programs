package collection_arraylist;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(5);
		al.add(5);
		al.add(2);

		System.out.println("al "+al);
		al.set(0, "Arul");
		System.out.println("al "+al);
		System.out.println("al "+al.lastIndexOf(5));

		ArrayList al2 = new ArrayList();
		al2.add("arun");
		al2.add("kumar");
		System.out.println(al2.contains("Arun"));
		System.out.println("al2 before copy"+al2);
		al2.addAll(al);
		System.out.println("al2 after copy"+al2);
		System.out.println(al2.get(0));
		
		al2.removeAll(al);
		System.out.println(al2);
	}

}
