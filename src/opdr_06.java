import java.applet.Applet;
        import java.awt.*;

public class opdr_06 extends Applet {
    double numberOfFriends;
    double moneyPerFriend;
    double  money;
    int seconds;
    int minits;
    int secinhour;
    int hoursinday;
    double secinday;
    double secinyear;
    double daysinyear;
    double cijvereen;
    double cijvertwe;
    double cijverdrie;
    double deler;
    double gemmidelde;
    String tekst; //reeks van karakters, die tussen "" staat
    public void init(){
        numberOfFriends = 4;
        money= 113;
        moneyPerFriend= money/numberOfFriends;

        seconds= 60;
        minits = 60;
        secinhour = seconds*minits;

        hoursinday = 24;
        daysinyear = 365;
        secinday = secinhour*hoursinday;
        secinyear = secinday*daysinyear;

        cijvereen =  5.9;
        cijvertwe = 6.3;
        cijverdrie = 6.9;
        deler = 3;
        gemmidelde = cijvereen+cijvertwe+cijverdrie/deler;


        tekst = "Hallo";

    }
    public void paint(Graphics graph){
        graph.drawString("Jan = "+moneyPerFriend, 25, 25);
        graph.drawString("Ali = "+moneyPerFriend, 25, 40);
        graph.drawString("Jeannette = "+moneyPerFriend, 25, 55);
        graph.drawString("Aimee = "+moneyPerFriend, 25, 70);

        graph.drawString("seconds in a hour = "+secinhour, 25, 100);
        graph.drawString("seconds in a day = "+secinday, 25, 120);
        graph.drawString("seconds in a day = "+secinyear, 25, 140);

        graph.drawString("het gemmidelde is = "+gemmidelde, 25, 170);


    }
}
