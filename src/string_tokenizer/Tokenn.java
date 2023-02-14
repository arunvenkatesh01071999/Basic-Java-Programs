package string_tokenizer;

import java.util.StringTokenizer;

public class Tokenn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//print defending dot and dot also print
		StringTokenizer st = new StringTokenizer("www.bookmyshow.com",".",true);
		
		//StringTokenizer st = new StringTokenizer("Arun kumar");
		//counting the string
		//System.out.println("count of string  " +st.countTokens());
		
		while(st.hasMoreTokens()) {//checking the string return boolean
			System.out.println(st.nextToken());//print the string
		}
			
		
		
	}

}
