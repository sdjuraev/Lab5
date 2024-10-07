public abstract class Person {
    private String name;
    private String ID;
    private int age;
    private String login;
    private String password;
    private Role role;

    public Person(String name,  int age, String login, String password, Role role) {
        this.name = name;
        this.ID = BookIDGenerator.generateBookID();
        this.age = age;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-5d %-10s", ID, name, age, role);

    }
}
