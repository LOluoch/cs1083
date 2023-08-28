//This java package contains the Scanner class
import java.util.*;

public class printBoxes {
    public static final Scanner CONSOLE = new Scanner(System.in);
   public static void main(String[] args) {
       System.out.println("What is the box width?");
        int width = CONSOLE.nextInt();
        System.out.println("What is the box height?");
        int height = CONSOLE.nextInt();
      drawBox(height,width);
   }

   public static void drawBox(int height, int width) {
// print a box with a specified height and width

    // 1. Print a line with width stars.
       writeStars(width);
// 2. Do the following height - 2 times.
       for (int i = 1; i<=height -2;i++){
 // A. Print a line with a star, width - 2 spaces, and a star.
           System.out.print("*");
           writeChars(' ', width);
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
    public static void writeChars(char x, int y){
        for (int z = 1; z <=y-2; z++)
           System.out.print(x);
           
    }

}
