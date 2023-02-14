package exceptionn;

public class PasswordException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void password(String pwd)throws PasswordException
	{
		if(pwd.length()<8)
		{
			throw new PasswordException();
		}
		System.out.println("Strong password");
	}
	
}
