package TRENER2.Interfejsy.zadanie1;

import TRENER2.Interfejsy.zadanie1.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {



    public Email validateEmails(String email, String alternativeEmail){
        Email emailObj = new Email(email, alternativeEmail);
        Pattern pattern = Pattern.compile(
                "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"
        );
        Matcher m = pattern.matcher(emailObj.email);
        Matcher m1 = pattern.matcher(emailObj.alterEmail);
        setterEmail(m,emailObj,email);
        setterAltEmail(m1,emailObj,alternativeEmail);
        return new Email(emailObj.getEmail(),emailObj.getAlterEmail());
    }

    private void setterEmail (Matcher m2,Email emailObj2, String email2){
        if(m2.find()) {
            emailObj2.setEmail(email2);
        }else{
            emailObj2.setEmail("Unknown");
        }
    }
    private void setterAltEmail (Matcher m2,Email emailObj2, String email2){
        if(m2.find()) {
            emailObj2.setAlterEmail(email2);
        }else{
            emailObj2.setAlterEmail("Unknown");
        }
    }





}
