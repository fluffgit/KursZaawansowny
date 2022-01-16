package TRENER2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Queue<String> kolejka  = new LinkedList<>();
//        kolejka.add("A");
//        kolejka.add("B");
//        kolejka.add("C");
//        System.out.println(kolejka.peek());
//        System.out.println(kolejka.peek());

        List<Person> osoby = new ArrayList<>();

        Person s1 = new Person("Jackek","kowalski",25,4000, false,List.of("Pies", "Papug"));
        Person s2 = new Person("Andrzej","kowalski",23,2000, false,List.of("Ryba", "Kot"));
        Person s3 = new Person("Franek","kowalski",21,1000, false,List.of("Chomik", "Żółw"));
        Person s4 = new Person("Anna","kowalski",27,5000, true, List.of("Koń", "Kot"));

        osoby.add(s1);
        osoby.add(s2);
        osoby.add(s3);
        osoby.add(s4);

        Stream<Person> stream = osoby.stream();
        Stream<Integer> itegerStream = Stream.of(1,5,7);


        List<Integer> collected = (List<Integer>) osoby.stream()
                .map((person) -> person.getAge()+5 )
                .collect(Collectors.toList());
        System.out.println(collected);


        List<String> zwierze = osoby.stream()
                .filter(person -> !person.isFemale)                              //
                .flatMap(person -> person.getPets().stream())                    //
                .sorted(Comparator.reverseOrder())

                //.sorted(Collections.reverseOrder())
                .collect(Collectors.toList());                                   //
        System.out.println("animals from stream "+zwierze);


        Integer ludziki = osoby.stream()
               .collect(Collectors.summingInt(Person::getAge));

        System.out.println("suma wieku ludzi ze stream "+ludziki);





    }
}
