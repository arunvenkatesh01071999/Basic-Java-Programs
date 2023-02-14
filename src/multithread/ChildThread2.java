package multithread;

public class ChildThread2 extends Thread {

	
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println("child thread thread");
		}
		
	}
}
