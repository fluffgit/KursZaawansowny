package W1.GUI.MyGUI;

import javax.swing.*;
import java.awt.*;

public class JPanel4 extends JPanel {

    private int panelHeight;
    private int panelWidth;
    private int centerX;
    private int centerY;



    public JPanel4(int panelHeight, int panelWidth) {
        this.panelHeight = panelHeight;
        this.panelWidth = panelWidth;
        this.centerX = (int)((double)1/2*panelWidth);
        this.centerY = (int)((double)1/2*panelHeight);

    }




    @Override
    public int getWidth() {
        return panelWidth;
    }

    @Override
    public int getHeight() {
        return panelHeight;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(centerX-(int)((double)50/100*centerX),centerY-(int)((double)50/100*centerY),100,100);


    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(getWidth(),getHeight());

    }

    public Dimension getCenter(){
        return new Dimension(centerX,centerY);
    }


}

