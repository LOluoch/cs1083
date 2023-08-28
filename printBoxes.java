public class Stars {
   public static void main(String[] args) {
      drawBox(15,20);
   }

   public static void drawBox(int height, int width) {
       writeStars(width);
       for (int i = 1; i<=height -2;i++){
           System.out.print("x");
           for (int x = 1; x <=width-2; x++){
           System.out.print(" ");
           }
           System.out.print("x");
        System.out.println();
       }
       writeStars(width);
   }
   
   public static void writeStars(int number) {   
    for (int i = 1; i <= number; i++) 
        System.out.print("*");
    System.out.println( );
}

}
