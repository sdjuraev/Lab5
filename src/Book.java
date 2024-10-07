public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.bookID = BookIDGenerator.generateBookID();
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean borrowBook(){
        if (isAvailable){
            isAvailable = false;
            return true;
        }else {
            System.out.println("You cant borrow the book. It is not available");
            return false;
        }
    }
    public boolean returnBook(){
        if (isAvailable==false){
            isAvailable =true;
            return true;
        }else {

            return false;
        }
    }

    public String getBookID() {
        return bookID;
    }
    public void displayBook(){
        System.out.println(String.format("%-8s %-25s %-20s %-15s", bookID, title, author, isAvailable?"Available":"Not Available"));
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
