import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private List<Book> borrowedBooks;
    private  int currentBooks=0;

    public Member(String name, int age, String login, String password) {
        super(name, age, login, password, Role.MEMBER);
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (currentBooks == 5) {
            System.out.println("You already have 5 book. Maximum allowed books 5 only");

        } else {
            borrowedBooks.add(book);
            currentBooks++;
        }
    }


    public void returnBook() {
        --currentBooks;
    }

    public void viewBorrowedBooks() {
        System.out.println(String.format(String.format("%-8s %-25s %-20s %-15s", "ID", "Title", "Author", "Availability")));
        for (Book b : borrowedBooks) {
            b.displayBook();
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
