package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		WordCount wc = new WordCount();
		wc.wordcount();
	}

	private void wordcount() {
		String names="tamil english tamil";
		String[] name=names.split(" ");
		HashMap <String,Integer> Stringcount = new HashMap();
		for(String word:name)
			
		{
			if(Stringcount.containsKey(word))
			{
				Stringcount.put(word,Stringcount.get(word)+1 );
			}
			else
			{
				Stringcount.put(word,1);
			}
		}
         Set<Map.Entry<String,Integer>> se =Stringcount.entrySet();
		
		for(Map.Entry<String,Integer> entry:se) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}

}
