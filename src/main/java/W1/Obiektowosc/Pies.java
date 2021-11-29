package W1.Obiektowosc;

public class Pies extends Animal{

    protected Pies(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Woof woof!";
    }
}
