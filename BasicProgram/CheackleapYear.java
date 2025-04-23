package BasicProgram;

import java.util.Scanner;

public class CheackleapYear {
	public static void main(String[] args) {

		boolean leap = false;
		System.out.println("enter year to be checked : ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			}
			leap = true;
		} else
			leap = false;
		System.out.println(year + " is a leap year ? " + leap);

	}
}
