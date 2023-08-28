package exception;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("WELCOME");

		try {
			String word = null;
			String value = "JAVA";
			System.out.println(word.toUpperCase());
		} catch (NullPointerException b) {
			b.printStackTrace();
		}
		System.out.println("PROGRAM END");
	}
}
