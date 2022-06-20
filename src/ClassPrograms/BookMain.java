package ClassPrograms;

public class BookMain {

	public static void main(String[] args) {

		Book othello = new Book("Shakespeare", "Othello", 300);

		System.out.println(othello.getAuthor());

		System.out.println(othello.getName());

		System.out.println(othello.getPages());

	}

}
