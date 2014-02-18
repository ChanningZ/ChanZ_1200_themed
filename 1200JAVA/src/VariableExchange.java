import java.util.Scanner;
public class VariableExchange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the fucking variable A's value: ");
		long A = scan.nextLong();
		System.out.println("Please enter the fucking variable B's value: ");
		long B = scan.nextLong();
		System.out.println("A="+A + "\tB="+B);
		System.out.println("execute the variable exchanging.....");
		A=A^B;
		B=B^A;
		A=A^B;
		System.out.println("A="+A + "\tB="+B);
	}
}
