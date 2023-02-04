//onec run method terminate after main method is call single thread
package multithread;

public class ParentThread2 {
public static void main(String[] args) {
		
	ChildThread2 ct = new ChildThread2();  // intha object same method the call
	                                      //pannum. 
	ct.run();
	for(int i=1;i<5;i++)
	{
		System.out.println("main thread");
	}
	}

	
}
