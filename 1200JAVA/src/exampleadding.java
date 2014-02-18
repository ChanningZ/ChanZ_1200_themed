import java.util.Scanner;
public class exampleadding {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		long number = scan.nextLong();
		
		System.err.println("The number you typed in is: "+number);
		System.out.println("the result of 2 times of it: "+(number<<1));
		System.out.println("the result of 4 times of it: "+(number<<2));
		System.out.println("the result of 8 times of it: "+(number<<3));
		System.out.println("the result of 16 times of it: "+(number<<4));

	}
}
