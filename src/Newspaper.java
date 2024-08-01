import java.util.Date;

public class Newspaper extends Document {
    private Date issueDate;

    public Newspaper(String id, String publisher, int numberOfCopies, Date issueDate) {
        super(id, publisher, numberOfCopies);
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Newspaper [issueDate=" + issueDate + ", " + super.toString() + "]";
    }
}

