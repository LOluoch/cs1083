public class Driver 
{
  public static void main(String[] args)
  {
    Array2d A = new Array2d(5,10); //Initialize new Array2D object

    fillArray(A);
    printArray(A);
    
  }
  
  public static void fillArray(Array2d A) 
  {
    /* TODO: fill in the array */
    //Put into array[i][j] the double i.j (assume i,j<10)
    //For example: i = 2, j = 3 then array[2][3] = 2.3
    //loop through rows in the 2Darray
    for(int i=0; i<A.rows; i++){
      for(int j=0;j<A.cols; j++){
       A.arrayData[i][j] = i+j/10.0; //int/int produces an int
      }
    }
  }
  
  public static void printArray(Array2d A)
  {
    int i, j;

    for(i = 0; i < A.rows; i++)
    {
      for(j = 0; j < A.cols; j++)
      {
        System.out.printf("%-7.2f", A.arrayData[i][j]); // -7.2 formarting for padding 7 chars and only print 2 decimal places
      }
      System.out.println();
    }
  }
}
