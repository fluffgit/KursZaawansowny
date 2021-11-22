package W1.GUI.MyGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class JPanel3 extends JPanel {

    private int CanvasX;
    private int CanvasY;

    private int houseX;
    private int houseY;
    private int houseLenght;
    private int roofExtend;
    private double xWallToDoor;
    private double xWallToWindow;
    private double xWallToWindow2;
    private double xWindowLen;

    public JPanel3(int canvasX, int canvasY, int houseX, int houseY, int houseLenght, int roofExtend) {
        this.CanvasX = canvasX;
        this.CanvasY = canvasY;
        this.houseX = houseX;
        this.houseY = houseY;
        this.houseLenght = houseLenght;
        this.roofExtend = roofExtend;
        this.xWallToDoor = (double)10/100*houseLenght;
        this.xWallToWindow = (double) 33/100*houseLenght;
        this.xWallToWindow2 = (double) 66/100*houseLenght;
        this.xWindowLen =(double)20/100*houseLenght;



    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        g.drawRect(houseX,houseY,houseLenght,100);

        int[]x ={houseX-roofExtend,houseLenght/2+houseX,houseLenght+houseX+roofExtend};
        int[]y ={houseY,houseY-50,houseY};
        g.drawPolygon(x,y,3);
        g.drawRect(houseX+(int)xWallToDoor,houseY+30,(int)xWindowLen,70);
        g.drawRect(houseX+(int)xWallToWindow,houseY+20,(int)xWindowLen,40);
        g.drawRect(houseX+(int)xWallToWindow2,houseY+20,(int)xWindowLen,40);

//        int[]x2 ={houseX+roofExtend+40,houseLenght/2+houseX,houseLenght/2+houseX-roofExtend};
//        int[]y2 ={houseX-20,houseY-40,houseY-20};
//        g.drawPolygon(x2,y2,3);








    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(this.CanvasX,this.CanvasY);

    }



}
