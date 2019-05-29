package ExceptionHandling;

public class TryCatchBlock {
public static void main(String[] args) {
	try
	{
		int a=100;
		int b=0;
		int d=a/b;
		System.out.println("===="+d);
	}
	catch(Exception e)
	{
		System.out.println("Exception is ");
	}
	finally
	{
		System.out.println("This is finally block and it will execute");
	}
	System.out.println("Outside try catch and finally");
}
}
