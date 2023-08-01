public class App {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author gogol = new Author("Николай", "Гоголь");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1865);
        Book revizor = new Book("Ревизор", gogol, 1836);

        PrintBook(warAndPeace);
        PrintBook(revizor);

        warAndPeace.setYearPublication(1999);

        PrintBook(warAndPeace);
    }

    public static void PrintBook(Book book) {
        System.out.println(book.getTittle() + " - " + book.getAuthor().getFirstName() + " " + book.getAuthor().getSecondName() + " - "
                + book.getYearPublication());
    }
}
