import java.util.ArrayList;
import java.util.List;

public class BookHandler {
    public static List<Book> generateBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Pride and Prejudice", "Jane Austen"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Moby Dick", "Herman Melville"));
        books.add(new Book("War and Peace", "Leo Tolstoy"));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky"));
        books.add(new Book("Brave New World", "Aldous Huxley"));
        books.add(new Book("The Odyssey", "Homer"));
        books.add(new Book("The Brothers Karamazov", "Fyodor Dostoevsky"));
        books.add(new Book("The Divine Comedy", "Dante Alighieri"));
        books.add(new Book("The Iliad", "Homer"));
        books.add(new Book("Don Quixote", "Miguel de Cervantes"));
        return books;
    }
}
