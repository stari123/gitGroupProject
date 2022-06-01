package gitGroupProject1;

public class Q10done {

	public static void main(String[] args) {
		// 10. Write a java program to find the SECOND largest
		//number in the array?

		int[] array= {5, 28, 36, 1, 14, 56};
		int largest=0;
		int secondlargest=0;
				
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) { 
			secondlargest=largest;
				largest=array[i];
			}else if (array[i]>secondlargest) {
				secondlargest=array[i];
	}
		}	
		System.out.println("The 2nd largest element is " +secondlargest);
		
}
}