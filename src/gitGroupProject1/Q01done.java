package gitGroupProject1;

import java.util.Scanner;

public class Q01done {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After
		//the array is created, calculate the sum of all stored
		//elements in that array.

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=input.nextInt();
		int array[]=new int[num];
		int sum=0;
		System.out.println("enter the integers");
		for(int i=0; i<num; i++) {
		array[i]=input.nextInt();
		}
		//System.out.println("array");
		
		for (int i=0; i<array.length; i++) {
		//System.out.print(array[i]+" ");
		
		//System.out.println("Sum of array elements is:");
		
		sum=sum+array[i];
		}
		System.out.println("sum is = "+sum);
		
	}}	//done


