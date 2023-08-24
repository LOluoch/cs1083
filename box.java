public class printBox {
    public static final int BOX_HEIGHT = 10;
    public static final int BOX_WIDTH = 18;
    
    public static void main(String[] args) {
       box();
}

public static void box(){ // 12 by 7 box
    printAsterisks();
    for (int i=1; i<=(BOX_HEIGHT-2); i++)
        printAsteriskSpacestAsterisk();
    printAsterisks();
    
}

public static void printAsterisks(){ // Print top and bottom line of box
    for(int i=1;i<=BOX_WIDTH;i++)
         System.out.print("*");
    System.out.println( );
}

public static void printAsteriskSpacestAsterisk(){ // print 1 row of box
    System.out.print("*");
    for (int i=1; i<=(BOX_WIDTH-2);i++)
        System.out.print(" ");
    System.out.print("*");
    System.out.println( );
}

}
