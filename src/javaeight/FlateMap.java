package javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlateMap {

	public static void main(String[] args) {
		
		List<List<Integer>> myList = new ArrayList<>();
		
		myList.add(Arrays.asList(1,2));
		myList.add(Arrays.asList(1,2));
		myList.add(Arrays.asList(1,2));
		
		List<Integer> secondList=myList.stream()
									.flatMap(Collection :: stream).toList();
									
		System.out.println(secondList);
	}

}
