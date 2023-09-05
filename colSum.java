import java.util.Arrays;
public class Cars{
    public static void main(String[] args){
        //2D array of array [row][column]
        int [][] cars = new int [3][4];
        //Another way, assign values immediately when declared
       /* String[][] cars = {{"Camero","Corvette","Silverado"},
                            {"Mustang","Ranger","F-150"},
                            {"Ferrari","Lambo","Tesla"}
                        };
                        3x4*/
        cars[0][0] = 2;
        cars[0][1] = 5;
        cars[0][2] = 45;
        cars[0][3] = 4;
        cars[1][0] = 6;
        cars[1][1] = 75;
        cars[1][2] = 46;
        cars[1][3] = 64;
        cars[2][0] = 6;
        cars[2][1] = 9;
        cars[2][2] = 0;
        cars[2][3] = 35;
        
        //Nested for loop outer = rows, inner = columns
        for(int i = 0; i<cars.length; i++){
            System.out.println();
            for(int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
        computeAvg(cars);
        
    }
    
    public static void computeAvg(int[][] array)
  {
    int i, j;
    int sum = 0;
    int[] colAvg = new int[array.length];
    for (i=0; i < array.length; i++)
    {
      for (j=0; j < array[0].length; j++)
      {
        sum+=array[i][j];
      }
      sum = sum/array[0].length;
      colAvg[i] = sum;
      sum = 0; // reset sum before moving to next row
    }
    System.out.println(Arrays.toString(colAvg));
    
  }
}
