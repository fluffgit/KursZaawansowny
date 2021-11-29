package W1.Obiektowosc;

public enum Coffee {
    LATTE(10,Roast.BLONDE),
    ESPRESSO(0,Roast.DARK),
    AMERICANA(5,Roast.MEDIUM);

    private final int milk;
    private final Roast roast;

    Coffee(int milk, Roast roast) {
        this.milk = milk;
        this.roast = roast;
    }

    public int getMilk() {
        return milk;
    }

    public Roast getRoast() {
        return roast;
    }
}
