import java.applet.Applet;
import java.awt.*;

public class opdr_13_1 extends Applet{

    public void driehoek(Graphics g,int x1, int y1, int x2, int y2, int x3, int y3){
        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {y1, y2, y3};
        g.drawPolygon(xPoints, yPoints, 3);
    }


    public void paint(Graphics g){
        driehoek(g, 150, 10, 10, 100, 290, 100);
    }

}
