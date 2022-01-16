package TRENER2;

import java.util.Collections;
import java.util.List;

public class Person {

    protected String name;
    protected String surname;
    protected Integer age;
    protected Integer salary;
    protected boolean isFemale;
    protected List<String> pets;

    public Person(String name, String surname, int age, int salary, boolean isFemale, List<String> pets) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.isFemale = isFemale;
        this.pets = pets;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = Collections.singletonList(pets);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }
}
