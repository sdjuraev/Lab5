import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private static List<Book> catalog;
    private List<Person> personList;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.catalog = new ArrayList<>();
        this.personList =new ArrayList<>();
    }

    public static List<Book> getCatalog() {
        return catalog;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void showBooks(){
        System.out.println("List of books");
        System.out.println(String.format(String.format("%-8s %-25s %-20s %-15s", "ID", "Title", "Author", "Availability")));
        for (Book book:catalog){
            {
                book.displayBook();
            }
        }
    }
    public void addPerson(Person person){
        personList.add(person);
    }
    public  void showMembers(){
        System.out.println("List of members");
        System.out.println(String.format(String.format("%-10s %-15s %-5s %-10s", "ID", "Name", "Age", "Role")));
        for (Person person:personList){
            if (person.getRole()==Role.MEMBER){
                System.out.println(person);
            }
        }
    }
    public void showLibrarian(){
    System.out.println("List of Librarians");
                    System.out.println(String.format(String.format("%-10s %-15s %-5s %-10s", "ID", "Name", "Age", "Role")));
                    for (Person person:personList){
        if (person.getRole()==Role.LIBRARIAN){
            System.out.println(person.toString());
        }
    }}
    public void showLibraryInfo(){
        int lN = 0;
        int mN = 0;
        System.out.println("Library: "+name);
        System.out.print("Location:  "+location);
        System.out.println("  Total number of books: "+catalog.size());
        for(Person person: personList){
            if (person.getRole()==Role.LIBRARIAN){
                lN++;
            }
            if (person.getRole() == Role.MEMBER){
                mN++;
            }
        }
        System.out.println("Number of members : " + mN);
        System.out.println("Number of librarians: "+ lN);
    }

}
