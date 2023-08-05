import java.util.Objects;

public class Book {
    private String tittle;
    private Author author;
    private int yearPublication;

    public Book(String tittle, Author author, int yearPublication) {
        this.tittle = tittle;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTittle() {
        return tittle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(tittle, book.tittle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tittle, author, yearPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
