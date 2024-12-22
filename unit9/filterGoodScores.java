import java.util.*;

public class filterGoodScores {
    public static ArrayList<Integer> FilterGoodScores(ArrayList<Integer> scores) {
        ArrayList<Integer> goodScores = new ArrayList<>();

        for (int score : scores) {
            if (score > 90) {
                goodScores.add(score);
            }
        }

        return goodScores;
    }

    public static void main(String[] args) {
        ArrayList<Integer> scores1 = new ArrayList<>(Arrays.asList(85, 92, 88, 96, 75, 100));
         ArrayList<Integer> scores2 = new ArrayList<>(Arrays.asList(85, 91, 0, 40, 76, 99));
        System.out.println(FilterGoodScores(scores1)); 
        System.out.println(FilterGoodScores(scores2)); 
    }
}
