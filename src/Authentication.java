import java.util.List;

public class Authentication {
    private  String login = "admin";
    private  String password = "admin";

    public boolean login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Login or password incorrect");
            return false;
        }
    }

    public Person login(List<Person> personList, String login, String password) {

        for (Person person : personList) {
            if (person.getLogin().equals(login) && person.getPassword().equals(password)) {
                System.out.println("Login successful");
                return person;
            }
        }
        System.out.println("Login failed");
        return null;
    }

    public boolean isLoginAvailable(List<Person> personList, String login) {
        for (Person person : personList) {
            if (person.getLogin().equals(login)) {
                return false;
            }
        }
        return true;
    }
}



