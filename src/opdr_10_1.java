import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class opdr_10_1  extends Applet {
    TextField txt_number;
    Button btn_ok;
    Label lbl_max;


    int max_nr = Integer.MIN_VALUE;


    public void init() {
        txt_number = new TextField("", 5);
        btn_ok = new Button("OK");
        lbl_max = new Label("                 ");

        btn_ok.addActionListener(new BtnListener());

        add(txt_number);
        add(btn_ok);
        add(lbl_max);
    }


    class BtnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input_str = txt_number.getText();
            int input_int;

            if(input_str.length() != 0){
                input_int = Integer.parseInt(input_str);
                if(input_int > max_nr){
                    max_nr = input_int;
                    lbl_max.setText("Max: " + max_nr);
                }

            }

        }
    }
}

