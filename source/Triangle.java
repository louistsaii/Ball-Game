import processing.core.PApplet;

public class Triangle extends Shape{

    public Triangle(Ball_Game__2 main){
        super(main);
    }

    public void drawShape() {
        useColor();
        main.triangle(x - 28, y + 20, x, y - 20, x + 28, y + 20);
    }

}
