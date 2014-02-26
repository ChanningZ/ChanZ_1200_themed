
public class CycFilter {
	public static void main(String[] args) {
		String[] array = new String[]{"SB2","SB2","SB3","SB4","SB5"};
		System.out.println("There are a lot of SBs in my garden, KILL the SB2.");
		int SB2Count = 0;
		for(String string: array){
			if(string.equals("SB2")){
				System.out.println("got one!");
				SB2Count++;
				continue;
			}
			System.out.println("search SBs........ get a "+string);
		}
		System.out.println("totally killed: "+SB2Count+" SB2s");
	}
}
