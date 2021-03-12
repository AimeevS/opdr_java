import java.applet.Applet;
import java.awt.*;

public class opdr_11_8 extends Applet{

    public void paint(Graphics g){

        int x = 10;
        int y = 10;
        int size = 6;
        float size_increase = size;

        for (int i = 0; i<50; i++){
            g.drawOval(x,y,size,size);
            size += size_increase;
        }
    }

}