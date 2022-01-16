package TRENER2.Interfejsy.zadanie4;

public class User implements Validator{
    private String name;
    private String name2;
    private int age;
    private String login;
    private String password;

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(validatePassword(password)){
            this.password = password;
        }

    }

    @Override
    public boolean validatePassword(String password) {
        //jakis kod walidujący pass
        return false;
    }
}
