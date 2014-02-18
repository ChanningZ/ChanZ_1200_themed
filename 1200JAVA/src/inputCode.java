import java.util.Scanner;


public class inputCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("please enter your ID number: ");
		String line = scanner.nextLine();
		System.out.println("Soga!! Your ID number is "+ line.length()+" bits.");
	}
}
