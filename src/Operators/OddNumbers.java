package Operators;

public class OddNumbers {

	public static void main(String[] args) {
		System.out.println("Odd Numbers");
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
		
				System.out.println(+i);
			}
		}
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				//System.out.println("Even Numbers");
				System.out.println(+i);
			}
		}
	}
}
