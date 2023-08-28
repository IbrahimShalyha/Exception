package exception;

public class Task3 {
public static void main(String[]args) {
	System.out.println("WELCOME");
	try {
		String word = "JAVA";
		System.out.println(word.charAt(4));
	}
	catch(IndexOutOfBoundsException a) {
		a.printStackTrace();
		}
	System.out.println("PROGRAM");
}
}
