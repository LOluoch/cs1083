public class printBoxes {
   public static void main(String[] args) {
      drawBox(15,20);
   }

   public static void drawBox(int height, int width) {
// print a box with a specified height and width

    // 1. Print a line with width stars.
       writeStars(width);
// 2. Do the following height - 2 times.
       for (int i = 1; i<=height -2;i++){
 // A. Print a line with a star, width - 2 spaces, and a star.
           System.out.print("*");
           for (int x = 1; x <=width-2; x++){
           System.out.print(" ");
           }
           System.out.print("*");
        System.out.println();
       }
// 3. Print a line with width stars.
       writeStars(width);
   }
   
   public static void writeStars(int number) {   
    for (int i = 1; i <= number; i++) 
        System.out.print("*");
    System.out.println( );
}

}
