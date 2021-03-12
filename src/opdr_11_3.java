import java.applet.Applet;
import java.awt.*;


public class opdr_11_3 extends Applet {
     public void paint(Graphics g){

         int aantal_nummers = 20;

         int[] nummerlijst = new int[aantal_nummers];
         String resultaat = "";

         nummerlijst[0] = 1;
         nummerlijst[1] = 1;

         resultaat = nummerlijst[0] + " " + nummerlijst[1];

         for(int i= 2; i<aantal_nummers; i++){
             int som = nummerlijst[i-2] + nummerlijst[i-1];
             nummerlijst[i] = som;
             resultaat += " " + som;
         }

         g.drawString(resultaat, 20, 20);

     }

}
