import processing.core.PApplet;

public abstract class Shape {
    float x;
    float y;
    BallGame main;
    int colorCode;
    int type;

    public Shape(BallGame main) {
        this.main = main;
        int x = (int) (Math.random() * 2);
        type = x;
    }


    abstract public void drawShape();

    public void moveLeftToRight(int speed) {
        x = x + speed;
        if (x > 800) {
            resetToLeft();
        }
    }

    public void moveUpToDown(int speed) {
        y = y + speed;
        if (y > 800) {
            resetToTop();
        }
    }

    public void moveSideways(int speed) {
        if (type == 0) {
            x = x + speed;
            y = y + speed;
            if (x > 800 && y > 800) {
                resetToLeft();
            }
        } else {
            x = x - speed;
            y = y + speed;
            if (x < 0 && y > 800) {
                resetToTop();
            }
        }
    }

    public void resetToLeft() {
        x = PApplet.parseInt(main.random(-300, -100));
        y = PApplet.parseInt(main.random(5, 750));
    }

    public void resetToTop() {
        x = PApplet.parseInt(main.random(100, 800));
        y = PApplet.parseInt(main.random(-200, -100));
    }

    public void setColor(int colorCode) {
        this.colorCode = colorCode;
    }

    public void useColor() {
        if (colorCode == 1) {
            main.fill(200, 200, 0);
        } else if (colorCode == 2) {
            main.fill(150);
        } else if (colorCode == 3) {
            main.fill(255);
        }
    }

    public boolean isTouch(Shape shape){
        double a = PApplet.dist(x,y,shape.x,shape.y);
        //System.out.println(a);
        if(a<50){
            return true;
        }else{
            return false;
        }
    }
}
