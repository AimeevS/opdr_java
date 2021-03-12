
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdr_12_5 extends Applet {
    String outputstr ="";
    TextField txt_field = new TextField("");
    Button btn_ok = new Button("OK");

    int[] getallen = {1,2,3,4,5,6,7,8,9,0};

    public void init(){
        btn_ok.addActionListener(new BtnOkHandler());
        add(txt_field);
        add(btn_ok);
    }

    public void paint(Graphics g){
        g.drawString(outputstr, 100, 100);
    }

    public class BtnOkHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(txt_field.getText());
            int index = -1;
            for(int i=0; i<getallen.length; i++){
                if(getallen[i] == input){
                    index = i;
                    break;
                }
            }

            if(index == -1){
                outputstr = "Geen index gevonden voor deze waarde";
            }else{
                outputstr = input + " is gevonden op index: " + index;
            }
            repaint();
        }
    }

}
