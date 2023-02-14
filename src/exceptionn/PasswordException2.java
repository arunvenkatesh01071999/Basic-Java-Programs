
package exceptionn;

public class PasswordException2 extends RuntimeException
   {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void password(String pwd)
	{
		if(pwd.length()<8)
		{
			throw new PasswordException2();
		}
		System.out.println("Strong password");
	}
}
