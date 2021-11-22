package W1.Mieszkanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Flat flat01 = new Flat(1,64);
//        Flat flat02 = new Flat(2,75,true,"Jesionowa");
//        Flat flat03 = new Flat(3,36,true,"Lipowa");
//        Flat[] flats ={flat01,flat02,flat03};
//        //writeToFile(flats);
//        ArrayList<Flat> lista = readFile();
//        System.out.println(lista);

        ArrayList<String> nameList = nameList();
        System.out.println(nameList);

        listWithoutDuplicates(nameList);
        System.out.println(listWithoutDuplicates(nameList));

        getDublicates(nameList);






    }

    public static void writeToFile(Flat[] flats) throws FileNotFoundException {
        String path = "C:\\Users\\Marcin\\Desktop\\plik99.txt";
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        if (file.exists()) {
            for (Flat e : flats) {
                pw.println(e);
            }
        }
        pw.close();
    }

    public static ArrayList<Flat> readFile() throws FileNotFoundException {
        ArrayList<Flat>lista = new ArrayList<Flat>();
        String path = "C:\\Users\\Marcin\\Desktop\\plik99.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if (file.exists()) {
            while(scanner.hasNextLine()){
                lista.add(stringToObject(scanner.nextLine()));
            }
        }
        return lista;
    }

    public static Flat stringToObject(String input){
        String[] split = input.split(";");
        int number  = Integer.parseInt(split[0]);
        double area = Double.parseDouble(split[1]);
        boolean hasAC = Boolean.parseBoolean(split[2]);
        String address = split[3];
        return new Flat(number,area,hasAC,address);
    }

    // zad 11. Stworz liste imion i znajdz wszystkie na niej duplikaty
// zad 12. Stworz dwie listy z liczbami i wypisz elementy wspolne z tych dwóch list
// zad 13 Stworz dwie listy z imionami i wypisz elemnty NIEwspolne z obu
// zad 14 zamien porzadek elementów na liscie a,b,c,d -> d,b,c,a
// zad 15 Stworz liste ze slowami, znajdz slowa ktore na tej liscie jest palindromem.
//			np. kajak

    public static ArrayList<String> nameList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Marcin");
        list.add("Tomasz");
        list.add("Bartek");
        list.add("Tomasz");
        list.add("konrad");
        list.add("Michał");
        return list;
    }

    public static HashSet<String> listWithoutDuplicates(ArrayList<String> list){
        //transform to hashset, hashset nie ma duplikatów.
        return new HashSet<String>(list);
    }

    public static HashSet<String> getDublicates(ArrayList<String> list){
        HashSet<String> set1 = new HashSet<String>();
        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()){
//            if(set1.contains())
//        }

        return set1;
    }



}
