package gitGroupProject1;
public class Q04done {
	public static void main(String[] args) {
		// 4.Create a 2D array or integer type where you will store
		//odd and even numbers. Develop a program which will
		//identify/print the even numbers only.

		int[][] a = { { 1,   2,  3,  4,  5 }, 
				 		 { 10, 11, 12, 13, 14 },
				 		 { 21, 22, 23, 24, 25 } };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]%2==0)
				System.out.print(a[i][j]+" ");
		}
}			

}}		
	


