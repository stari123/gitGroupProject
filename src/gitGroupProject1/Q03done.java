package gitGroupProject1;
public class Q03done {
	public static void main(String[] args) {
		// 3.Create a 2D array of integer values. Print the sum of
		//all numbers.

		int[][] nums = { { 1,   2,  3,  4,  5 }, 
						 { 10, 11, 12, 13, 14 },
						 { 21, 22, 23, 24, 25 } };
		
		int SumOfAll=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				SumOfAll+=nums[i][j];
				}
		
	}	System.out.println(SumOfAll);
	}}
	//done
     //total=32+35+38+41+44=190

