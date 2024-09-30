public class GoodDeal {
    public static boolean goodDeal(double originalPrice, double salePrice) {
        if (originalPrice <= 0 || salePrice < 0) {
            return false; 
        }
        else {
            return salePrice < originalPrice * 0.75;
        }
    }
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected) {
        boolean result = goodDeal(originalPrice, salePrice);
        
        System.out.print("Original Price: " + originalPrice +
                " Sale Price: " + salePrice + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected) 
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");
    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        testGoodDeal(100, 100, false);
        testGoodDeal(100, 75, false);
        testGoodDeal(100, 74.99, true);
        testGoodDeal(100, 50, true);
    }
}