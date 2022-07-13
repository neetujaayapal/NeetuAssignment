package Game;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class MovieGame {

	Scanner sc = new Scanner(System.in);

	public boolean checkGuessMovie(String name) {

		System.out.println("No. of letters of movie with space =" + name.length());
		String nameWithoutSpace = name.replace(" ", "");
		char[] nameArray = nameWithoutSpace.toCharArray();
		int letterCount = nameWithoutSpace.length();
		System.out.println("No. of letters of movie without space =" + letterCount);
		String hiddenName = name.replaceAll("[a-zA-Z]", "_");
		System.out.println(hiddenName);

		char[] hiddenArray = hiddenName.toCharArray();

		int wrongAttempts = 0;

		while (hiddenArray != nameArray && letterCount > 0 && wrongAttempts < 10)

		{

			System.out.println("Enter the guess letter");

			String guessLetter = sc.next();

			if (name.contains(guessLetter)) {

				System.out.println("This letter is in the movie");

				for (int index1 = name.indexOf(guessLetter); index1 >= 0; index1 = name.indexOf(guessLetter,
						index1 + 1)) {
					System.out.println("Index =" + index1);

					hiddenArray[index1] = name.charAt(index1);
					letterCount--;
				}

				System.out.println(hiddenArray);

			}

			else {

				System.out.println("You have guessed Wrong Letter  ");
				wrongAttempts++;

			}

		}
		if (letterCount == 0) {

			System.out.println("You got the movie");
			return true;
		}
		if (wrongAttempts == 10) {
			System.out.println("All attempts tried. Game Over");
		}
		return false;

	}

}
