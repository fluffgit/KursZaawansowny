package W1.Obiektowosc;

public class Prisoner {
    //enkapsulacja
    private final String id;
    private final String name;
    private final String lastName;

    public Prisoner(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getName(){
        return name+lastName.charAt(0);
    }

}
