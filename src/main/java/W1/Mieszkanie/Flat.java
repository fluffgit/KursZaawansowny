package W1.Mieszkanie;

import java.util.AbstractList;

public class Flat {

    private int number;
    private double area;
    private boolean hasAC;
    private String address;

    public Flat(int number, double area) {

        this.number = number;
        this.area = area;
    }

    public Flat(int number, double area, boolean hasAC, String address) {
        this.number = number;
        this.area = area;
        this.hasAC = hasAC;
        this.address = address;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return number +
                ";" + area +
                ";" + hasAC +
                ";" + address;
    }
}
