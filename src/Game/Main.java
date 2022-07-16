package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import ReadAFile.Movie;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Movie game!!!!!!!!");
		Movie game1 = new Movie();
		File file = new File(
				"C:\\Users\\neetu\\Desktop\\Pivot Academy\\Week 11_July 9_July 10\\assignment\\movies.txt");
		Scanner sc = new Scanner(file);

		String[] listOfMovies = new String[25];
		while (sc.hasNextLine()) {

			for (int i = 0; i < listOfMovies.length; i++) {

				listOfMovies[i] = sc.nextLine();

			}
		}
		// System.out.println("Array of movies");
		// System.out.println(Arrays.toString(listOfMovies));

		// call method to pick random movie
		String name = game1.pickMovie(listOfMovies);
		// printed the movie name
		// System.out.println("Random Picked Movie!!!!");
		System.out.println("Name =" + name);
		// call method to check the no. of letters in the movie with space.
		// System.out.println("No. of letters of movie =" + game1.checkLetters(name));

		String nameWithoutSpace = name.replace(" ", "");

		char[] nameArray = name.toCharArray();

		// char[] nameArrayWithouSpace = nameWithoutSpace.toCharArray();

		int letterCount = nameWithoutSpace.length();

		// call method to convert names to underscores
		String hiddenName = game1.convertLetterToUnderscore(name);

		char[] hiddenArray = hiddenName.toCharArray();

		boolean guessedletter = false;

		// call method to check whether the letter is present in the letter and if so
		// convert '_' to letter.
		guessedletter = game1.checkGuessLetter(hiddenArray, nameArray, letterCount, name);

		System.out.println("The guessed letter is " + guessedletter);

		sc.close();
	}
}
