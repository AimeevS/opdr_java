import java.applet.Applet;
import java.awt.*;

public class opdr_11_7 extends Applet{

    public void paint(Graphics g){

        int x = 190;
        int y = 145;
        int size = 6;
        float size_increase = size;

        for (int i = 0; i<50; i++){
            g.drawOval(x,y,size,size);
            x-= size_increase/2;
            y-= size_increase/2 ;
            size += size_increase;
        }
    }

}