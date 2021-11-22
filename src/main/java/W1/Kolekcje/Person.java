package W1.Kolekcje;

public class Person {

    private String imie;
    private String nazwisko;
    private int wzrost;
    private int wiek;


    public Person(String imie, String nazwisko, int wzrost, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.wiek = wiek;

    }

    @Override
    public String toString() {
        return
                imie+
                ";"+ nazwisko +
                ";" + wzrost +
                ";" + wiek
                ;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWzrost() {
        return wzrost;
    }

    public int getWiek() {
        return wiek;
    }
}
