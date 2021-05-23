public class Ball extends Shape{
    private int size;

    int colorCode;

    public Ball(int size, BallGame main, int colorCode) {
        super(main);
        this.size = size;
        this.colorCode = colorCode;
    }



    public boolean isHit(Ball targetBall) {
        double d = main.dist(x, y, targetBall.x, targetBall.y);
        double minRange = size / 2 + targetBall.size / 2;
        if (d < minRange) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHit(Square targetSquare) {
        double d = main.dist(x, y, targetSquare.x, targetSquare.y);
        double minRange = size / 2 + targetSquare.size * 1.4f / 2;
        if (d < minRange) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHit(Triangle targetTriangle) {
        double d = main.dist(x, y, targetTriangle.x, targetTriangle.y);
        double minRange = size / 2 + 30;
        if (d < minRange) {
            return true;
        } else {
            return false;
        }
    }

    public void moveByMouse(float mX, float mY) {
        x = mX;
        y = mY;
    }

    public void drawShape() {
        useColor();
        main.circle(x, y, size);
    }

}

