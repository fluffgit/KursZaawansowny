package W1.Kolekcje;

import java.util.*;

// zad w1. Stworz liste imion i znajdz wszystkie na niej duplikaty
// zad w2. Stworz dwie listy z liczbami i wypisz elementy wspolne z tych dwóch list
// zad w3 Stworz dwie listy z imionami i wypisz elemnty NIEwspolne z obu
// zad w4 zamien porzadek elementów na liscie a,b,c,d -> d,b,c,a
// zad w5 Stworz liste ze slowami, znajdz slowa ktore na tej liscie jest palindromem.

// zad 10 Z listy znajdz wszystkie palindromy  kajak
// *zad 11 Dodawaj na mape elementy i jesli dany element jest anagramem jakiegos klucza,
//		            staje sie jego wartoscia, jesli nie to nowym kluczem
// zad 12 Masz liste z zad 2 zamien kolejnosc elementow od tylu


// Narysowac z figur geometrycznych dowolne zwierzatko
// Narysowac szachownice biale-czarne
// Pobrac z pliku spis osob, posortowac po imieniu/nazwisku zapisac spowrotem do pliku


public class Main {
    public static void main(String[] args) {

        List<Person> listaList = getPersonList(returnPersonList());
        Set<Person> listaSet = getPersonSet(returnPersonList());
        Map<Integer, Person> listaMap = getlistaMap();

        convertListToSet(listaList);
        convertSetToList(listaSet);
        // zad 4
//    printMap(listaMap);

//        System.out.println(listaList);
//        System.out.println(listaSet);
//        System.out.println(listaMap);
//        System.out.println(convertListToSet(listaList));
//        System.out.println(convertSetToList(listaSet));

//        // zad 7
//        List<Person> lista2 = getPersonList(returnPersonList());
//        System.out.println(findtallest(lista2));
//
//        // zad 8
//        Set<Person> lista3 = getPersonSet(returnPersonList());
//        System.out.println(getBestTallToAgeRatioPerson(lista3));
//
//        // zad 9
//        List<Person> list4 = sortPersonList(returnPersonList());
//        System.out.println(list4);

//        // zad 10
//        //System.out.println(checkIfPalindrome("alaa"));
//        List<String> list5 = returnPalindrome();
//        System.out.println(list5);

          // zad 11
        System.out.println(sortString("LALA"));

//        // zad 12
//        List<Person> list6 = getPersonList(returnPersonList());
//        System.out.println(list6);
//        System.out.println(changeOrder(list6));


    }

    public static ArrayList<Person> returnPersonList() {
        ArrayList<Person> lista = new ArrayList<Person>();
        Person p1 = new Person("Jan", "Kowalski", 176, 24);
        Person p2 = new Person("Anna", "Kowalska", 156, 19);
        Person p3 = new Person("Piotr", "Nowak", 182, 18);
        Person p4 = new Person("Wioletta", "Nowak", 162, 35);
        Person p5 = new Person("Gabriel", "Czerwony", 194, 43);
        Person p6 = new Person("Jerzy", "Konieczny", 185, 56);
        Person p7 = new Person("Anna", "Zawsitna", 170, 20);
        Person p8 = new Person("Bolewsław", "Chrobry", 179, 46);
        Person p9 = new Person("Michał", "Nowak", 156, 31);
        Person p10 = new Person("Stefan", "Czarnecki", 100, 29);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);

