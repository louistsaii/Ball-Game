import processing.core.PApplet;

public class Square extends Shape{
    float size;

    public Square (Ball_Game__2 main,int size) {
        super(main);
        this.size = size;
    }

    public void drawShape() {
        useColor();
        main.rect(x, y, size, size);
    }

}
