package W1.GUI.MyGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JPanel2 extends JPanel {




    private int howManySquares;
    private int width;
    private int height;
    private int gapW;
    private int gapH;
    private int totalWidth;
    private int totalHeight;


    public JPanel2(int howManySquares, int lenght, int gapW, int gapH) {
        this.howManySquares = howManySquares;
        this.width = lenght;
        this.height = lenght;
        this.gapW = gapW;
        this.gapH = gapH;
        this.totalWidth = gapW*2+width*howManySquares;
        this.totalHeight = gapH*2+height*howManySquares;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // font
        g.setFont(new Font("TimesRoman", Font.BOLD, 12));







        int howManySquares = this.howManySquares;
        int width = this.width;
        int height = this.height;
        int gapW = this.gapW;
        int gapH = this.gapH; // oś y przesunięcie
        int gapW2 = gapW;



        g.drawString("Wyświetlany tekst nada tablicą",gapW, (int)(gapH-(double)1/5*gapH));

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
        return new Dimension(getWidth(), getHeight());
    }

    @Override
    public int getWidth() {
        return totalWidth;

    }

    @Override
    public int getHeight() {
        return totalHeight;
    }
}
