import java.util.List;
import java.util.Scanner;

public class InputForm {
    private boolean exist = true;
    private  Scanner scanner;
    private  String name;
    private  int age;
    private  String login;
    private  String password;
    private List<Person> personList;
    InputForm(Scanner scanner){
        this.scanner = scanner;
    }

    public Librarian createLibrarian() {
        System.out.print("Enter Librarian Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Librarian Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Librarian Login: ");
        login = scanner.next();
        while (exist) {
            if (CheckLogin.loginExist(personList, login)) {
                System.out.println("Login  exist! Select another login");
                System.out.println("Enter Librarian Login: ");
                login = scanner.next();
            }
            else
            {
                exist = false;
            }
        }
        exist =true;
        System.out.print("Enter Librarian Password: ");
        password = scanner.next();

        return new Librarian(name, age, login, password);
    }

    public  Member createMember() {
        System.out.print("Enter member name: ");
        name = scanner.nextLine();
        System.out.print("Enter member age: ");
        age = scanner.nextInt();
        System.out.print("Enter login: ");
        login = scanner.next();
        while (exist) {
            if (CheckLogin.loginExist(personList, login)) {
                System.out.println("Login  exist! Select another login");
                System.out.println("Enter Librarian Login: ");
                login = scanner.next();
            }
            else
            {
                exist = false;
            }
        }
        System.out.print("Enter password: ");
        password = scanner.next();
        return new Member(name, age, login, password);
    }

    public  Book createBook() {
        scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        return new Book(title, author);
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
