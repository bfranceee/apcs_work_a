public class startHi
{
    public boolean startHi(String str) {
        if(str.length() < 2) {
            return false;
        }
        String hiTwo = str.substring(0,2);
        if(hiTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public static void teststartHi(String str, boolean expected)
    {
        boolean result = startHi(str, expected);
        
        System.out.print("startHi" + str +
                "expected: " + expected +
                " result: " + result + " ");

        if (result == expected)) {
            System.out.println("YAY!");
        }
        else {
            System.out.println("Boohoo!");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        teststartHi("hi", true);
        teststartHi("hi hello", true);
        teststartHi("h", false);
        teststartHi("chicken", false);
    }
}