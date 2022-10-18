package Interview;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {

		// how to read a file

		File file = new File("C:\\Users\\neetu\\Desktop\\phase-1.txt");
		try (Scanner sc = new Scanner(System.in)) {
			String[] phase = new String[25];

			while (sc.hasNextLine()) {

				for (int i = 0; i < phase.length; i++) {

					phase[i] = sc.nextLine();

				}
			}

			System.out.println(Arrays.toString(phase));
		}

	}

}
