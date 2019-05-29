package ExceptionHandling;

public class NestedTryCatch 
{
	public static void main(String[] args) 
	{
		String[] s = { "abc", "123", "asd", null, "32" };
		for (int i = 0; i < 6; i++) 
		{
			try 
			{
				int a = s[i].length();
				System.out.println("Length of array " + a);

				try 
				{
					int b = Integer.parseInt(s[i]);
					System.out.println(" Value inside String Array " + b);
				} 
				catch (NumberFormatException nfe) 
				{
                 System.out.println("Number format exception ");
				}
			} 
			catch (NullPointerException | ArrayIndexOutOfBoundsException ex) 
			{
				System.out.println("Null pointer exception occured");
			}
		}
	}
}
