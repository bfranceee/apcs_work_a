import processing.core.PApplet;
import java.util.ArrayList;

public class Bounce extends PApplet {
    ArrayList<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("Bounce");
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        balls = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Ball b = new Ball(this);
            balls.add(b);
        }
    }

    public void draw() {
        background(0);

        for (Ball b : balls) {
            b.update();
            b.mouseCollision();
            b.checkEdges();
            b.display();
        }
    }
}
