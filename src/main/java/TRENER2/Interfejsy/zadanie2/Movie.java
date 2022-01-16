package TRENER2.Interfejsy.zadanie2;

import java.time.LocalDate;

public class Movie {

    private String title;
    private String director;
    private LocalDate productionDate;
    private Genre genre;
    private String studio;

    public Movie() {
    }

    public Movie(String title, String director, LocalDate productionDate, Genre genre, String studio) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return  "title: " + title + ", director: " + director + ", productionDate: " + productionDate +", genre: " + genre + ", studio: " + studio;
    }

    public static class MovieCreator{

        private String title;
        private String director;
        private LocalDate productionDate;
        private Genre genre;
        private String studio;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public LocalDate getProductionDate() {
            return productionDate;
        }

        public void setProductionDate(LocalDate productionDate) {
            this.productionDate = productionDate;
        }

        public Genre getGenre() {
            return genre;
        }

        public void setGenre(Genre genre) {
            this.genre = genre;
        }

        public String getStudio() {
            return studio;
        }

        public void setStudio(String studio) {
            this.studio = studio;
        }

        public Movie createMovie2(){
            return new Movie();
        }

        public Movie createMovie(String title, String director, LocalDate productionDate, Genre genre, String studio){
            this.title = title;
            this.director = director;
            this.productionDate = productionDate;
            this.genre = genre;
            this.studio = studio;

            return new Movie(title,director,productionDate,genre,studio);
        }

        @Override
        public String toString() {
            return  "title: " + title + ", director: " + director + ", productionDate: " + productionDate +", genre: " + genre + ", studio: " + studio;
        }

    }

}
