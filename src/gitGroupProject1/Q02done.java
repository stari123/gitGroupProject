package gitGroupProject1;

import java.util.Scanner;

public class Q02done {

	public static void main(String[] args) {
		// 2.Using Scanner create an array of countries. When an
		//array is created, retrieve all values from it and while
			//retrieving those values print capital for each country.
			//(use 2 different loops).

int num = 3;
		
		Scanner inp=new Scanner(System.in);
		String [][]country = {
				
				{"Afghanistan", "USA", "Turkey"},
				{"Kabul", "Washington", "Istanbul"}
		};
		for (int row=0; row<country.length; row++) {
			for (int col=0; col<country[row].length; col++) {
				System.out.println(country[row][col]+" ");
			}
			System.out.println();
		}
	
			

}}
