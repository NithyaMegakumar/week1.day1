package week1.day1;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int firstNum=0;int n=8;int secNum=1;int sum;
		// System.out.println("First number   :"+firstNum);
		for (int i = 1; i <= n; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;	
			System.out.print(" "+sum);
		}

	}

}
