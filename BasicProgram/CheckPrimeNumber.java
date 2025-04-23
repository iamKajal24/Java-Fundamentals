package BasicProgram;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		int num = 7;
		if (num <= 1) {
			System.out.println("number is not prime number");
			return;
		}

		boolean isPrime = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("number is prime number");
		} else {
			System.out.println("number is not prime number");
		}
	}

}
