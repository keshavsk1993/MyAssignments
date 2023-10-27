package week1.day2.assignment;

public class IsPalindrome {

	public static void main(String arg[]) {

		int givenNumber = 121;
		int temproary, s, rem;
		temproary = givenNumber;

		for (s = 0; givenNumber > 0; givenNumber /= 10) {
			rem = givenNumber % 10;
			s = (s * 10) + rem;
		}
		if (s == temproary)
			System.out.println(temproary + " is a palindrome number ");
		else
			System.out.println(temproary + " is not a palindrome number ");

	}
}