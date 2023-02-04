package exceptionn;

public class PasswordException extends Exception{

	public void password(String pwd)throws PasswordException
	{
		if(pwd.length()<8)
		{
			PasswordException pe = new PasswordException();
			throw pe;
		}
		System.out.println("Strong password");
	}
	
}
