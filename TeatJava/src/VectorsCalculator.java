import java.util.Scanner;

public class VectorsCalculator {
	public static void main(String[] args) {
		System.out.println("Insert coordinates");

		System.out.println("first vector");
		Vector vector1 = Vector.readVector();

		System.out.println("second vector");
		Vector vector2 = Vector.readVector();

		System.out.println("vector1 lenght = " + vector1.getVectorLength());

		System.out.println("vector2 lenght = " + vector2.getVectorLength());

		System.out.println(vector1.getVectorAsCoordinates());

//		System.out.println("scalar number =  " + (((vector1.x2 - vector1.x1) * (vector2.x2 - vector2.x1))
//				+ ((vector1.y2 - vector1.y1) * (vector2.y2 - vector2.y1))));
	}
}

class Vector {
	int x1;
	int y1;
	int x2;
	int y2;

	Vector(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public static Vector readVector() {
		Scanner in = new Scanner(System.in);
		System.out.println("x1");
		int x1 = in.nextInt();
		System.out.println("y1");
		int y1 = in.nextInt();
		System.out.println("x2");
		int x2 = in.nextInt();
		System.out.println("y2");
		int y2 = in.nextInt();
		return new Vector(x1, y1, x2, y2);
	}

	public double getVectorLength() {
		Double result = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));

		return result;
	}

	String getVectorAsCoordinates() {
		return "start (" + this.x1 + "," + this.y1 + "), end (" + this.x2 + "," + this.y2 + ")";
	}
}