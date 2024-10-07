import java.util.Scanner;

public class MemberHandler {
    private Scanner scanner;
    private Librarian librarian;
    private Member member;
    MemberHandler(Scanner scanner, Librarian librarian, Member member){
        this.scanner = scanner;
        this.librarian = librarian;
        this.member = member;
    }
    private void showMenu(){
        System.out.println("1. Show list of books");
        System.out.println("2. Search books");
        System.out.println("3. View Borrowed Books");
        System.out.println("0. Back");
    }
    public void run(){
        while (true){
            showMenu();
            int selection=scanner.nextInt();
            switch (selection){
                case 1:{
                   Library.showBooks();
                }
                break;
                case 2:{
                    System.out.println("Enter book title or author");
                    scanner.nextLine();
                    String bookInfo = scanner.nextLine();
                    Search.search(bookInfo);
                }
                break;
                case 3:{
                    member.viewBorrowedBooks();
                }
                break;
                case 0:
                    return;

            }
        }
    }



}
