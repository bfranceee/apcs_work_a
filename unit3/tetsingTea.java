public class tetsingTea
{
    public static string notString(String str)
    {
        if (str.length() >= 3 && str.substring(0, 3).equals("not"))
        {
            return str;
        }
        return "not " + str;
    }
    
    public static void testnotString(String str, String expected)
    {
        String result = notString(str);
        
        System.out.print("Word: " + str + "expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");

    }
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        testnotString("ugly", "not ugly");
        testnotString("chicken", "not chicken");
        testnotString("not fitnessgrampacertest", "not fitnessgrampacertest");
    }
}