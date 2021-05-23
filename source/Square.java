public class Square extends Shape{
    float size;

    public Square (BallGame main, int size) {
        super(main);
        this.size = size;
    }

    public void drawShape() {
        useColor();
        main.rect(x, y, size, size);
    }

}
