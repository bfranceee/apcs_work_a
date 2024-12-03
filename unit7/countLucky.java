public class countLucky {
    public static double CountLucky(double[] values){
        int count = 0;
        for (int i=0; i < values.length; i++)
        {
            if ((values[i]%7==0 || values[i]%10==7) && values[i]!= 0)
            {
                count += 1;
            }
        }
        return count;
    }
    public static void TestCountLucky(double[] values, int expected)
    {
        double result = CountLucky(values);
        
        for (int i=0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
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
        TestCountLucky(new double[] {8,9,3,7,49}, 2);
        TestCountLucky(new double[] {0,70,42,7}, 3);
    }
}