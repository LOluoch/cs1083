//creating a new type called Array2d (object variable)
class Array2d 
{
  /* variables to store the data of our array */
  public double[][] arrayData; //The 2d array of numbers being stored
  int rows; //The # of rows
  int cols; //The # of columns
  
  /* A constructor to build a new 2d array with the specified number of rows and columns */
  //defines how to build an Array2d
  public Array2d( int rows, int cols ){
    this.rows = rows; // this.rows is the variable rows on line 6 associated to the object
    this.cols = cols;
    this.arrayData = new double[rows][cols]; //creates rows*cols number of variables 
  }
}
