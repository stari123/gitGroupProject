package gitGroupProject1;

public class Q11done {

	public static void main(String[] args) {
		// 11. Write a program to print out duplicate elements from
		//an Array of Strings?
		//BRUTE FORCE
		int[] array= {1,2,2,5,8,8,9,12,12};
 
		for (int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}
