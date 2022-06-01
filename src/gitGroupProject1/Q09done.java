package gitGroupProject1;

public class Q09done {

	public static void main(String[] args) {
		// 9.Maximum and minimum number in the array?

		int[] array= {5, 28, 36, 1, 14, 56};
		int max=array[0];
		int min=array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) { max=array[i];}
			if(array[i]<min) {min=array[i];}
		}
		System.out.println("The largest element is "+max);
		System.out.println("The smallest element is "+min);
	}
	}
		//done
		//smallest is 1
		//largest is 56
