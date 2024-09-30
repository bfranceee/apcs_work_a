public class icyhot {
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void testIcyHot(int temp1, int temp2, boolean expected) {
        boolean result = icyHot(temp1, temp2);

        System.out.print("temp1: " + temp1 +
                " temp2: " + temp2 + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        testIcyHot(-1, 101, true);
        testIcyHot(101, -1, true);
        testIcyHot(50, 50, false);
        testIcyHot(-1, -1, false);
        testIcyHot(101, 101, false);
    }
}