
public class BreakCyc {
	public static void main(String[] args) {
		System.out.println("\n-------example of single iteration's interruput------ ");
		//initiate the array
		String[] array = new String[] {"SB1","SB2","SB3","SB4","SB5","SB6","SB7"};
		System.out.println("what is the # of the SB before you found out the first SB?");
		
		for(String string:array){
			if(string.equals("SB2"))
				break;
			System.out.print("these are: "+ string+ "       ");
			
		}
		
		System.out.println("\n-------example of double iteration's interruput------ ");
		int[][] myScore = new int[][]{{67,78,63,22,66},{55,68,78,95,44},{95,97,92,93,81}};
		System.out.println("kid's score: \n math\t Chinese\t English\t FineArt\t History\t");
		No1: for(int[] is: myScore){
			for(int i:is){
				System.out.println(i+ "\t");
				if(i<60){
					System.out.println("\n etc, what is the "+i+" one which is lower than 60? Why");
					break No1;
				}
			}
			System.out.println();
			
		}
	}
}
