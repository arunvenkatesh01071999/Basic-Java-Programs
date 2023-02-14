package collection_arraylist;
import java.util.*;


public class Collectiondemo {

	

	public static void main(String[] args) {

		Laptop hp = new Laptop("inspiron",6000,8,true);
		Laptop apple = new Laptop("version13",5000,7,true);
		Laptop vivo = new Laptop("amloud",4000,9,true);
		
		
		ArrayList<Object> laplist=new ArrayList<>();
		laplist.add(apple);
		laplist.add(hp);
		laplist.add(vivo);
		
		System.out.println("before sort"+laplist);
		
		Comparedemo compObj = new  Comparedemo();
		Collections.sort(laplist,compObj);
		System.out.println("after sort"+laplist);
		
	}

}
