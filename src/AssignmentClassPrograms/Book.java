package AssignmentClassPrograms;

public class Book {

	String author;
	String title;
	int pageCount;

	Book(String authorname, String name, int pages) {
		author = authorname;
		title = name;
		pageCount = pages;
	}

	String getAuthor() {

		return author;
	}

	String getName() {

		return title;
	}

	int getPages() {

		return pageCount;
	}
}
