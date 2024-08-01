import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static DocumentManager manager = new DocumentManager();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public void mainMenu() throws ParseException {
        int choice;

        do {
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xóa tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewDocument();
                    break;
                case 2:
                    removeDocument();
                    break;
                case 3:
                    manager.showAllDocuments();
                    break;
                case 4:
                    searchByType();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);

        scanner.close();
    }
    private static void removeDocument() {
        System.out.println("Nhập mã tài liệu cần xóa:");
        String id = scanner.nextLine();
        manager.removeDocument(id);
    }
    private static void searchByType() {
        System.out.println("Chọn loại tài liệu để tìm kiếm (1: Sách, 2: Tạp chí, 3: Báo):");
        int type = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                manager.searchByType(Book.class);
                break;
            case 2:
                manager.searchByType(Magazine.class);
                break;
            case 3:
                manager.searchByType(Newspaper.class);
                break;
            default:
                System.out.println("Loại tài liệu không hợp lệ.");
        }
    }
    public static void addNewDocument() throws ParseException {
        System.out.println("Chọn loại tài liệu để thêm (1: Sách, 2: Tạp chí, 3: Báo):");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập mã tài liệu:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên nhà xuất bản:");
        String publisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành:");
        int numberOfCopies = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                System.out.println("Nhập tên tác giả:");
                String author = scanner.nextLine();
                System.out.println("Nhập số trang:");
                int numberOfPages = scanner.nextInt();
                scanner.nextLine();
                manager.addDocument(new Book(id, publisher, numberOfCopies, author, numberOfPages));
                break;
            case 2:
                System.out.println("Nhập số phát hành:");
                int issueNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập tháng phát hành:");
                int issueMonth = scanner.nextInt();
                scanner.nextLine();
                manager.addDocument(new Magazine(id, publisher, numberOfCopies, issueNumber, issueMonth));
                break;
            case 3:
                System.out.println("Nhập ngày phát hành (dd/MM/yyyy):");
                String issueDateStr = scanner.nextLine();
                Date issueDate = dateFormat.parse(issueDateStr);
                manager.addDocument(new Newspaper(id, publisher, numberOfCopies, issueDate));
                break;
            default:
                System.out.println("Loại tài liệu không hợp lệ.");
        }

    }

    public static void main(String[] args) throws ParseException {
        Main main = new Main();
        main.mainMenu();
    }

}