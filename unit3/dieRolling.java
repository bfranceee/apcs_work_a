public class dieRolling {
    
    
    public static void dieRolling()
    {
        int value = (int) (Math.random() * 6 + 1);
        System.out.println(value);
        
    }
    
    public static void main(String [] args){
        for (int i = 0; i <= 5; i++) {
            dieRolling();
            
        }
        
    }
}