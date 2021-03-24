import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;


public class opdr_8_1 extends Applet {
    TextField txt_naam;
    Button btn_ok;
    Button btn_clear;
    String[] Namen ={};

    public void init() {
        txt_naam = new TextField("", 20);
        add(txt_naam);
        btn_ok = new Button("OK");
        btn_ok.addActionListener(new Btn_OK_handler());
        add(btn_ok);
        btn_clear = new Button("Clear");
        btn_clear.addActionListener(new Btn_Clear_handler());
        add(btn_clear);
    }

    public void drawname(int X,int Y, Graphics p,String[] Namen){
        for(int i = 0; i< Namen.length; i++){
            p.drawString(Namen[i], X, Y);
            Y+=10;
        }
    }

    public void paint(Graphics g){

        drawname(150, 50, g, Namen);

    }

    public class Btn_OK_handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String[] newNamen = new String[Namen.length+1];
            String input;

            input = txt_naam.getText();

            if(input.length() > 0){

                for(int i=0; i< Namen.length; i++){
                    newNamen[i] = Namen[i];
                }

                newNamen[Namen.length] = input;
                Namen = newNamen;
                txt_naam.setText("");
            }

            repaint();
        }
    }

    public class Btn_Clear_handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Namen = new String[0];

            repaint();
        }
    }
}
