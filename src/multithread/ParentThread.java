
//is a multi thread because start method and main method same time call

package multithread;

public class ParentThread {
public static void main(String[] args) {
		
	ChildThread ct = new ChildThread();  // intha object same method the call
	                                      //pannum. 
	ct.start();
	for(int i=1;i<5;i++)
	{
		System.out.println("main thread");
	}
	}

	
}
