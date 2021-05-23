import processing.core.*;

import java.util.ArrayList;
//Author: Louis T
public class BallGame extends PApplet {
    boolean start = false;
    Ball player;
    Ball test;
    Ball enemy;
    Ball enemy1;
    Ball enemy2;
    Square square1;
    Square square2;
    Triangle triangle1;
    Triangle triangle2;
    Score scoreboard;
    ArrayList<Shape> elements = new ArrayList<>();
    TextBoard welcome;
    Timer timer;


    public void setup() {
        player = new Ball(50, this, 1);
        enemy = new Ball(30, this, 2);
        enemy1 = new Ball(30, this, 2);
        enemy2 = new Ball(30, this, 1);
        square1 = new Square(this, 40);
        square2 = new Square(this, 40);
        triangle1 = new Triangle(this);
        triangle2 = new Triangle(this);
        scoreboard = new Score(this);
        welcome = new TextBoard(this, "Press Space To Start");
        timer = new Timer(5000,this);


        player.setColor(1);
        enemy.setColor(2);
        enemy1.setColor(2);
        enemy2.setColor(2);
        square1.setColor(2);
        square2.setColor(2);
        triangle1.setColor(3);
        triangle2.setColor(3);

        enemy.resetToTop();
        enemy1.resetToTop();
        enemy2.resetToTop();
        square1.resetToLeft();
        square2.resetToLeft();
        triangle1.resetToTop();
        triangle2.resetToLeft();

        elements.add(player);
        elements.add(enemy);
        elements.add(enemy1);
        elements.add(enemy2);
        elements.add(square1);
        elements.add(square2);
        elements.add(triangle1);
        elements.add(triangle2);

    }


    public void draw() {
        background(102, 145, 255);
        if (start == true) {
            player.moveByMouse(mouseX, mouseY);

            enemy.moveLeftToRight(7);
            enemy1.moveLeftToRight(7);
            enemy2.moveLeftToRight(7);

            square1.moveUpToDown(7);
            square2.moveUpToDown(4);

            triangle1.moveSideways(7);
            triangle2.moveSideways(7);

            scoreboard.show();

            timer.subtract();
            timer.show();

            if(timer.time == 0){
                start = false;
            }


            for (int i = 0; i < elements.size(); i++) {
                Shape x = elements.get(i);
                x.drawShape();
                if (player == x) {
                    continue;
                }
                boolean touch = player.isTouch(x);
                if (touch) {
                    if (x instanceof Triangle) {
                        scoreboard.add(1);
                    } else if (x instanceof Ball || x instanceof Square) {
                        scoreboard.add(-1);
                    }
                }
            }
        }else{
            welcome.drawShape();
        }

    }

    public void settings() {
        size(800, 800);
    }

    static public void main(String[] passedArgs) {
        String[] appletArgs = new String[]{"BallGame"};
        if (passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }

    public void keyPressed(){
        if (keyCode == 32 && start == false){
            start = true;
        }
    }
}
