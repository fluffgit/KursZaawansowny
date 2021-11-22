package W1.Files01;

import java.time.LocalDate;

public class Pies {

    private String name;
    private String race;
    private int weight;
    private LocalDate birthDay;
    private boolean pureBreed;

    public Pies(String name, String race, int weight) {
        this.name = name;
        this.race = race;
        this.weight = weight;

    }

    public Pies(String name, String race, int weight, int year, int month, int day) {
        this.name = name;
        this.race = race;
        this.weight = weight;
        this.birthDay = setBirthDay(year,month,day);
    }

    public LocalDate setBirthDay(int year, int month, int dayOfMonth){
        return LocalDate.of(year, month, dayOfMonth);
    }

    public void setBirthDay2(int year, int month, int dayOfMonth){
        this.birthDay = LocalDate.of(year, month, dayOfMonth);
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        return now.getYear() - birthDay.getYear();
    }

    @Override
    public String toString() {
        return "Pies: " +
                "name= " + name  +
                ", race= " + race +
                ", weight= " + weight +
                ", birthDay= " + birthDay +
                ", pureBreed= " + pureBreed;
    }
}
