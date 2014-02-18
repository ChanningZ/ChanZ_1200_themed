import java.io.FileNotFoundException;
import java.io.PrintStream;
public class RedirectOutputStream {
	public static void main(String[] args) {
		try{
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("the initial value of age is 18");
			String gender = "female";
			System.out.println("the initial value of gender is female");
			
			String info = "this "+ gender+" should be "+ age + " years old.";
			System.out.println("merge these two variables to info, the result shoud be: "+info);
			System.setOut(out);
			System.out.println("done!!! Check out the log.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}
}
