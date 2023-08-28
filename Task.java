package exception;

public class Task {
	public static void main(String[] args) {
		System.out.println("WELCOME");

		try{int a = 10;
		int b = 0;
		int c = a / b;

		System.out.println(c);
		}
		
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("PROGRAM END");
	}
}
