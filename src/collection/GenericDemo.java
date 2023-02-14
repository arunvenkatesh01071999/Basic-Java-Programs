
               //       charecterr count    ///
package collection;

import java.util.HashMap;

public class GenericDemo {

	public static void main(String[] args) {
		String s="hariharan";
		HashMap <Character,Integer> charcount = new HashMap< >();
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
		System.out.println(charcount);
	}

}
