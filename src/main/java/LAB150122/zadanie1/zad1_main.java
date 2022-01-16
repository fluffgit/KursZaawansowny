package LAB150122.zadanie1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zad1_main {
    public static void main(String[] args) {
       List<String> test = new ArrayList<>(List.of("Peter","P0ul", "PaUl","PAul"));
       test.add(null);
       sorting(test);
    }
    public static List<String> sort(String[] lista){
        //return Arrays.stream(lista).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        return Arrays.stream(lista).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
    }

    public static void sorting(List<String> list){
        list.stream().sorted(new CustomComperator().reversed()).forEach(x->System.out.println(x+""));
    }
}
