import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class opdr_14_2 extends Applet {
    int spelers = 4;
    URL pad;
    AudioClip sound;
    String str_output = "";
    Button btn_ok = new Button("Deel Kaart");
    String[] deck;
    String[][] verdeelde_kaarten;
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

    public String[] generateDeck(){
        int deck_size = kleuren.length * waarde.length;
        String[] result = new String[deck_size];
        int counter = 0;

        for(int i=0; i< kleuren.length; i++){
            for(int j=0; j< waarde.length; j++){
                result[counter] = kleuren[i] + waarde[j];
                counter++;
            }
        }

        return result;
    }


    private String deelKaart() {
        int random =  (int)(Math.random() * deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];

        int hulpindex = 0;
         for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }

        deck = hulpLijst;

        return kaart;
    }

    public void verdeelKaarten(){
        int kaartenPerSpeler = deck.length / spelers;
        verdeelde_kaarten = new String[spelers][kaartenPerSpeler];

        for(int i = 0; i<spelers; i++){
            for(int j=0; j<kaartenPerSpeler; j++){
                verdeelde_kaarten[i][j] = deelKaart();
            }
        }
    }

    public void init(){
        btn_ok.addActionListener(new Btn_OK_Handler());
        add(btn_ok);


    }

    public void showCards(Graphics g){
        int starty = 50;
        int x = 10;
        int y = starty;
        for(int i=0;i<spelers; i++){
            g.drawString("Speler" + (i+1), x, y);

            for(int j=0; j<verdeelde_kaarten[i].length; j++){
                y+= 20;
                g.drawString(verdeelde_kaarten[i][j], x, y);

            }
            y=starty;
            x+= 100;
        }
    }



    public void paint(Graphics g){

        if(verdeelde_kaarten != null){
            showCards(g);
            pad = opdr_14_2.class.getResource("/resources/");
            sound = getAudioClip(pad, "scream.wav");
            sound.play();
        }

    }

    public class Btn_OK_Handler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            deck = generateDeck();
            verdeelKaarten();
            repaint();
        }
    }

}
