import java.applet.Applet;
import java.awt.*;


public class opdr_11_4 extends Applet {

    public void paint(Graphics g) {
        String resultaat = "";
        int tafel = 3;

        for (int i = 1; i < 11; i++) {
            resultaat += i * tafel + " ";
        }

        g.drawString(resultaat, 20, 20);
    }
}
