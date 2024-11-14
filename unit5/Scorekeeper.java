public class Scorekeeper{
    public Scorekeeper(){
        score = 0;
    }
    public void scoreNormal(){
        score += 100;
    }
    public void scoreBonus(){
        score += 1000;
    }
    public int getTotal(){
        return score;
    }
    private int score;
}