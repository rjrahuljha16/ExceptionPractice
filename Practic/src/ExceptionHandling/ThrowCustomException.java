package ExceptionHandling;

import java.util.Scanner;

public class ThrowCustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();// taking age as input and if it is less then zero it will throw exception
		try {
			if (age < 0) {
				throw new AgeIsNegativeException("Age cannot be negative"); // throwing exception and creating the
																			// object using new keyword explicitly.
			}
		} catch (AgeIsNegativeException ex) {
			System.out.println(ex);
		}

	}

}
