import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person{

    private List<Book> managedBooks;
    private Library library;

    public Librarian(String name, int age, String login, String password, Library library) {
        super(name,age,login,password,Role.LIBRARIAN);
        this.managedBooks = new ArrayList<>();
        this.library = library;

    }

    public Librarian(String name, int age, String login, String password) {
        super(name, age, login, password, Role.LIBRARIAN);
    }

    public void addBook(Book book){
        managedBooks.add(book);
        library.getCatalog().add(book);

    }
    public void removeBook(String bookID){
        for (Book b:library.getCatalog()){
            if (b.getBookID().equals(bookID)){
                library.getCatalog().remove(b);
            }
        }
    }
    public void issueBook(String bookID, String memberID){
        Member temp=null;


        for (Person p: library.getPersonList()){
            if (p.getID().equals(memberID)){
                temp = (Member) p;
            }
        }
        if (temp!=null) {
            for (Book b : library.getCatalog()) {
                if (b.getBookID().equals(bookID)) {
                    if (b.isAvailable() && temp.getBorrowedBooks().size()!=5) {
                        b.borrowBook();
                        temp.getBorrowedBooks().add(b);
                        System.out.println("Book assigned to "+ temp.getName());
                    }
                    else {
                        System.out.println("Book not available to borrow");
                    }
                }
            }
        }
        else {
            System.out.println("There is no such a member");
        }
    }
    public void returnBooks(String bookID, String memberID){
        Member temp=null;
        for (Person p: library.getPersonList()){
            if (p.getID().equals(memberID)){
                temp = (Member) p;
            }
        }
        if (temp!=null) {
            for (Book b : library.getCatalog()) {
                if (b.getBookID().equals(bookID)) {
                    if (!b.isAvailable()) {
                        b.returnBook();
                        temp.returnBook();
                    }else {
                        System.out.println("You can't return book already in the library");
                    }
                }
            }
        }
        else {
            System.out.println("There is no such a member");
        }

    }

    public void showManagedBooks(){
        System.out.println("List of managed books");
        System.out.println(String.format(String.format("%-8s %-25s %-20s %-15s", "ID", "Title", "Author", "Availability")));
        for (Book book:managedBooks){
            {
                book.displayBook();
            }
        }
    }
    public void setLibrary(Library library){
        this.library = library;
    }
    public void changePassword(String password){
        super.setPassword(password);
    }
    public void showMembers(){
        library.showMembers();
    }


}
