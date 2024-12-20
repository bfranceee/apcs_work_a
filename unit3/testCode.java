public class testCode {
    public static String broHelp(String str) {
        String result = "";
        String final = "";
        if (str.length() % 2 == 0){
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
                final = str.charAt(i);
        }
        return final;
    }
            return str.substring();
        }
        else {
            return str;
        }
    }
     public static void testbroHelp(String str, String expected)
    {
        String result = broHelp(str);
        
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

        testbroHelp("ugly", "u");
        testbroHelp("see", "see");
    }
}