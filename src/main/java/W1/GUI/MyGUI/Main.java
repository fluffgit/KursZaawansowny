package W1.GUI.MyGUI;



import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {
        JFrame ramka = new JFrame("Chess board");
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new JPanel2());
        ramka.setSize(1000,1000);

        ramka.pack();


    }
}
