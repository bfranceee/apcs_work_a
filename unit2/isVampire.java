public class isVampire
{
    public static boolean isVampire(float hour, boolean awake)
    {
        if((hour < 6 || hour > 22) && awake){
            return true;
        }
        if((hour >= 6 || hour <= 22) && awake == false){
            return true;
        }
        else {
            return false;
        }
    }

    public static void testisVampire(float hour, boolean awake, boolean expected)
    {
        boolean result = isVampire(hour, awake);
        
        System.out.print("Hour: " + hour +
                " Awake? : " + awake + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");

    }


    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        testisVampire(8, false, true);
        testisVampire(23, true, true);
        testisVampire(3, false, false);
        testisVampire(16, true, true);
        testisVampire(18, false, true);
    }
}
