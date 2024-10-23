public class coinFlip {
    
    
    public static void coinFlip()
    {
        int value = (int) (Math.random() * 10 + 1);
            
        if (value % 2 == 0)
            System.out.println("Heads");
        else
            System.out.println("Tails");
        
    }
    
    public static void main(String [] args){
        for (int i = 0; i <= 19; i++) {
            coinFlip();
            
        }
        
    }
}