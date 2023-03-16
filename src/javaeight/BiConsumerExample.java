package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample
{

	public static void main(String[] args) 
	
	{

		List<Integer> myList=Arrays.asList(1,2,3,4);
		List<Integer> myList2=Arrays.asList(1,2,3,4,5);
		
		BiConsumer<List<Integer>,List<Integer>> myCheck =(list1,list2)->{
			                        if(list1.size() == list2.size())
			                        {
			    	                  System.out.println("true");
			                        }
			                        else
			                        {
			    	                 System.out.println("false");
			                        }
				
		                            };
		        myCheck.accept(myList, myList2);
		}

	}


