package TRENER2.Interfejsy;

import TRENER2.Interfejsy.zadanie1.Email;
import TRENER2.Interfejsy.zadanie1.UserValidator;
import TRENER2.Interfejsy.zadanie2.Genre;
import TRENER2.Interfejsy.zadanie2.Movie;
import TRENER2.Interfejsy.zadanie3.Car;

public class Main {
    public static void main(String[] args) {
        //zadanie 1
        UserValidator uv = new UserValidator();
        Email email = uv.validateEmails("testd.com","lamek@gmail.com");
        System.out.println(email.getEmail());
        System.out.println(email.getAlterEmail());

//        //zadanie 2
//        Movie.MovieCreator mv = new Movie.MovieCreator();
//        mv.createMovie2();
//        mv.setGenre(Genre.ACTION);
//        System.out.println(mv);

//        //zadanie 3
//        Car car = new Car("BMW", "Economic");
//        System.out.println(car);


        //zadanie 4







    }
}
