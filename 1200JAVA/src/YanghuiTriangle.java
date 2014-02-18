
public class YanghuiTriangle {
	public static void main(String[] args) {
		int triangle[][] = new int[8][];//initial this 2D array with 8 rows.
		for(int i =0; i < triangle.length;i++){
			triangle[i]=new int[i+1];//initial this 2D array. and every row gets different length.
			/*this is calculating every row's value*/
			for(int j=0;j<triangle[i].length-1;j++){
				if(i==0||j==0||j==triangle[i].length-1){
					triangle[i][j]=1;//first and last element in every row is 1
				}else{
					triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];// 
				}
				System.out.print(triangle[i][j]+"\t"); //same row, don't need jump to another line. NO PRINTLN
			/*the end*/
			}
			System.out.println();

		}
	}
}
