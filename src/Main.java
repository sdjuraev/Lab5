import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("New UU Library", "Mustaqillik 1");

        Librarian lib = new Librarian("Alex", 22,"login", "pass",library);
        Member mem = new Member("Simon",12,"member", "pass");
        library.addPerson(lib);
        library.addPerson(mem);
        library.getCatalog().addAll(BookHandler.generateBooks());

        Authentication authentication = new Authentication();
        while (true) {

            System.out.println("Welcome to NUU library");
            System.out.println("1. Login as ADMIN");
            System.out.println("2. Login as Librarian");
            System.out.println("3. Login as Member");
            System.out.println("4. Continue as Guest");
            System.out.println("0. Exit ");
            int select = scanner.nextInt();
            String login, password;
            switch (select) {
                case 1: {
                    System.out.print("Login as admin: ");
                    System.out.print("Login: ");

                    login = scanner.next();
                    System.out.print("Password: ");
                    password = scanner.next();
                    if (authentication.login(login, password)) {
                        Admin admin = new Admin(library, scanner);
                        admin.run();
                    }
                }
                break;
                case 2: {
                    System.out.println("Login as Librarian");
                    System.out.print("Login: ");
                    login = scanner.next();
                    System.out.print("Password: ");
                    password = scanner.next();
                    Librarian librarian =(Librarian) authentication.login(library.getPersonList(), login, password);
                    if(librarian!=null){
                        LibrarianHandler librarianHandler = new LibrarianHandler(scanner, librarian);
                        librarianHandler.run();
                    }

                }
                break;
                case 3:
                {
                    System.out.println("Login as Member");
                    System.out.print("Enter member login: ");
                    login = scanner.next();
                    System.out.print("Enter member password: ");
                    password = scanner.next();
                    Member member = (Member) authentication.login(library.getPersonList(), login, password);
                    if(member!=null){
                        MemberHandler memberHandler = new MemberHandler(scanner, lib, member);

                        memberHandler.run();
                    }

                }
                break;
                case 4:
                {
                    Guest guest = new Guest(library);
                    guest.viewCatalog();
                    guest.guestMenu();
                }
                break;
                case 0:
                {
                    System.exit(0);
                }
            }
        }

    }
    public static String getPassword() {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return null;
        }
        char[] passwordArray = console.readPassword("Enter Password: ");
        return new String(passwordArray);
    }
}