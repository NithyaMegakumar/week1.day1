package week1.day1;

public class factorial {

	public static void main(String[] args) {
		int input = 7;
		int f1 = 1;
		for (int i = 1; i <= input; i++) {
			f1 = f1 * i;
		}
    System.out.println("The factorial of "+input+"  :  "+f1);
	}

}
