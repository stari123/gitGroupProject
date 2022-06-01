package gitGroupProject1;
public class Q05done {
	public static void main(String[] args) {
		// 5.Create a 2D array of integers. Develop a program
		//which will calculate the sum of  even and odd numbers
		//for that array.

		int[][] num = { { 1, 2, 3, 4, 5 }, 
						{ 6, 7, 8, 9, 0 }, 
						{10,11,12, 0, 0 } };
		
		int sumeven = 0;
		int sumodd = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0)
					sumeven+=num[i][j]; 
				else if (num[i][j]%2==1) {
					sumodd+=num[i][j];
				}
			}
		}	
			System.out.println("The sum of even Numbers is "+ sumeven);
			System.out.println("The sum of odd Numbers is "+ sumodd);
		}}
		 
