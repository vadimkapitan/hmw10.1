public class Book {
    String bookName;
    int yearPublication;

    public Book(String bookName, int yearPublication) {
        this.bookName = bookName;
        Author author = new Author("Лев", "Толстой");
        this.yearPublication = yearPublication;
    }
}

