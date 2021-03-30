import java.awt.*;
import java.applet.*;

public class opdr_05 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        lijn (g); //call de naam van een methode bv drawDice
    }

    private void drawDice(Graphics g) {
        g.drawRoundRect(10, 10, 100, 100, 30, 30);
        g.setColor(Color.black);
        g.fillOval(30, 30, 20, 20);
        g.fillOval(70, 30, 20, 20);
        g.fillOval(70, 70, 20, 20);
        g.fillOval(30, 70, 20, 20);
    }

    private void drawTrafficLight(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(100, 50, 50, 150, 30, 30);
        g.fillRect(120, 200, 10, 100);
        g.setColor(Color.red);
        g.fillOval(105, 60, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(105, 100, 40, 40);
        g.setColor(Color.green);
        g.fillOval(105, 140, 40, 40);


    }

    private void drawPieChart(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100, 75, 200, 200);
        g.setColor(Color.blue);
        g.fillArc(100, 75, 200, 200, 90, 90);
    }

    private void drawWeightGraph(Graphics g) {
        int weightValerie = 40;
        int weightJeroen = 100;
        int weightHans = 80;
        int weightpon = 30;

        setBackground(Color.GRAY);

        g.drawLine(39, 100, 39, 200);
        g.drawLine(39, 200, 250, 200);

        g.setColor(Color.PINK);

        g.fillRect(40, 200 - weightValerie, 40, weightValerie);
        g.drawString("Valerie", 40, 210);
        g.setColor(Color.GREEN);
        g.fillRect(100, 200 - weightJeroen, 40, weightJeroen);
        g.drawString("Jeroen", 100, 210);
        g.setColor(Color.BLUE);
        g.fillRect(160, 200 - weightHans, 40, weightHans);

        g.drawString("Hans", 160, 210);
        g.setColor(Color.yellow);
        g.fillRect(260, 200 - weightpon, 40, weightpon);
        g.drawString("pon", 260, 210);

        g.setColor(Color.black);
        g.drawString("100KG", 0, 100);
        g.drawString("0KG", 0, 200);

    }

    private void drawDutchFlag(Graphics g) {
        setBackground(Color.yellow);
        g.drawLine(19, 20, 19, 200);
        g.setColor(Color.red);
        g.fillRect(20, 20, 100, 30);
        g.setColor(Color.white);
        g.fillRect(20, 50, 100, 30);
        g.setColor(Color.blue);
        g.fillRect(20, 80, 100, 30);

    }

    private void drawHouse(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawPolygon(new int[]{10, 60, 110}, new int[]{150, 50, 150}, 3);
        g.drawRect(10, 150, 100, 100);
        g.drawRect(20, 175, 20, 20);
        g.drawRect(75, 210, 20, 40);
    }

    //praktijk opdracht
    private void lijn (Graphics g) {
        g.setColor(Color.black);
        g.drawLine(20, 20, 220, 20);

        g.setColor(Color.black);
        g.drawRect(20, 40, 200, 100);

        g.setColor(Color.black);
        g.drawRoundRect(20, 150, 200, 100, 30, 30);


        g.setColor(Color.magenta);
        g.fillRect(240, 40, 200, 100);
        g.setColor(Color.black);
        g.drawRect(240, 40, 200, 100);
        g.setColor(Color.black);
        g.setColor(Color.magenta);
        g.fillArc(240, 40, 200, 100, 0, 360);
        g.setColor(Color.black);
        g.drawOval(240, 40, 200, 100);


        g.setColor(Color.magenta);
        g.fillArc(240, 150, 200, 100, 0, 360);
        g.setColor(Color.black);
        g.drawOval(240, 150, 200, 100);

        g.setColor(Color.magenta);
        g.fillArc(460, 40, 200, 100, 0, 45);
        g.setColor(Color.black);
        g.drawOval(460, 40, 200, 100);

        g.setColor(Color.black);
        g.drawOval(510, 150, 110, 110);
    }


}