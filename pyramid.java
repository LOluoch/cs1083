public class PrintStars2 {
    public static void main(String[] args) {
        // print six rows
        for (int row = 1; row <= 6; row++) {
            // print row stars and a newline
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
            System.out.println();
        
        System.out.println();
        // print six rows 
        for (int row = 6; row >= 1; row--) {
            // print row stars and a newline
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        // print 11 columns 
        for (int column = -5; column <= 5; column++) {
            // print row stars and a newline
            for (int row = 0; row <= column; row++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        System.out.println();
        // print 11 columns 
        for (int column = 5; column >= 0; column--) {
            // print row stars and a newline
            for (int row = 0; row <= column; row++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Pyramid
        System.out.println();
        for (int row = 1; row <= 6; row++) {
            for (int column = row; column < 6; column++) 
                System.out.print(" ");
            for (int k=1;k<row*2;k++)
                System.out.print("*");
            System.out.print("\n");
            
            System.out.println();
        }
    }
}
