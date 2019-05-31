package ExceptionHandling;
//Creating our own Exception 
public class AgeIsNegativeException extends Exception  //User defined exceptions must extend any one of the classes in the hierarchy of exceptions.
{
	String errorMessage;
	public AgeIsNegativeException(String errorMessage)
	{
		this.errorMessage=errorMessage;
	}
	
	public String toString() //Modifying toString() to display Customized Exception message.
	{
		return errorMessage;
	}

}
