public class attenTion {
    public static boolean attentionCode (String str) {
        if (str.length() >= 9 && str.substring(0,9).equals("Hey, you!")) {
            return true;
        } else {
            return false;
        }
}
  public static void testattentionCode (String str, boolean expected)
    {
        boolean result = attentionCode(str);
        
        System.out.print("Sentence: " + str +
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
        System.out.println("Hello, world!");

        testattentionCode("Hey, you!", true);
        testattentionCode("Hey, ", false);
        testattentionCode("Hi!", false);
        testattentionCode("Hey, you! What time is it?", true);
        
    }
}