        return lista;
    }

    // zad 2 Dodaj do listy wszystkie osoby, wypisz je
    public static List<Person> getPersonList(ArrayList<Person> list) {
        return list;
    }

    // zad 3 Dodaj do set-u wszystkie osoby, wypisz je
    public static Set<Person> getPersonSet(ArrayList<Person> list) {
        return new HashSet<Person>(list);

    }

    // zad 4 Dodaj do mapy wszystkie osoby, wypisz je -> jako klucz przyjmij imie
    public static Map<Integer, Person> getlistaMap() {
        Map<Integer, Person> lista = new TreeMap<>();

        Person p1 = new Person("Jan", "Kowalski", 176, 24);//
        Person p2 = new Person("Anna", "Kowalska", 156, 19);//
        Person p3 = new Person("Piotr", "Nowak", 182, 18);//
        Person p4 = new Person("Wioletta", "Nowak", 162, 35);//
        Person p5 = new Person("Gabriel", "Czerwony", 194, 43);//
        Person p6 = new Person("Jerzy", "Konieczny", 185, 56);//
        Person p7 = new Person("Anna", "Zawsitna", 170, 20);
        Person p8 = new Person("Bolewsław", "Chrobry", 179, 46);//
        Person p9 = new Person("Michał", "Nowak", 156, 31);//
        Person p10 = new Person("Stefan", "Czarnecki", 190, 29);//

        lista.put(p1.hashCode(), p1);
        lista.put(p2.hashCode(), p2);
        lista.put(p3.hashCode(), p3);
        lista.put(p4.hashCode(), p4);
        lista.put(p5.hashCode(), p5);
        lista.put(p6.hashCode(), p6);
        lista.put(p7.hashCode(), p7);
        lista.put(p8.hashCode(), p8);
        lista.put(p9.hashCode(), p9);
        lista.put(p10.hashCode(), p10);

        return lista;
    }

    // zad 5 Z utworzonej w zadaniu 2 listy, stworz set  - konstruktor
    public static Set<Person> convertListToSet(List<Person> lista) {
        return new HashSet<Person>(lista);
    }

    // zad 6 Z utworzonego w zadaniu 3 setu, utworz liste - konstruktor
    public static ArrayList<Person> convertSetToList(Set<Person> lista) {
        return new ArrayList<Person>(lista);
    }

    // zad 7 Z stworzonej w 2 zadaniu listy, znajdz osobe najwyzsza
    public static Person findtallest(List<Person> list) {
        Iterator<Person> iter = list.iterator();
        Person tallest = null;
        int height = 0;
        while (iter.hasNext()) {
            Person o = iter.next();
            if (o.getWzrost() > height) {
                height = o.getWzrost();
                tallest = o;
            }
        }
        return tallest;
    }

    // zad 8 Z utworzonego setu w zadaniu 3, znajdz osobe o najwiekszym wspolczynniku wzrostu/wiek
    public static Person getBestTallToAgeRatioPerson(Set<Person> list) {
        Iterator<Person> iter = list.iterator();
        Person person = null;
        double ratio = 0;
        while (iter.hasNext()) {
            Person o = iter.next();
            if ((double) o.getWzrost() / o.getWiek() > ratio) {
                ratio = (double) o.getWzrost() / o.getWiek();
                person = o;
            }
        }
        return person;
    }

    // zad 9 Posortuj liste z zadania 2 po imionach, jesli imiona sa takie same, nazwiskach
    public static List<Person> sortPersonList(List<Person> lista) {
        Person temp = null;
        for (int j = 0; j < lista.size(); j++) {
            for (int i = j; i < lista.size(); i++) {
                if (lista.get(i).getImie().compareTo(lista.get(j).getImie()) < 0) {
                    temp = lista.get(j);
                    lista.set(j, lista.get(i));
                    lista.set(i, temp);
                }
            }
        }
        return lista;
    }

    public static void printMap(Map<Integer, Person> mapa) {
        for (Integer key : mapa.keySet()) {
            System.out.println(key + ": " + mapa.get(key));
        }
    }

    // zad 10 Z listy znajdz wszystkie palindromy  kajak
    public static List<String> returnPalindrome(){

        ArrayList<String> arraylist1 = new ArrayList<String>();
        arraylist1.add("Kajak");
        arraylist1.add("Robak");
        arraylist1.add("lol");
        arraylist1.add("asddsa");
        ArrayList<String> arraylist2 = new ArrayList<String>();

        for (String temp : arraylist1) {
            if (checkIfPalindrome(temp)) {
                arraylist2.add(temp);
            }
        }

//        while(iter.hasNext()){
//            String temp = iter.next();
//            if(checkIfPalindrome(temp)){
//                arraylist2.add(temp);
//            }
//        }
        return arraylist2;
    }

    public static boolean checkIfPalindrome(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(s.length()-( i+1)))){
                return false;
            }
        }
        return true;
    }

    // zad 12 Masz liste z zad 2 zamien kolejnosc elementow od tylu
    public static List<Person> changeOrder(List<Person> list){
        List<Person> newList = new ArrayList<Person>();
        Iterator<Person> iter = list.listIterator();
        int size =list.size();
        System.out.println(size);
        for (int i = size-1; i>=0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    // zad 11 Dodawaj na mape elementy i jesli dany element jest anagramem jakiegos klucza
    public static String sortString(String s1) {
        char[] charArray = s1.toCharArray();
        String string = " ";
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] >= charArray[j]) {
                    char m = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = m;
                }
            }
            string = string + charArray[i];
        }
        return string;
    }

}
