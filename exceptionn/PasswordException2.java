
//unchecked la throws thevai illla ( runtime )


package exceptionn;

public class PasswordException2 extends RuntimeException
   {
	
	public void password(String pwd)
	{
		if(pwd.length()<8)
		{
			PasswordException2 pe = new PasswordException2();
			throw pe;
		}
		System.out.println("Strong password");
	}
}
