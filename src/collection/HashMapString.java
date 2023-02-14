

package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapString {

	public static void main(String[] args) {
			
		String s="hariharan";
		HashMap <Character,Integer> charcount = new HashMap<>();
		char[] ca =s.toCharArray();
		for(char c:ca)
			
		{
			if(charcount.containsKey(c))
			{
				charcount.put(c,charcount.get(c)+1 );
			}
			else
			{
				charcount.put(c,1);
			}
		}
		
		
		Set<Map.Entry<Character,Integer>> se =charcount.entrySet();
		
		for(Map.Entry<Character,Integer> entry:se) {
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
		
		
		
	}

	}


