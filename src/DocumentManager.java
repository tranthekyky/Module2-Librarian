
import java.util.ArrayList;
import java.util.List;

public class DocumentManager {
    private List<Document> documents;

    public DocumentManager() {
        documents = new ArrayList<>();
    }

    public void addDocument(Document doc) {
        documents.add(doc);
    }

    public void removeDocument(String id) {
        documents.removeIf(doc -> doc.getId().equals(id));
    }

    public void showAllDocuments() {
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    public void searchByType(Class<?> type) {
        for (Document doc : documents) {
            if (type.isInstance(doc)) {
                System.out.println(doc);
            }
        }
    }
}

