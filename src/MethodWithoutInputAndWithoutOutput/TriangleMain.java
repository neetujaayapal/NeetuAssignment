package MethodWithoutInputAndWithoutOutput;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {

		Triangle tria1 = new Triangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		tria1.base = sc.nextInt();
		System.out.println("Enter the height");
		tria1.height = sc.nextInt();

		tria1.area();
		sc.close();
	}

}
