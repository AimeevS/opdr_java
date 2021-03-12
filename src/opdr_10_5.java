import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class opdr_10_5 extends Applet {
    Button btn_submit;
    TextField txt_cijfer;
    double vijf = 5.5;
    float gemiddeld;
    String resultaat = "N/A";
    String voldoende = "";
    ArrayList<Float> cijfer_lijst = new ArrayList<Float>();

    public void init() {
        btn_submit = new Button("enter");
        txt_cijfer = new TextField("", 4);
        btn_submit.addActionListener(new Btn_EnterListener());
        add(txt_cijfer);
        add(btn_submit);
    }

    public void paint(Graphics g){
        g.drawString("Gemiddelde: " + gemiddeld, 10, 40);
        g.drawString("Resultaat: " + resultaat, 10, 60);
    }

    class Btn_EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                float totaal = 0;

                String input_cijfers = txt_cijfer.getText();
                float cijfer_input = Float.parseFloat(input_cijfers);

                // Shorthand if else
                // als de conditie true is, geeft hij "Onvoldoende terug" anders "Voldoende"
                voldoende = (cijfer_input < vijf) ? "Onvoldoende" : "Voldoende";

                cijfer_lijst.add(cijfer_input);

                // loopt voor elk getal in cijfer_lijst en telt het getal op bij totaal
                for(Float cijfer : cijfer_lijst){
                    totaal += cijfer;
                }

                gemiddeld = totaal / cijfer_lijst.size();
                resultaat = (gemiddeld > vijf) ? "Geslaagd" : "Gezakt";

                repaint();
        }
    }
}
/* acijver invoeren voldoende of nie
gemiddle de geslaagd gemmidelde
refresh :D
 */


