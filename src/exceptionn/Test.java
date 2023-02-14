package exceptionn;

public class Test {

	public static void main(String[] args) {
		PasswordException pe = new PasswordException();
		try {
			pe.password("kumar");
		} catch (PasswordException e) {
			
			System.out.println("to short password");
			
		}

	}

}
