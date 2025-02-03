import java.util.*;

public class Hangman
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("panda");
        words.add("library");
        words.add("diamond");
        words.add("socks");
        words.add("candy");
        words.add("chocolate");
        words.add("chicken");
    }
    
        int randomIndex = (int) (Math.random() * words.size()); 
        String word = words.get(randomIndex);

        ArrayList<Character> guessedLetters = new ArrayList<>();
        ArrayList<Character> display = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            display.add('_'); 
        }

        int maxGuesses = 6;
        int incorrectGuesses = 0;
    
    if(incorrectGuesses >= maxGuesses){
        System.out.println("Game Over!");
    }
     if(incorrectGuesses < maxGuesses){
        
    }
}