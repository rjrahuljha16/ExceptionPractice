package ExceptionHandling;

public class MultipleExceptionUsingSingleCatchBlock {
	public static void main(String[] args) {
		String[] s = { "123", "abc", null, "a2c" };
		for (int i = 0; i < 6; i++) {
			try {
				int a = s[i].length() + Integer.parseInt(s[i]);
				System.out.println("Value of A "+a);

			} catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
				System.out.println(
						"This block will handle all the NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException");
			}
		}

	}

}
