package W1.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyJPanel extends JPanel{


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int howManySquares =8;
        int width =60;
        int height =60;
        int gapW = 20; // oś x przesunięcie
        int gapH =120; // oś y przesunięcie
        int gapW2 =gapW;

        g.drawRect(gapW,gapH,width*howManySquares,height*howManySquares);
        g.setColor(Color.DARK_GRAY);
        for (int i = 0; i < howManySquares; i++) {
            for (int j = 0; j < howManySquares/2 ; j++) {
                if(i%2==0){
                    g.setColor(Color.DARK_GRAY);
                    g.fillRect(gapW, gapH, width, height);
                    gapW+=2*width;
                }else{
                    g.setColor(Color.DARK_GRAY);
                    g.fillRect(gapW+height, gapH, width, height);
                    gapW+=2*width;
                }
            }
            gapW=gapW2;
            gapH+=height;
        }

    }



    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(1000,1000);
    }
}
class Lekcja3 {
    public static void main(String[] args) {
        JFrame ramka = new JFrame("Chess board");
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.add(new MyJPanel());

        ramka.pack();


    }
}