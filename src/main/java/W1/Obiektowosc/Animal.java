package W1.Obiektowosc;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract String getSound();

    public String getName(){
        return name;
    }
}
