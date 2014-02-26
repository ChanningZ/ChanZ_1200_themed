
public class CycUtmost {
	public static void main(String[] args) {
		int end=Integer.MAX_VALUE;
		int start=end-50;
		int count=0;
		for(int i=start;i<=end;i++){
			count++;
		}
		System.out.println("the number of iteration is: "+count);
	}
}
