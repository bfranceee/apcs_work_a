public class countZNames {
    public static double CountZNames(String[] names){
        double count = 0;
        for (int i=0; i < names.length; i++)
        {
            if (names[i].startsWith("Z") || names[i].startsWith("z"))
            {
                count += names[i].length();
            }
        }
        return count;
    }
    public static void TestCountZNames(String[] names, int expected)
    {
        double result = CountZNames(names);
        
        for (int i=0; i < names.length; i++)
        {
            System.out.print(names[i] + " ");
        }
        
        System.out.println("; expected: " + expected + "; result: " + result);
        
        if (result == expected)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
    public static void main(String[] args)
    {
        TestCountZNames(new String[] {"Zoe", "Tyler", "Z", "Zebra"}, 9);
        TestCountZNames(new String[] {"Zoe", "Fizz", "Buzz", "Zebra"}, 8);
    }
}