import java.util.ArrayList;
import java.util.List;
public class UseForeach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abd");
		list.add("def");
		list.add("hij");
		list.add("klm");
		list.add("nop");
		list.add("qrs");
		System.out.print("Foreach index: \n\t");
		for(String string:list){
			System.out.print(string);
		}
		System.out.println();
		String[] strs=new String[list.size()];
		list.toArray(strs);
		System.out.println("foreach index array: \n\t");
		for(String string:strs){
			System.out.println(string);
		}
	}
}
