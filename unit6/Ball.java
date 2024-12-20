import processing.core.PApplet;
import processing.core.PVector;

public class Ball {
    PVector position;
    PVector velocity;
    PVector acceleration;
    float r;
    PApplet app;

    public Ball(PApplet app, float xIn, float yIn, float vxIn, float vyIn, float rIn) {
        this.app = app;
        position = new PVector(xIn, yIn);
        velocity = new PVector(vxIn, vyIn);
        acceleration = new PVector(0, 0);
        r = rIn;
    }

    public Ball(PApplet app) {
        this.app = app;
        position = new PVector(app.random(app.width), app.random(app.height));
        velocity = new PVector(app.random(-1, 1), app.random(-1, 1)); 
        acceleration = new PVector(0, 0);
        r = app.random(5, 6);
    }

  
    void applyForce(PVector force) {
        acceleration.add(force);
    }

  
    void update() {
        velocity.add(acceleration); 
        position.add(velocity);   
        acceleration.mult(0);     
    }

    void mouseCollision() {
        PVector mouse = new PVector(app.mouseX, app.mouseY);
        PVector difference = PVector.sub(position, mouse);
        float d = difference.mag();
        if (d < 200) {
            difference.normalize();
            difference.mult(0.5f);
            applyForce(difference);
        }
    }

    void checkEdges() {
        if (position.x < 0 || position.x > app.width) {
            velocity.x *= -1;
        }
        if (position.y < 0 || position.y > app.height) {
            velocity.y *= -1;
        }
    }

    void display() {
        app.fill(255);
        app.ellipse(position.x, position.y, r * 2, r * 2);
    }
}
