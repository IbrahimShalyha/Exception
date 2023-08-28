package exception;

public class Election {
	public static void main(String[] args) throws AgeException {
		int age = 12;
		try {
			if (age < 18) {
				throw new AgeException("age is not eligible");
			} else {
				System.out.println("Eligible");
			}
		} catch (AgeException a) {
			System.out.println(a.getMessage());

		}
	}
}
