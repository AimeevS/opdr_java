import java.applet.Applet;
import java.awt.*;

public class opdr_11_9 extends Applet{

    public void paint(Graphics g){
        int x = 10;
        int y = 10;
        int size = 30;
        Color kleur;
        int aantal = 0;

        g.drawRect(x-1, y-1, size*8+1, size*8+1);

        for(int i = 0; i<8; i++){
            for(int j=0; j<8; j++) {
                kleur = (aantal % 2 == 0) ? Color.WHITE : Color.BLACK;
                g.setColor(kleur);
                g.fillRect(x + i*size, y + j*size, size, size);
                aantal++;
            }
            aantal++;
        }

    }

}