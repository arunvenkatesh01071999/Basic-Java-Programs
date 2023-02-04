package stringbufferr;

public class Stringbufferr {

	public static void main(String[] args) {
		
		 Stringbufferr sb = new  Stringbufferr();
		 String[] names= {"arun","kumar","hari","prakash"};
		sb.joinwords(names);
		
	}
		public void joinwords(String[] names) {
			String sentance="";
			StringBuffer b = new StringBuffer("");
			
			StringBuffer c2 = new StringBuffer("Arunkumar");
			c2.insert(0, "V.");
			System.out.println(c2);
			c2.replace(6, 11, "pandi");
			
			System.out.println(c2);
			System.out.println(c2.reverse());
			
			
			for(String s:names) {
				//System.out.println(b.hashCode());
				//sentance = sentance+s;
				b.append(s);
				//System.out.println(sentance.hashCode());
			}
			System.out.println(sentance);
			System.out.println(b);
			
		}
}
