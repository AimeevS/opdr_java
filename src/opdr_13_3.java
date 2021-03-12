import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr_13_3 extends Applet{

    Button btn_rood;
    Button btn_grijs;

    boolean isRood = true;

    public void drawBrick(Graphics g, int x, int y, Color kleur_muur, int size){
        int width = 30 + size;
        int height = 10 + size;

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++) {
                g.setColor(kleur_muur);
                g.fillRect(x + j * (width+1), y + i * (height+1), width, height);
            }
        }

    }

    public void init(){
        btn_rood = new Button("Rood");
        btn_grijs = new Button("Grijs");

        btn_rood.addActionListener(new BtnRoodHandler());
        btn_grijs.addActionListener(new BtnGrijsHandler());
        add(btn_rood);
        add(btn_grijs);
    }

    public void paint(Graphics g){
        Color kleur = (isRood) ? Color.red : Color.gray;
        int size = (isRood) ? 0 : 5;

        drawBrick(g, 10, 30, kleur, size);

    }

    public class BtnRoodHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            isRood = true;
            repaint();
        }
    }

    public class BtnGrijsHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            isRood = false;
            repaint();
        }
    }

}
