package exception;

public class Task4 {
public static void main(String[]args) {
	System.out.println("WELCOME");
	
	try {
		int[] num = {10,20,30,40};
		System.out.println(num[6]);
	}
	catch(IndexOutOfBoundsException a) {
		a.printStackTrace();
	}
	System.out.println("PROGRAM END");
}
}
