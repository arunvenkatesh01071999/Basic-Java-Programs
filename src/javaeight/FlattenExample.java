package javaeight;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenExample {

	public static void main(String[] args) {

		List<Integer> oddNumber= Arrays.asList(1,3,5,7,9);
		
		List<Integer> evenNumber= Arrays.asList(2,4,6,8,0);
		
		List<List<Integer>> mergeNumbers=Arrays.asList(oddNumber,evenNumber);
		
		System.out.println(mergeNumbers);
		//out put
		//[[1, 3, 5, 7, 9], [2, 4, 6, 8, 0]]
		List<Integer> myFlatten=mergeNumbers.stream()
								.flatMap(Collection :: stream).toList();
								
		System.out.println(myFlatten);
		//out put
		//[1, 3, 5, 7, 9, 2, 4, 6, 8, 0]
	}

}
