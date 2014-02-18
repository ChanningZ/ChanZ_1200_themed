import java.util.Scanner;
public class ParityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter an integer: ");
		long number = scan.nextLong();
		String check = (number%2==0)?"even":"odd";//condition?true:false <---[NIUBI!!!]
		System.out.println(check);
	}
}
