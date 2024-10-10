public class notString 
{
    public static String notString(String str)
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
        if (result.equals(expected))
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");
    }
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        testnotString("ugly", "not ugly");
        testnotString("food", "not food");
        testnotString("not paper", "not paper");
    }
}