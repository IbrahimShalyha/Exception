package exception;

public class Task2 {
	public static void main(String[] args) {

		System.out.println("WELCOME");
		try {
			int num = Integer.parseInt("b");
			System.out.println(num);
//		} catch (NumberFormatException a) {
//			a.printStackTrace();
		} finally {
			System.out.println("PROGRAM END");
		}
	}
}
