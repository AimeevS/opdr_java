import java.awt.*;
import java.applet.*;
import java.util.Arrays;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class opdr_12_3 extends Applet{
    TextField[] txtfields = new TextField[5];
    int[] getallen = new int[5];
    Button btn_ok;
    public void init(){

        for(int i=0; i < txtfields.length; i++){
            txtfields[i] = new TextField();
            add(txtfields[i]);
        }
        btn_ok = new Button("OK");
        btn_ok.addActionListener(new BtnOkHandler());
        add(btn_ok);
    }


    public class BtnOkHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for(int i =0; i<txtfields.length; i++){
                getallen[i] = Integer.parseInt(txtfields[i].getText());
            }

            Arrays.sort(getallen);

            for(int i =0; i<txtfields.length; i++){
                txtfields[i].setText(String.valueOf(getallen[i]));
            }

        }
    }

}
