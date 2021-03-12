import java.applet.Applet;
import java.awt.*;

public class opdr_11_6 extends Applet{

    public void paint(Graphics g){

        int x = 190;
        int y = 140;
        int size = 10;
        int size_increase = size;

        for (int i = 0; i<5; i++){
            g.drawOval(x,y,size,size);
            x-= size_increase/2;
            y-= size_increase/2 ;
            size += size_increase;
        }
    }

}
