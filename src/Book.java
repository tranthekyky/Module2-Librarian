
public class Book extends Document {
    private String author;
    private int numberOfPages;

    public Book(String id, String publisher, int numberOfCopies, String author, int numberOfPages) {
        super(id, publisher, numberOfCopies);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", numberOfPages=" + numberOfPages + ", " + super.toString() + "]";
    }
}

