package W1.IO.serializacja;

import java.io.Serializable;

public class Emp implements Serializable {



    public int a;
    public int b;
    public String name;
    public int age;

    // Default constructor
    public Emp(String name, int age, int a, int b)
    {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %S",name,age,a,b);
    }
}
