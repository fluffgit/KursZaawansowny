package W1.GUI.MyGUI;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

public class JPanel2 extends JPanel {

    private Dimension wielosc;

    public Dimension getWielosc() {
        return wielosc;
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int howManySquares =8;
        int width =60;
        int height =60;
        int gapW = 20; // oś x przesunięcie
        int gapH =20; // oś y przesunięcie
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

        //return new Dimension(gapW*2+howManySquares*8,gapH*2+howManySquares*(howManySquares/2));
        // czy da się zrobić coś takiego?
    }



    @Override
    public Dimension getPreferredSize() {

        return new Dimension(500,500);
    }




}
