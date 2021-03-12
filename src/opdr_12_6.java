import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class opdr_12_6 extends Applet {
    String outputstr ="";
    TextField txt_field = new TextField("");
    Button btn_ok = new Button("OK");

    int[] getallen = {1,2,4,4,9,9,9,6,6,6,0};

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
            int count = 0;
            for(int i=0; i<getallen.length; i++){
                if(getallen[i] == input){
                    count++;
                }
            }

            outputstr = input + " bestaat: " + count + " keer";
            repaint();
        }
    }

}
