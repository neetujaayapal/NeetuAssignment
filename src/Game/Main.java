package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		MovieGame game1 = new MovieGame();
		File file = new File(
				"C:\\Users\\neetu\\Desktop\\Pivot Academy\\Week 11_July 9_July 10\\assignment\\movies.txt");
		Scanner sc = new Scanner(file);

		String[] listOfMovies = new String[25];
		while (sc.hasNextLine()) {

			for (int i = 0; i < listOfMovies.length; i++) {

				listOfMovies[i] = sc.nextLine();

			}
		}
		System.out.println(Arrays.toString(listOfMovies));

		Random rand = new Random();
	    int index = rand.nextInt(listOfMovies.length);
		System.out.println(listOfMovies[index]);
     
		String name = listOfMovies[index];

		boolean hasGuessed=false;

		hasGuessed = game1.checkGuessMovie(name);
		
		System.out.println("The letters guessed is "+hasGuessed);
	
		
		sc.close();
	}
}
