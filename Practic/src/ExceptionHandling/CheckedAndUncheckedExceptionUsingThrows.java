package ExceptionHandling;

public class CheckedAndUncheckedExceptionUsingThrows {
	static void uncheckedExceptionMethod()// unchecked exception need not to use throws keyword to throw exception
	{
		String s = null;
		System.out.println(s.length());
	}

	static void checkedExceptionMethod() throws ClassNotFoundException // checked methods need to use throws keyword to
																		// throw exception or need to write that
																		// statement in try catch block.
	{
		Class.forName("randomclass");
	}

	public static void main(String[] args) {
		try {
			uncheckedExceptionMethod();
		} catch (NullPointerException ex) {
			System.out.println("Exception occured " + ex);
		}
		try {
			checkedExceptionMethod();
		} catch (ClassNotFoundException ex) {
			System.out.println("Exception occured " + ex);
		}
	}
}
