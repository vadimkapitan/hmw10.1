public class App {


    public static void main(String[] args) {
        Book book = new Book("Война и Мир", 1865);
        System.out.println("Название книги = " + book.bookName);
        System.out.println("Автор книги = " + Author.nameAuthor + " " + Author.surnameAuthor);
        System.out.println("Год публикации = " + book.yearPublication);

    }
}
