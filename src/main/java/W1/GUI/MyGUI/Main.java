package W1.GUI.MyGUI;



import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {
        chessBoard();
        //house();


    }


    public static void chessBoard(){
        JFrame ramka = new JFrame("Chess board");
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new JPanel2(8,50,100,20));
        ramka.pack();

    }

    public static void house(){
        JFrame ramka = new JFrame("Chess board");
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new JPanel3(800,800,200,100,200,10));

        ramka.pack();
    }

}
