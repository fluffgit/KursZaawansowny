package W1.Files01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
       File plik = new File("plik.txt");



////        plik.createNewFile();
//
//        PrintWriter pw = new PrintWriter("plik.txt");
//        pw.println("komunikat");        //zapisanie do bufora
//        pw.print("aaa");
////        pw.close();                     //przepisanie z bufora do pliku i zamknięcie pliku
//        pw.flush();                     //zapisanie z bufora bez zamykania z pliku

//        Scanner scanner = new Scanner(plik);
//
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();

        //System.out.println(plik.getAbsolutePath()); // pobierz ścieżkę pliku >> C://~~

        //print01(1,4);

//        print02(1,4);

//        Pies pies = new Pies("burek","buldog",20,2000,12,01);
//        Pies pies2 = new Pies("fafik","Samoyed",30);
//        System.out.println(pies);
//        System.out.println(pies2);
//        pies.setBirthDay2(2000,12,11);
//        pies2.setBirthDay2(2000,10,12);
//        System.out.println(pies);
//        System.out.println(pies2);
//        System.out.println(pies.getAge());

        String path ="C:\\Users\\Marcin\\Desktop\\różne";
//
//        printFolder(path);
//        System.out.println("=============");
//
        //copyfile("test.txt","test2.txt",path,path);

        printSynchro2("test.txt","test2.txt",path,path);

        //System.out.println(silnia2(5));
        //System.out.println(decimalsToBinary(8));

        //printFolder2(path);

    }

    public static void print01(int start, int stop){
        while(start!=stop){
            System.out.println(start);
            if(start>stop){
                start--;
            }else{
                start++;
            }
        }
    }

    public static void print02(int start, int stop){
        //rekurencja
        //sout na początku wypisze liczby od 1 do 4
        // najpierw wyświetlamy potem schodzimy w doł
        //System.out.println( start);
        if(start>stop) {
            print02(start - 1, stop);
        }
        if(start<stop){
            print02(start+1,stop);
        }
        //sout na początku wypisze liczby od 4 do 1
        // schodzimy do samego dołu a potem od końca wyświetlanie
        System.out.println( start);
    }

    public static void printFolder(String path) throws FileNotFoundException {
        File file = new File(path);
        File[] list = file.listFiles();
        for(File e :list){
            if(e.getName().endsWith("pdf")|| e.getName().endsWith("txt")||e.getName().endsWith("doc")||e.getName().endsWith("docx")){
                System.out.println(e.getName());
            }
        }
    }


    public static void copyfile(String fileName,String fileName2, String path, String path2) throws FileNotFoundException {
        File file = new File(path + "\\" + fileName);
        File file2 = new File(path2 + "\\" + fileName2);
        System.out.println(file);
        if (file.exists()) {
            System.out.println("istnieje");
            PrintWriter pw = new PrintWriter(file2);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                pw.println(scanner.nextLine());
            }
            pw.close();
            scanner.close();
        }
    }


    public static void printSynchro(String fileName,String fileName2, String path, String path2) throws FileNotFoundException {
        File file = new File(path + "\\" + fileName);
        File file2 = new File(path2 + "\\" + fileName2);
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file2);
        System.out.println(file);
        if (file.exists() && file2.exists()) {
            while(scanner.hasNextLine() || scanner2.hasNextLine()) {

                if (scanner.hasNextLine()) {
                    System.out.print(scanner.nextLine());
                }
                if (scanner2.hasNextLine()) {
                    System.out.print(scanner2.nextLine()+"\n");
                }

            }
        }
    }

    public static void printSynchro2(String fileName,String fileName2, String path, String path2) throws FileNotFoundException {
        File file = new File(path + "\\" + fileName);
        File file2 = new File(path2 + "\\" + fileName2);
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file2);
        System.out.println(file);
        if (file.exists() && file2.exists()) {
            while(scanner.hasNextLine() && scanner2.hasNextLine()) {
                System.out.println(scanner.nextLine()+" "+scanner2.nextLine());
            }

                if (scanner.hasNextLine()) {
                    System.out.print(scanner.nextLine());
                }
                if (scanner2.hasNextLine()) {
                    System.out.print(scanner2.nextLine());
                }


        }
    }

    public static int silnia(int n){
        int sum=1;
        for (int i = 1; i <= n; i++) {
            sum = i * sum;
        }
        return sum;
    }

    public static int silnia2(int n){
        if(n<1){
            return 1;
        }else{
            return n* silnia2(n-1);
        }
    }

    public static String decimalsToBinary(int i) {
        StringBuilder wynik = new StringBuilder();
        int[] tab = new int[20];
        int temp = 0;
        while (i > 0) {
            tab[temp++] = i % 2;
            i = i / 2;
        }
        for (int j = temp - 1; j >= 0; j--) {
            wynik.append(tab[j]);
        }
        return wynik.toString();
    }

    public static void printFolder2(String path){
        File file = new File(path);
        File[] lista = file.listFiles();
        for(File f : lista){
            if(f.isDirectory()){
                printFolder2(f.getAbsolutePath());
            }
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }
    }


}

