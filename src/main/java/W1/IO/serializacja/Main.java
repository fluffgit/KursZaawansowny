package W1.IO.serializacja;

import W1.IO.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) throws Exception {

        //czytanie z pliku
        List<Emp> emps2 =deserial();
        System.out.println(emps2);

        // zapis
        List<Emp> emps =serial(creatListScanner(emps2));
        System.out.println(emps);

        //czytanie z pliku
        List<Emp> emps3 =deserial();
        System.out.println(emps3);

    }

    private static List<Emp> deserial() {
        List<Emp> lista = new ArrayList<>();
        String filename = "shubham.txt";
        try {
            // czytanie z pliku
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            lista = (ArrayList<Emp>)in.readObject();
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


    public static List<Emp>  creatList(){
        List<Emp> list = new ArrayList<>();
        Emp object = new Emp("Robert", 20, 2, 1000);
        Emp object2 = new Emp("Anna", 200, 20, 1);
        Emp object3 = new Emp("Kamil", 200, 20, 2);
        list.add(object);
        list.add(object2);
        list.add(object3);
        return list;

    }

    public static List<Emp>  creatListScanner(List<Emp> list) throws Exception {

        int i =0;
        Scanner scanner = new Scanner(System.in);
        while (i<1){
            if(scanner.hasNextLine()) {
                list.add(readUsersFromFile(scanner.nextLine()));
                i++;
            }
        }
        return list;
    }

    public static Emp readUsersFromFile(String input) throws Exception{
        String[] split = input.split(",");
        String name =split[0];
        String age = split[1];
        String a = split[2];
        String b = split[3];
        return new Emp(name,Integer.parseInt(age),Integer.parseInt(a),Integer.parseInt(b));
    }


    public static List<Emp>  serial(List<Emp> objects){
        String filename = "shubham.txt";
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
