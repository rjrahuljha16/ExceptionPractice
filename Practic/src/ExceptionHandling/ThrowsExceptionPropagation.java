package ExceptionHandling;

public class ThrowsExceptionPropagation {
	static void methodOne() //throws NumberFormatException //NullPointerException
	{              //NullPointerException is propagated here
		String s=null;  //NullPointerException occur here 
		System.out.println(s.length());
	}
	static void methodTwo()// throws ArithmeticException 
	{
		methodOne();  //NullPointerException is propagated here
	}
	static void methodThree()// throws NumberFormatException
	{
		methodTwo(); //NullPointerException is propagated here
	}
	public static void main(String[] args) {
		try
		{
			methodThree();
		}
		catch(NullPointerException ex)
		{
			System.out.println("Exception occured "+ex);
		}
	}

}
