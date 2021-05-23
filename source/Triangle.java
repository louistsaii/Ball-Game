public class Triangle extends Shape{

    public Triangle(BallGame main){
        super(main);
    }

    public void drawShape() {
        useColor();
        main.triangle(x - 28, y + 20, x, y - 20, x + 28, y + 20);
    }

}
