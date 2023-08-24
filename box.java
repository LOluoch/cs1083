public class Box {
    public static void main(String[] args) {
       Box();
}

public static void Box(){ // 12 by 7 box
    printAsterisks();
    for (int i=1; i<=5; i++)
        printAsteriskSpacestAsterisk();
    printAsterisks();
    
}

public static void printAsterisks(){ // Print top and bottom line of box
    for(int i=1;i<=12;i++)
         System.out.print("*");
    System.out.println( );
}

public static void printAsteriskSpacestAsterisk(){ // print 1 row of box
    System.out.print("*");
    for (int i=1; i<=10;i++)
        System.out.print(" ");
    System.out.print("*");
    System.out.println( );
}

}
