public class stringTimes 
{
    public static String stringTimes(String str, int n) 
    {
        String result = "";
        for (int i=0; i<n; i++) 
        {
            result = result + str;
        }
        return result;
    }
    
    public static void teststringTimes(String str, int n, String expected)
    {
        String result = stringTimes(str, n);
        
        System.out.print("Letters: " + str +
                "expected: " + expected +
                " result: " + result + " ");

        if (result.equals(expected)) 
        {
            System.out.println("YAY!");
        }
        else 
        {
            System.out.println("Boohoo!");
        }
     }

     public static void main(String[] args) 
     {

        teststringTimes("hi", 5, "hihihihihi");
        teststringTimes("hi", 4, "hihihihi");
        teststringTimes("hi", 2, "hihi");
     }
}