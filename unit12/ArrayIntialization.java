public class ArrayIntialization {

    public static int findSmallest(int[][] array) {
        int smallest = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int num : row) {
                smallest = Math.min(smallest, num);
            }
        }
        return smallest;
    }

    public static float calculateSum(float[][] array) {
        float sum = 0;
        for (float[] row : array) {
            for (float num : row) {
                sum += num;
            }
        }
        return sum;
    }

    public static int countAStrings(String[][] array) {
        int count = 0;
        for (String[] row : array) {
            for (String str : row) {
                if (str.toLowerCase().startsWith("a")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intArray = {{5, 2, 9}, {1, 7, 3}};
        System.out.println("Smallest: " + findSmallest(intArray));

        float[][] floatArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Sum: " + calculateSum(floatArray));

        String[][] stringArray = {{"Apple", "Banana"}, {"Apricot", "Acai"}};
        System.out.println("Count of A strings: " + countAStrings(stringArray));
    }
}