package W1.GUI.MyGUI;

import javax.swing.*;
import java.awt.*;

public class JPanel2 extends JPanel {



    private static final boolean layout = true;
    private int howManySquares;
    private int width;
    private int height;
    private int gapW;
    private int gapH;


    public JPanel2(int howManySquares, int lenght, int gapW, int gapH) {
        this.howManySquares = howManySquares;
        this.width = lenght;
        this.height = lenght;
        this.gapW = gapW;
        this.gapH = gapH;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int howManySquares = this.howManySquares;
        int width = this.width;
        int height = this.height;
        int gapW = this.gapW;
        int gapH = this.gapH; // oś y przesunięcie
        int gapW2 = gapW;

        g.drawRect(gapW, gapH, width * howManySquares, height * howManySquares);
        g.setColor(Color.DARK_GRAY);
        for (int i = 0; i < howManySquares; i++) {
            for (int j = 0; j < howManySquares / 2; j++, gapW += 2 * width) {
                g.setColor(Color.DARK_GRAY);
                if (i % 2 == 0) {
                    g.fillRect(gapW, gapH, width, height);
                } else {
                    g.fillRect(gapW + height, gapH, width, height);
                }
            }
            gapW = gapW2;
            gapH += height;
        }




    }




    @Override
    public Dimension getPreferredSize() {

        return new Dimension(setWidth(), setHeight());

    }


    private int setWidth() {
        return gapW*2+width*howManySquares ;

    }

    private int setHeight() {
        return gapW*2+height*howManySquares ;

    }






}
