package ExceptionHandling;

public class TryCatchWithMethod {
	public static void main(String[] args) {
		try {
			addation();
		}
		catch(Exception e)   
		{
			System.out.println("**Exception** " +e);
		}
		
	}
  static void addation()
	{
		int a,b,c;
		a=10;
		b=0;
		try {
			c=a/b; //Exception arise here but is handled in main block
			System.out.println("This will not execute");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("***Exception will be not be catch here***");
		}
	}

}
