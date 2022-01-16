package TRENER2.Interfejsy.zadanie1;

public class Email {

    String email;
    String alterEmail;

    public Email(String email, String alterEmail) {
        this.email = email;
        this.alterEmail = alterEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlterEmail() {
        return alterEmail;
    }

    public void setAlterEmail(String alterEmail) {
        this.alterEmail = alterEmail;
    }
}
