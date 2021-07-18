import java.util.Scanner;

public class TrippleCalc {

	public static void main(String[] args) {
		new tripleCharsCalculator().calculateTripleChars();
	}
}

class tripleCharsCalculator {

	void calculateTripleChars() {
		String insertedString = this.readString();
		int tripleCharsCounter = 0;
		int numberSumm = 0;

		for (int i = 0; i < insertedString.length(); i++) {
			if (i >= 2 && (insertedString.charAt(i) == insertedString.charAt(i - 1))
					&& (insertedString.charAt(i - 1) == insertedString.charAt(i - 2))) {
				tripleCharsCounter++;
			}

			if (Character.isDigit(insertedString.charAt(i))) {
				numberSumm += Character.getNumericValue(insertedString.charAt(i));
			}
		}
		System.out.println("nuber of tripples = " + tripleCharsCounter);
		System.out.println("summ of all numbers in string = " + numberSumm);
	}

	String readString() {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert string");

		String readedLine = in.nextLine();
		in.close();
		return readedLine;
	}

}
