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
}
