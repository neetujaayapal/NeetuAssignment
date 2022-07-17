package Game;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class MovieGame {

	// method to pick random movie
	public String pickMovie(String[] listOfMovies) {

		Random rand = new Random();
		int index = rand.nextInt(listOfMovies.length);
		return listOfMovies[index];

	}

	// method to check the letters in the movie
	public int checkLetters(String name) {

		return name.length();

	}

	// method to convert letters to underscore
	public String convertLetterToUnderscore(String name) {

		return name.replaceAll("[a-zA-Z]", "_");
	}

	// method to check the whether guessletter is present in the letter or not.
	public boolean checkGuessLetter(char[] hiddenArray, char[] nameArray, int letterCount, String name) {

		Scanner input = new Scanner(System.in);

		int wrongAttempts = 0;

		String wrongLetters = "";

		String rightLetters = "";

		while (hiddenArray != nameArray && letterCount > 0 && wrongAttempts < 10)

		{

			System.out.println("Enter any guess letter");

			String guessLetter = input.next();

			if (name.contains(guessLetter) && letterCount > 0) {

				if (rightLetters.contains(guessLetter)) {
					System.out.println("This letter was already tried");
				} else {
					System.out.println("This letter is in the movie");

					for (int index1 = name.indexOf(guessLetter); index1 >= 0; index1 = name.indexOf(guessLetter,
							index1 + 1)) {
						System.out.println("Index =" + index1);

						hiddenArray[index1] = name.charAt(index1);

						letterCount--;

						rightLetters = rightLetters + guessLetter;
					}
				}

				System.out.println(hiddenArray);// (continue until hiddenArray == nameArray)

			}

			else {

				if (wrongLetters.contains(guessLetter)) {

					System.out.println("Letter already tried");
				}

				else { // (hiddenArray == nameArray)

					System.out.println("You have guessed Wrong Letter" + (wrongAttempts + 1) + "times");
					wrongAttempts++;
					wrongLetters = wrongLetters + guessLetter;

				}

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