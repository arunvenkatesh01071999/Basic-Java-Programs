package javaeight;



public class LambdaExpression {

	public static void main(String[] args) 
	{
		Runnable myRunnable=()->System.out.println("thread 1");
		
		new Thread(myRunnable).start();
		
		
		new Thread(()->{
			
			System.out.println("thread 2");
			System.out.println("thread 3");
		}).start();
		
		
	}

}
