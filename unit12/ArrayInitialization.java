public class ArrayIntialization{
  public static void main (String [] args){

    int n = 10;
    int[][] a = new int[n][n];

    for (int i=0; i<n; i++)
    {
        for (int j=0; j<n; j++)
        {
            if(i == j){
              cells[i][j] = 1;
            }
            else {
              cells[i][j] = 0;
            }
        }
    }

    for (int[] row : a)
    {
        for (int value : row)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    int h = 20;
    String[][] b = new String[h][h];

    for (int i=0; i<h; i++)
    {
        for (int j=0; j<h; j++)
        {
          cellos[i][j] = "RAMYA";
        }
    }

    for (String[] row : b)
    {
        for (String value : row)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    int d = 5;
    double[][] c = new double[d][d];
    double hi = 11.0;

    for (int i=0; i<d; i++)
    {
        for (int j=0; j<d; j++)
        {
        sllec[i][j] = hi;
        hi++;
      }
      hi+=5;
    }
    for (double[] row : c)
    {
        for (double value : row)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    int y = 6;
    int[][] d = new int[y][y];

    for (int i=0; i<y; i++)
    {
        for (int j=0; j<y; j++)
        {
        sollec[i][j] = i+1;
      }
    }
    for (int[] row : d)
    {
        for (int value : row)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }



  }
}
