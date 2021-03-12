import java.awt.*;
import java.applet.*;

public class opdr_13_2 extends Applet{

    public void drawBrick(Graphics g, int x, int y){
        int width = 30;
        int height = 10;

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++) {
                g.setColor(Color.red);
                g.fillRect(x + j * (width+1), y + i * (height+1), width, height);
            }
        }

    }


    public void paint(Graphics g){
        drawBrick(g, 10, 10);
    }

}
