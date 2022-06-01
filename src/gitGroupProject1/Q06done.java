package gitGroupProject1;

public class Q06done {

	public static void main(String[] args) {
		// 6.Write a program to swap 2 numbers without a
		//temporary variable?

		int x=5;
		int y=8;
		System.out.println("Before swaping \nx="+x+" " + "\ny="+y );
		
		x=x+y; //13
		y=x-y; //13-8=5
		x=x-y; //13-5=8
		System.out.println("After swaping \nx="+x+" " + "\ny="+y );
		
	}

	
}
