import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdr_14_1 extends Applet{

    String str_output = "";
    Button btn_ok = new Button("Deel Kaart");

    String[] kleuren = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] waarde= {
            "Aas",
            "Heer",
            "Vrouw",
            "Boer",
            "Tien",
            "Negen",
            "Acht",
            "Zeven",
            "Zes",
            "Vijf",
            "Vier",
            "Drie",
            "Twee"
    };

    public void init(){
        btn_ok.addActionListener(new Btn_OK_Handler());
        add(btn_ok);
    }

    public void paint(Graphics g){
        g.drawString(str_output, 10, 30);

    }

    public class Btn_OK_Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){

            int random_kleur = (int)(Math.random() * 4);
            int random_nummer = (int)(Math.random() * 13);
            
            String kleur = kleuren[random_kleur];
            String getal = waarde[random_nummer];

            str_output = kleur + " " + getal;
            repaint();
        }
    }

}
