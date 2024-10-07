import java.util.Scanner;

public class Guest {
    private Library library;

    public Guest(Library library) {
        this.library = library;
    }

    public void viewCatalog(){
        for(Book book: library.getCatalog()){
            book.displayBook();
        }
    }
    public void guestMenu(){
        System.out.println("1. Register to System");
        System.out.println("2. Search book");
        Scanner scanner = new Scanner(System.in);
        System.out.println(Search.search(scanner.next()));

    }
}
