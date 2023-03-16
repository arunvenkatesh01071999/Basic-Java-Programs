package javaeight;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinList {

	public static void main(String[] args) 
	{
		//remove duplicate...
		
		List<Integer> myList = List.of(1,2,3,3,4,5,5,6,6,7);
		
		Set<Integer> mySet =new  HashSet<>();
		
		for(Integer newList :myList)
		{
			mySet.add(newList);
		}
		System.out.println(mySet);
	}

}
