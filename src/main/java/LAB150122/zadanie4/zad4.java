package LAB150122.zadanie4;

import java.util.*;

public class zad4 {
    public static void main(String[] args) {
        Map<String,List<String>> test2 = new HashMap<>();
        Storage storage = new Storage(test2);

        storage.addToStorage("klucz1", "1");
        storage.addToStorage("klucz1", "2");

        System.out.println(storage);
    }
}
