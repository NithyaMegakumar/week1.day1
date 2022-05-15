package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean isPrime = false;
		int m= n/2;
		for (int i = 2; i <=n/2; i++) {
			if((n%i)==0)
			{
				isPrime = true;
				break;
			}
		}
		if(!isPrime)
			System.out.println(+n+ " is a prime number");		
				else {
					System.out.println(+n+ " is a not a prime number");
			}
				
			
		}
}




