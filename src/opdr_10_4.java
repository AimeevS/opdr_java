import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr_10_4 extends Applet {

    TextField txt_maand;
    TextField txt_jaar;
    Button btn_enter;
    String output = "";

    public void init() {
        txt_maand = new TextField("", 2);
        txt_jaar = new TextField("", 4);
        btn_enter = new Button("enter");
        btn_enter.addActionListener(new Btn_EnterListener());
        add(txt_maand);
        add(txt_jaar);
        add(btn_enter);
    }

    public void paint(Graphics g){
        g.drawString(output, 30, 60);
    }

    class Btn_EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str_jaar = txt_jaar.getText();
            String str_maand = txt_maand.getText();

            int nummer_jaar = Integer.parseInt(str_jaar);
            int dagen_feb = 28;

            if(nummer_jaar % 4 == 0){
                dagen_feb = 29;
            }

            switch (str_maand) {
                case "1":
                    output = "januari heeft 31 dagen";
                    break;
                case "2":
                    output = "februari heeft " + dagen_feb + " dagen";
                    break;
                case "3":
                    output = "maart heeft 31 dagen";
                    break;
                case "4":
                    output = "april heeft 30 dagen";
                    break;
                case "5":
                    output = "mei heeft 31 dagen";
                    break;
                case "6":
                    output = "juni heeft 30 dagen";
                    break;
                case "7":
                    output = "juli heeft 31 dagen";
                    break;
                case "8":
                    output = "agustus heeft 30 dagen";
                    break;
                case "9":
                    output = "september heeft 31 dagen";
                    break;
                case "10":
                    output = "november heeft 30 dagen";
                    break;
                case "11":
                    output = "oktober heeft 31 dagen";
                    break;
                case "12":
                    output = "december heeft 30 dagen";
                    break;
                default:
                    output = "Invalid";
                    break;
            }
            repaint();
        }
    }
}

