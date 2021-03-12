import java.applet.Applet;
import java.awt.*;

public class opdr_11_5 extends Applet {

    public void paint (Graphics g){
        int x = 20;
        int y = 20;
        int size = 30;

        for(int i=0; i<5; i++){
            g.drawRect(x,y,size,size);
            x += size;
            y += size;
        }

    }

}
