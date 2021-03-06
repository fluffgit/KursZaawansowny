package W1.Obiektowosc;

public class Student extends Person{
    protected String fieldOfStudy;
    protected int yearOFStudy;
    protected double costOfStudy;

    public Student(String name, String address, String fieldOfStudy, int yearOFStudy, double priceOfStudy) {
        super(name, address);
        this.fieldOfStudy = fieldOfStudy;
        this.yearOFStudy = yearOFStudy;
        this.costOfStudy = priceOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOFStudy() {
        return yearOFStudy;
    }

    public void setYearOFStudy(int yearOFStudy) {
        this.yearOFStudy = yearOFStudy;
    }

    public double getCostOfStudy() {
        return costOfStudy;
    }

    public void setCostOfStudy(double costOfStudy) {
        this.costOfStudy = costOfStudy;
    }

    @Override
    public String toString() {
        return String.format("%s->'%s'->%s->%s->%s",this.name,this.address,this.fieldOfStudy,this.costOfStudy,this.costOfStudy);
    }
}
