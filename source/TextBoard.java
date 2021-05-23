public class TextBoard extends Square {

    String content;

    public TextBoard(BallGame main, String content) {
        super(main, 600);
        this.x = (800 - 600) / 2;
        this.y = (800 - 600) / 2;
        this.content = content;
    }

    public void drawShape() {
        setColor(2);
        super.drawShape();

        main.fill(255);
        main.textSize(50);
        float w = main.textWidth(content);
        float tx = (size - w) / 2;
        main.text(content, x + tx, 300);

    }

}

