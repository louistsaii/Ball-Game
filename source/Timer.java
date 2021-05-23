public class Timer{
    int time;
    BallGame main;

    public Timer(int time, BallGame main){
        this.time = time;
        this.main = main;
    }

    public void show(){
        main.textSize(25);
        main.text("Time: " + time/100, 650,30);
    }

    public void subtract(){
        time = time - 1;
    }
}

