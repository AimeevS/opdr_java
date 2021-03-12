import java.applet.Applet;
import java.awt.*;


public class opdr_12_2 extends Applet {

    public void init(){
        Button[] knoppen = new Button[25];

        for(int i =0; i < knoppen.length; i++){
            knoppen[i] = new Button("knop");
            add(knoppen[i]);
        }
    }

}
