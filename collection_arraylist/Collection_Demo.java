package collection_arraylist;
import java.util.*;


public class Collection_Demo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop hp = new Laptop("inspiron",6000,8,true);
		Laptop apple = new Laptop("version13",5000,7,true);
		Laptop vivo = new Laptop("amloud",4000,9,true);
		
		
		ArrayList laplist=new ArrayList();
		laplist.add(apple);
		laplist.add(hp);
		laplist.add(vivo);
		
		System.out.println("before sort"+laplist);
		
		Compare_Demo comp_demo = new  Compare_Demo();
		Collections.sort(laplist,comp_demo);
		System.out.println("after sort"+laplist);
		
	}

}
