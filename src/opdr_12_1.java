import java.applet.Applet;
import java.awt.*;


public class opdr_12_1 extends Applet {

    String str_getallen = "Getallen: ";
    String str_gemiddelde = "Gemiddelde: ";

    public void init(){
        int[] getallen = {4, 6, 3, 8, 45, 23, 21, 92, 38, 10};
        int totaal = 0;
        int gemiddelde;

        for(int i=0; i < getallen.length; i++){
            totaal+= getallen[i];
            str_getallen += getallen[i] + " ";
        }
        gemiddelde = totaal / getallen.length;
        str_gemiddelde += gemiddelde;
    }


    public void paint(Graphics g){
        g.drawString(str_getallen, 10, 20);
        g.drawString(str_gemiddelde, 10, 35);
    }


}
