import java.util.Scanner;
public class ExampleSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter employee's name: ");
		String name = scan.nextLine();
		System.out.println("enter the language this employee can use:  ");
		String language = scan.nextLine();
		
		switch(language.hashCode()){
			case 3254818:
			case 2301506:
			case 2269730:
				System.out.println(name+" hahaha Big JAVA");
				break;
			case 3104:
			case 2112:
				System.out.println(name+" hahaha Big c#");
				break;
			case -709190099:
			case 955463181:
			case 9745901:
				System.out.println(name+" hahaha Big Asp.net");
				break;
			default:
				System.out.println("Fuck off!!!!");
		}
	}
}
