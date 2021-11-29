package W1.IO;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        ArrayList<String> data = dataToArray();
//        System.out.println(data);
//          fileTest4();
//        fileTest5();
//        fileTest6();
//        fileTest7();
//        writeToFile();
 //           printFolderElements();
//        readFiles();
//            appendFile("plik.txt","nowa linia");

 //      System.out.println(longestword());

//        ArrayList<User> users = datatoArray2();
//        System.out.println(users);



        ArrayList<Movie> films = new ArrayList<>();
        ArrayList<Movie> films2 = fileTest9(films);
        System.out.println(films2);
        arrayToFile(films2);


    }

    public static ArrayList<Movie> arrayToFile(ArrayList<Movie> films){
            try {
                String filename = "C:\\Users\\Marcin\\IdeaProjects\\JavaZaawansowana\\moivies.txt";
                FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fos);

                out.writeObject(filename);
                out.close();
                fos.close();

            }catch(Exception e) {
                e.printStackTrace();

            }



            return films;
    }



    private static ArrayList<Movie> fileTest9(ArrayList<Movie> films) {
        try{
            boolean run = true;
            Scanner scanner = new Scanner(System.in);
            while (run){
                if(scanner.hasNext()) {


                    String title = scanner.nextLine();
                    String director = scanner.nextLine();
                    String genre = scanner.nextLine();
                    String year = scanner.nextLine();
                    films.add(new Movie(title, genre, director, year));
                }
                if(scanner.nextLine().equals("exit")){
                    run =false;
                }

            }

        }catch(Exception e) {
            e.printStackTrace();

        }
        return films;
    }

    private static ArrayList<Movie> fileTest9a(ArrayList<Movie> films) {
        try{
            Scanner scanner = new Scanner(System.in);
            String object ="";
            boolean run = true;
            while(run){
                object =scanner.nextLine();
                if(object.equals("exit")){
                    run = false;
                }
                //films.add(stringToObject(object));
            }
        }catch(Exception e) {
        e.printStackTrace();

    }
        return films;
    }

    public static Movie stringToObject(String title, String genre, String director, String year){
        return new Movie(title,genre,director,year);
    }

    public static User readUsersFromFile(String input) throws Exception{
        String[] split = input.split(",");
        String surname =split[0];
        String name = split[1];
        String age="";
        int age2;
        try{
            age2 =Integer.parseInt(split[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            age2 =0;
        }
        if(age.length()==0){
            return new User(surname,name);
        }else return new User(surname,name,age2);
    }

    public static ArrayList<User> datatoArray2() throws Exception {
        String path = "C:\\Users\\Marcin\\IdeaProjects\\JavaZaawansowana\\plik2.txt";
        Scanner scanner = new Scanner(Path.of(path));
        ArrayList<User> users = new ArrayList<>();
        while(scanner.hasNextLine()){
            String nextUser = scanner.nextLine();
            User user = readUsersFromFile(nextUser);
            users.add(user);
        }
        return users;
    }





    public static String longestword() throws IOException {
        String path = "C:\\Users\\Marcin\\IdeaProjects\\JavaZaawansowana\\plik.txt";
        String stringReturn="";
        int counter =0;
        Scanner scanner = new Scanner(Path.of(path));

        while(scanner.hasNextLine()){
            String temp = scanner.next();
            if(temp.length()>counter){
                stringReturn = temp;
                counter = temp.length();
            }
        }
        return stringReturn;
    }




    public static void appendFile(String path,String txt){
        try{
            FileWriter fw =  new FileWriter(path,true);
            fw.write(txt);
            fw.close();

            StringBuilder sb = new StringBuilder();
            String line ="";
            BufferedReader br = new BufferedReader((new FileReader(path)));

            while (line!=null){
                sb.append(line);
                sb.append("\n");
                line =br.readLine();
            }
            System.out.println(sb);

        }catch (Exception e){
            e.printStackTrace();
        }


    }


    public static void readFiles (){
        String path = "C:\\Users\\Marcin\\IdeaProjects\\JavaZaawansowana\\plik.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String str="";

            while ((str =br.readLine())!=null){
                System.out.println(str);
            }

        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    private static void writeToFile() throws FileNotFoundException {
        String path = "C:\\Users\\Marcin\\IdeaProjects\\JavaZaawansowana\\plik.txt";

        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);

        if (file.exists()){
            Scanner scanner = new Scanner(System.in);
            int i =0;
            while(scanner.hasNextLine() && i<5){
                pw.write(scanner.nextLine());
                pw.flush();
                i++;
            }


        }
        pw.close();

    }

    private static void readFileLines() throws IOException {
        String path = "C:\\Users\\Marcin\\IdeaProjects\\JavaZaawansowana\\plik.txt";
        Scanner scanner = new Scanner(Path.of("plik.txt"));
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }



    }

    private static void printFolderElements() {
        String path ="C:\\Users\\Marcin\\Desktop\\polisa";
        File file = new File(path);
        File[] list = file.listFiles();

        for(File element :list){
            if(element.isFile()){
                System.out.println(element.getName());
            }else{
                System.out.println(element.getAbsolutePath());
            }


        }



    }

    private static void fileTest5() throws IOException {
        Path path = Paths.get("plik.txt");
        Files.createFile(path);
        Files.write(path, "text...1\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "text....2\n".getBytes(),StandardOpenOption.APPEND);
        Files.write(path, "text.....3\n".getBytes(),StandardOpenOption.APPEND);
        for(String line : Files.readAllLines(path)){
            System.out.println(line);
        }
        //Files.delete(path);
    }

    private static ArrayList<String> dataToArray() throws IOException {
        ArrayList<String> data = new ArrayList<>();
        Scanner scanner = new Scanner(Path.of("plik.txt"));
        String temp = null;
        while(scanner.hasNext()){
            data.add(scanner.next());
        }
        return data;
    }

    private static void fileTest() throws IOException {
        FileInputStream in = new FileInputStream("plik.txt");
        FileOutputStream out = new FileOutputStream ("plik_out.txt");
        int c;
        while((c =in.read())!=-1){
            out.write(c);
            //System.out.println((char)c);
        }
        out.close();
    }


    private static void fileTest2() throws IOException {
        FileReader in = new FileReader("plik.txt");
        FileWriter out = new FileWriter("plik_out.txt");
        int nextChar;
        while((nextChar = in.read())!=-1){
            out.append((char)nextChar);
            System.out.print((char)nextChar);
        }
        out.close();
    }

    private static void fileTest3() throws IOException {
        BufferedReader in  = new BufferedReader(new FileReader("plik.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("plik_out.txt"));

        String line;
        while((line = in.readLine())!=null){
            out.write(line);
            System.out.print(line);

        }

        out.close();
    }


    private  static void fileTest4(){
        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "sda";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }
        System.out.println(Arrays.toString(buffer.array()));
    }


}
