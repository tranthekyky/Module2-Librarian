
public class Magazine extends Document {
    private int issueNumber;
    private int issueMonth;

    public Magazine(String id, String publisher, int numberOfCopies, int issueNumber, int issueMonth) {
        super(id, publisher, numberOfCopies);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return "Magazine [issueNumber=" + issueNumber + ", issueMonth=" + issueMonth + ", " + super.toString() + "]";
    }
}

