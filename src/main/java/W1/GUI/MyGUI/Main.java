package W1.GUI.MyGUI;



import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        //chessBoard();
        //house();
        test();


    }


    public static void chessBoard(){
        JFrame ramka = new JFrame();
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new JPanel2(8,50,100,20));
        ramka.setTitle("Chess board");
        ramka.pack();
    }

    public static void house(){
        JFrame ramka = new JFrame("Chess board");
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new JPanel3(800,800,100,300,400,30));
        ramka.pack();
    }

    public static void test(){

        JFrame ramka = new JFrame("test");
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new JPanel4(200,200));
        ramka.pack();

        JButton button1 = new JButton("Żółty");




    }

}
