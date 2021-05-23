public class Score {
    int score;
    Ball_Game__2 main;

    public Score (Ball_Game__2 main) {
        this.main = main;
    }

    public void show() {
        main.textSize(25);
        main.text("Score: " + score, 10,30);
    }

    public void add(int x){
        score = score + x;
    }
}
