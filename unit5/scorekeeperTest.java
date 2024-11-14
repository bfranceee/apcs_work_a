public class scorekeeperTest {
    public static void main(String [] args){
        Scorekeeper b = new Scorekeeper();
        
        b.scoreBonus();
        b.scoreNormal();
        b.scoreBonus();
        
        System.out.println("My score is: " + b.getTotal());
    }
}