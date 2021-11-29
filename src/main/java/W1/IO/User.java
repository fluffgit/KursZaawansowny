package W1.IO;

public class User {

    private String surName;
    private String name;
    private int age;

    public User(String surName, String name, int age) {
        this.surName = surName;
        this.name = name;
        this.age = age;
    }

    public User(String surName, String name) {
        this.surName = surName;
        this.name = name;

    }

    @Override
    public String toString() {
        return surName +"; "+name+"; "+age;
    }
}
