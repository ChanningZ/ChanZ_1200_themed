import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string of letters or numbers: ");
		String password = scan.nextLine();
		char[] array=password.toCharArray();
		for(int i=0;i<array.length;i++){
			array[i]=(char)(array[i]^1);
		}
		System.out.println("I cannot input Chinese as the way the book showed, but the fucking result is: ");
		System.err.println(array);
	}
}
