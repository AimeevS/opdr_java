import java.applet.Applet;
import java.awt.*;


public class opdr_11_2 extends Applet{

    public void paint(Graphics g){
        String nummers = "";

        for (int i=20; i>=10; i--){
            nummers += (" " + i);
        }

        g.drawString(nummers, 10, 20);
    }

}
