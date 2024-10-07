import java.util.List;

public class CheckLogin {
    public static boolean loginExist(List<Person> members, String login){
        for (Person person: members){
            if (person.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
}
