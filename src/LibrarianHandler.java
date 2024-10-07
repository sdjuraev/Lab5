import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarianHandler {
    private Scanner scanner;
    private Librarian librarian;
    private InputForm inputForm;

    LibrarianHandler(Scanner scanner, Librarian librarian){
        this.scanner = scanner;
        inputForm = new InputForm(scanner);
        this.librarian = librarian;
    }
    private void showMenu(){
        System.out.println("1. Add book");
        System.out.println("2. Remove book");
        System.out.println("3. Issue Book");
        System.out.println("4. Return book");
        System.out.println("5. View Catalog");
        System.out.println("6. View Managed Catalog");
        System.out.println("7. Show members");
        System.out.println("8. Search books");
        System.out.println("0. Back");
    }
    public void run(){
        while (true) {
            showMenu();
            int selection = scanner.nextInt();
            switch (selection) {
                case 1: {
                    librarian.addBook(inputForm.createBook());
                }
                break;
                case 2: {
                    System.out.println("Enter bookID");
                    String bookID = scanner.next();
                    librarian.removeBook(bookID);
                }
                break;
                case 3: {
                    System.out.println("Enter Book ID");
                    String bookID = scanner.next();
                    System.out.println("Enter memberID");
                    String memberID = scanner.next();
                    librarian.issueBook(bookID, memberID);
                }
                break;
                case 4:
                    {
                    System.out.println("Enter Book ID");
                    String bookID = scanner.next();
                    System.out.println("Enter memberID");
                    String memberID = scanner.next();
                    librarian.returnBooks(bookID, memberID);
                }
                break;
                case 5: {
                    Library.showBooks();
                }
                break;
                case 6: {
                    librarian.showManagedBooks();
                }
                break;
                case 7: {
                    librarian.showMembers();

                }
                break;
                case 8:{
                    System.out.println("Enter book titl");
                }
                case 0:
                    return;
            }
        }
    }
}
