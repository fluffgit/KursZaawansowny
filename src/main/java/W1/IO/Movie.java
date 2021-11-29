package W1.IO;

public class Movie {

    private String title;
    private String genre;
    private String director;
    private String premireDate;

    public Movie(String title, String genre, String director, String premireDate) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.premireDate = premireDate;
    }

    @Override
    public String toString() {
        return title+"," +genre+","+ director +"," + premireDate;
    }
}
