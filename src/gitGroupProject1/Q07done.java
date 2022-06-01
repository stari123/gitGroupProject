package gitGroupProject1;

public class Q07done {

	public static void main(String[] args) {
// 7.Write a java program to check whether a given number is prime or not?
		//A prime number is a number that can only be divided by itself and 1 without remainders.
		//A prime number is a whole number greater than 1 whose only factors are 1 and itself.
		//Another fact to keep in mind is that all PRIMES are ODD numbers except for 2.
		//Prime numbers include: 2,3,5,7,11,13,17,19… and so on. 
		//25 is not prime number becaue it is divisible to 1, 5, 25
		//Any number that is not prime is called a composite number.

		int num=25;
		boolean isPrime=true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime) {
					System.out.println(num+ " is a Prime number");
}
			else {
				System.out.println("No");
}}}
			//problem with 25 fix it later