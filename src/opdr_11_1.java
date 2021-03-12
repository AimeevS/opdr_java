import java.applet.Applet;
import java.awt.*;


public class opdr_11_1 extends Applet {

    public void paint(Graphics g){
        for(int i = 10; i <= 100; i+=10) {
            g.drawLine(i, 10, i, 100);
        }
    }

}
