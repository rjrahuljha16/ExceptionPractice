package ExceptionHandling;

public class TryCatchFinallyReturnValue {

	public static void main(String[] args) {
		System.out.println(returnValue());
	}

	static int returnValue() // if a method have return type then try catch and finally block should return
								// value, if value is return from, finally block then try and catch value will
								// be overridden by finally.
	{
		try {
			return 30;
		} catch (Exception e) // control will not come to catch block as there is no exception caught in try
								// block. If there is exception is caught in try block and finally block is not
								// returning any value then it is mandatory to return the value from try and
								// catch block.
		{
			return 50;
		} finally { // finally block override try and catch block so finally block return value will
					// be printed
			return 100;
		}
	}

}