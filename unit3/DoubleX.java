public class DoubleX 
{
    public static boolean doubleX(String str) 
    {
        int i = (str.indexOf("x"));
        if (i+1 >= str.length()) {
            return false;
        }
        if(i == -1){
            return false;
        }
        return str.substring(i+1, i+2).equals("x");
    }
    
    public static void testdoubleX(String str, boolean expected)
    {
        boolean result = doubleX(str);
        
        System.out.print("Letters: " + str +
                "expected: " + expected +
                " result: " + result + " ");

        if (result == expected) {
            System.out.println("YAY!");
        }
        else {
            System.out.println("Boohoo!");
        }
     }

     public static void main(String[] args) 
     {

        testdoubleX("xxhi", true);
        testdoubleX(" ", false);
        testdoubleX("hxx", true);
        testdoubleX("x", false);
     }
}