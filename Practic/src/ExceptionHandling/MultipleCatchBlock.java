package ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		String[] s= {"abc","123","abc",null,"xyz"};
		for(int i=0; i<6; i++)
		{
			try {
				int a = s[i].length() + Integer.parseInt(s[i]);  
				System.out.println(a);
				
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Exeception occured Number Format Exception");
				//nfe.printStackTrace();
				System.out.println();
			}
			catch(ArrayIndexOutOfBoundsException ai)
			{
				System.out.println("Exeception occured Array Index OutOfBoundsException");

			//	ai.printStackTrace();
				System.out.println(ai);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Exeception occured Null Pointer Exception");

				//npe.printStackTrace();
				System.out.println(npe);
			}
			System.out.println("After executing each respective block this code will execute");

		}

	}
}
