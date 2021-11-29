package W1.Obiektowosc;

public abstract class Person {

    protected String name;
    protected String address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s->'%s'",this.name,this.address);
    }
}
