package ExceptionHandling;

public class ThrowsException {
	public static void main(String[] args){
		
		try{
			methodWithThrows();     
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured " +ex);
		} 
		
	}
  static void methodWithThrows() throws NullPointerException  //Exception is thrown using throws keyword
  {
	  String s= null;
	  System.out.println(s.length()); //Null pointer Exception will occur here and it will be throws the exception to caller method
	  
  }
}
