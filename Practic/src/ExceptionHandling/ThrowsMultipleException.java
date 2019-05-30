package ExceptionHandling;

public class ThrowsMultipleException {
	public static void main(String[] args) {
		try {
			methodWithThrows();
		} catch (NullPointerException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception occured " + ex);
		}
		try {
			methodWithThrowsException();
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}

	}

	static void methodWithThrows() throws NullPointerException, NumberFormatException {
		int i = Integer.parseInt("abc"); // This may throws NumberFormatException
		// Statement after this line will not be executed as exception occur and control
		// went to catch block in caller method
		String s = null;
		System.out.println(s.length()); // This may throws NullPointerException
	}

	static void methodWithThrowsException() throws ArithmeticException // after handling Exception from first method ,
																		// control will come to this method.
	{
		int a, b, c;
		a = 10;
		b = 0;
		c = a / b; // this may throws Arithmetic exception
		System.out.println(c);
	}

}
