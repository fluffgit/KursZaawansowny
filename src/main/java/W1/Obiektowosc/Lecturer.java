package W1.Obiektowosc;

public class Lecturer extends Person{

    protected String sepcialisation;
    protected double salary;

    Lecturer(String sepcialisation, double salary){

        this.sepcialisation = sepcialisation;
        this.salary = salary;
    }

    Lecturer(String name, String address){
        this("Zarządzanie",4500);
        this.name = name;
        this.address = address;
    }

    public void setSepcialisation(String specialisation){
        this.sepcialisation = specialisation;
    }

    public  void setSalary(double salary){
        this.salary = salary;
    }

    public String getSepcialisation(){
        return sepcialisation;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s",this.name,this.address,this.sepcialisation, this.salary);
    }
}

