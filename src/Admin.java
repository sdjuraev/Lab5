import java.util.Scanner;
public class Admin {
    private Scanner scanner;
    private Library library;
    private InputForm inputForm;

    public Admin(Library library, Scanner scanner){
        this.library = library;
        this.scanner = scanner;
        this.inputForm = new InputForm(scanner);

    }

    public void showMenu(){
        System.out.println("1. Add Librarian");
        System.out.println("2. Add Member");
        System.out.println("3. Change Library Name");
        System.out.println("4. Add book");
        System.out.println("5. Show librarian");
        System.out.println("6. Show members");
        System.out.println("7. Show books");
        System.out.println("8. Show library info");
        System.out.println("0. Back");

    }
    public void run(){
        while (true){
            showMenu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                {
                    scanner.nextLine();
                    inputForm.setPersonList(library.getPersonList());
                    Librarian librarian = inputForm.createLibrarian();
                    librarian.setLibrary(library);
                    library.addPerson(librarian);
                    System.out.println("Librarian added successfully");
                }
                break;
                case 2:
                {
                    scanner.nextLine();
                    inputForm.setPersonList(library.getPersonList());
                    Member member = inputForm.createMember();
                    library.addPerson(member);
                    System.out.println("Member added successfully!");
                }
                break;
                case 3:
                {
                    scanner.nextLine();
                    System.out.print("Enter new name of library: ");
                    String newName = scanner.nextLine();
                    library.setName(newName);
                    System.out.println("Library name changed "+ newName);
                }
                break;
                case 4:
                {
                    scanner.nextLine();
                    Book newBook = inputForm.createBook();
                    library.getCatalog().add(newBook);
                    System.out.println("Book added successfully!");
                }
                break;
                case 5:
                {
                    library.showLibrarian();
                }
                break;
                case 6:
                {
                    library.showMembers();
                }
                break;
                case 7:
                {
                   Library.showBooks();
                }
                break;
                case 8:
                {
                   library.showLibraryInfo();
                } break;
                case 0:
                    return;
                }

            }
        }


}
