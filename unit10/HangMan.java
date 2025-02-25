import processing.core.PApplet;

public class HangMan extends PApplet {
    Man snowman;
    String word = "JAVA"; // Change this word as needed
    char[] guessedWord;
    boolean[] guessedLetters;
    int wrongGuesses = 0;

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        snowman = new Man(this);
        guessedWord = new char[word.length()];
        guessedLetters = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '_';
        }
    }

    public void draw() {
        background(200, 220, 255);
        snowman.display();

        fill(0);
        textSize(32);
        textAlign(CENTER);
        text(join(charArrayToStringArray(guessedWord), " "), width / 2, 50);

        textSize(20);
        text("Wrong guesses: " + wrongGuesses + "/6", width / 2, 80);

        if (wrongGuesses >= 6) {
            text("Game Over! Word was: " + word, width / 2, 350);
            noLoop();
        } else if (new String(guessedWord).equals(word)) {
            text("You Win!", width / 2, 350);
            noLoop();
        }
    }

    public void keyPressed() {
        if (key >= 'a' && key <= 'z') key = (char) (key - 32); // Convert to uppercase
        if (key >= 'A' && key <= 'Z' && !guessedLetters[key - 'A']) {
            guessedLetters[key - 'A'] = true;

            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == key) {
                    guessedWord[i] = key;
                    found = true;
                }
            }

            if (!found) {
                wrongGuesses++;
                snowman.melt();
            }
        }
    }

    public String[] charArrayToStringArray(char[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = String.valueOf(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        PApplet.main("HangmanGame");
    }
}
