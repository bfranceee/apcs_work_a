import processing.core.PApplet;

public class Man {
    int mistakes; // Track wrong guesses
    PApplet p;

    public Man(PApplet p) {
        this.p = p;
        mistakes = 0;
    }

    public void display() {
        p.background(200, 220, 255); // Light blue sky

        p.fill(255); // White for snowman
        if (mistakes < 6) p.ellipse(300, 187, 60, 60); // Bottom part
        if (mistakes < 5) p.ellipse(300, 135, 45, 45); // Middle part
        if (mistakes < 4) p.ellipse(300, 96, 30, 30);  // Head

        if (mistakes < 3) { // Draw face if not too melted
            p.fill(0);
            p.ellipse(295, 93, 5, 5); // Left eye
            p.ellipse(305, 93, 5, 5); // Right eye
            p.noFill();
            p.arc(300, 100, 15, 10, 0, PApplet.PI); // Mouth
        }

        if (mistakes < 2) { // Draw hat if not too melted
            p.fill(0);
            p.ellipse(300, 80, 40, 5);
            p.rect(290, 60, 20, 20);
        }

        if (mistakes < 1) { // Draw arms only if no mistakes
            p.stroke(0);
            p.line(300, 140, 250, 120);
            p.line(300, 140, 350, 120);
        }
    }

    public void melt() {
        if (mistakes < 6) mistakes++;
    }
}
