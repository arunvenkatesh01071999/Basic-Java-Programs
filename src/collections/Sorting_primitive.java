package collections;

import java.util.*;
public class Sorting_primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,9,5,3,6,8};
		
		//array value is normal printing method using foreach loop
		System.out.println("before sorting");
		
		for(int i:arr)
			System.out.print(i);
		
		System.out.println(" ");
		System.out.println("after sorting");
		
		Arrays.sort(arr);//sorting method for array assending order.
		for(int i:arr)
			System.out.print(i);
		
		
	}

}
