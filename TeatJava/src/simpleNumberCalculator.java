import java.util.InputMismatchException;
import java.util.Scanner;

public class simpleNumberCalculator {
	public static void main(String[] args) {
		System.out.println("insert number");
		Scanner in = new Scanner(System.in);
		// in.close();
		int inserted = 0;
		try {
			inserted = in.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Inserted is not an integer number");
		}
		int copy = inserted;
		for (int i = 2; i <= inserted; i++) {
			while (copy % i == 0) {
				System.out.print(i + ", ");
				copy = copy / i;
			}
		}
	}
}
