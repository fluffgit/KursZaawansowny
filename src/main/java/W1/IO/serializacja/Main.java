package W1.IO.serializacja;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //czytanie z pliku
        List<Person> emps2 =deserial();
        System.out.println(emps2);
        // zapis
        List<Person> people =serial(creatListScanner(emps2));
        System.out.println(people);
        //czytanie z pliku
        List<Person> emps3 =deserial();
        System.out.println(emps3);

    }

    private static List<Person> deserial() {
        List<Person> lista = new ArrayList<>();
        String filename = "log.txt";
        try {
            // czytanie z pliku
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            lista = (ArrayList<Person>)in.readObject();
            in.close();
            file.close();
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        }
        return lista;
    }

    public static List<Person>  creatListScanner(List<Person> list) throws Exception {

        int i =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many user you want add?");
        int howMany =Integer.parseInt(scanner.nextLine());
        while (i<howMany){
            if(scanner.hasNextLine()) {
                list.add(readUsersFromFile(scanner.nextLine()));
                i++;
            }
        }
        return list;
    }

    public static Person readUsersFromFile(String input) throws Exception{
        String[] split = input.split(",");
        String name =split[0];
        String age = split[1];
        String a = split[2];
        String b = split[3];
        return new Person(name,Integer.parseInt(age),Integer.parseInt(a),Integer.parseInt(b));
    }


    public static List<Person> serial(List<Person> objects){
        String filename = "log.txt";
        try {
            // zapis
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(objects);
            out.close();
            file.close();
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        return objects;
    }




}
