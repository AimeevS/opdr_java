import java.applet.Applet;
import java.awt.*;

public class oevening_1 extends Applet {

    Dimension window;


    //===========eigenschappen van de bal===========
    int ball_x = 400;
    int ball_y = 100;
    int ball_speed = 10;
    int ball_width = 20;
    int ball_height = 20;
    boolean directionX = true; //false = links, true = rechts
    boolean directionY = true; //false = omhoog, true = omlaag
    //==============================================

    //===========eigenschappen van het betje===========
     int betje_x = 30;
     int betje_y = 200;
     int betje_width = 10;
     int betje_height = 50;
    //==============================================



    public void init() {
        window = this.getSize();
    }

    public void paint(Graphics g){

        draw_ball(g);
        ball_movement();

        draw_betje(g);
        betje_movement();

        t_sleep(20);
        repaint();

    }

    public void draw_betje(Graphics g){
        g.fillRect(betje_x,betje_y,betje_width,betje_height);
    }

    public void betje_movement(){
      betje_y = ball_y - 20;
    }


    public void draw_ball(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(ball_x, ball_y, ball_width, ball_height);
    }

    public void ball_movement(){
        if(ball_x == window.width-ball_width){
            directionX = false;
        }

        if(ball_x == 0){
            directionX = true;
        }

        if (directionX== false){
            ball_x-=ball_speed;
        }
        else{
            ball_x+=ball_speed;
        }


        if(ball_y == window.height-ball_width){
            directionY = false;
        }

        if(ball_y == 0){
            directionY = true;
        }

        if (directionY== false){
            ball_y-=ball_speed;
        }
        else{
            ball_y+=ball_speed;
        }
    }

    public void t_sleep(int milisec){
        try{
            Thread.sleep(milisec);
        }catch(Exception e){}
    }

}

