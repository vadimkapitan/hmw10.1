public class App {


    public static void main(String[] args) {
        Book book = new Book("Война и Мир", "Лев Толстой", 1865);
        System.out.println("book.bookName = " + book.bookName);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearPublication = " + book.yearPublication);

    }
}
