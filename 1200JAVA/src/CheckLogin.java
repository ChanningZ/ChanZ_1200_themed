import java.util.Scanner;
public class CheckLogin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the user name: ");
		String username = scanner.nextLine();
		System.out.println("Please enter the passcode: ");
		String passcode = scanner.nextLine();
		if(!username.equals("mr")){
			System.out.println("Illigeal");
		}else if(!passcode.equals("mrsoft")){
			System.out.println("The passcode is wrong.");

		}else{
			System.out.println("Cool, you got it!!!");

		}

	}
}
