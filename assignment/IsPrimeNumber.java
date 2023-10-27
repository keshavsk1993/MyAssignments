package week1.day2.assignment;

public class IsPrimeNumber {

	public static void main(String args[]) {
		int i, m = 0, flag = 0;
		int givenNumber = 23;
		m = givenNumber / 2;
		if (givenNumber == 0 || givenNumber == 1) {
			System.out.println(givenNumber + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (givenNumber % i == 0) {
					System.out.println(givenNumber + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(givenNumber + " is prime number");
			}
		}
	}
}
