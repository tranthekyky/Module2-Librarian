public class Document {

        private String id;
        private String publisher;
        private int numberOfCopies;

        public Document(String id, String publisher, int numberOfCopies) {
            this.id = id;
            this.publisher = publisher;
            this.numberOfCopies = numberOfCopies;
        }

        public String getId() {
            return id;
        }

        public String getPublisher() {
            return publisher;
        }

        public int getNumberOfCopies() {
            return numberOfCopies;
        }

        @Override
        public String toString() {
            return "Document [id=" + id + ", publisher=" + publisher + ", numberOfCopies=" + numberOfCopies + "]";
        }


}
