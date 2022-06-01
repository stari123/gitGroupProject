package gitGroupProject1;

public class Q08fibonacciDone {

	public static void main(String[] args) {
		// 8.Write a Java Program to print the first 10 numbers of
		//Fibonacci series.
		//0+1+1+2+3+5+8+13+....addition of two numbers give the next number

		int a=0;
		int b=1;
		int c;
		
		for (int i=0; i<10; i++)
		{
		System.out.print(a +" ");
		c=a+b;
		a=b;
		b=c;
		}
	}
}
