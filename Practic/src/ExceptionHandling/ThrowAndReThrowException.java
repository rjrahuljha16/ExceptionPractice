package ExceptionHandling;

public class ThrowAndReThrowException {

	public static void main(String[] args) {
		try{
			methodWithThrow();
		
		System.out.println("Control in main method");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Exception is handled which was rethrown from methodWithThrow()");
		}
	}
	static void methodWithThrow() {
		try 
		{
			NumberFormatException ex =new NumberFormatException();  //here NumberFormatException object is created explicitly 
			throw ex; //Exception is thrown 
		} 
		catch (NumberFormatException ne) 
		{
			System.out.println("Explicitly thrown number format exception");
			throw ne; // Exception re-thrown should be handled in the program other wise program will terminate abruptly. 
		}
	}
}
