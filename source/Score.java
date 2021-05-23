public class Score {
    int score;
    BallGame main;

    public Score (BallGame main) {
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
