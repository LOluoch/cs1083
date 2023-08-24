//This java package contains the Scanner class
import java.util.*;

public class Circle{
    //Class constant variable
      public static final Scanner CONSOLE = new Scanner(System.in);
    
  public static void main(String[] args){
      System.out.println(23 + 10);
      System.out.println("There are "+1000/60+"hours and "+1000%60+"minutes in 1000 minutes" );
      System.out.println();
      //Sphere
      
      double diameter;
      double pi = 3.14;
      double circumference;
      
      System.out.println("What is the diameter?");
      /*while (!CONSOLE.hasNextDouble()) {
          if (!CONSOLE.hasNext()) {
            System.err.println("no more CONSOLE");
            System.exit(1);
          }
          System.out.println(CONSOLE.next() + ": is not a double, please enter a double");
}*/ // Not waiting for user input when run in jdoodle.com
      diameter = CONSOLE.nextDouble();
      circumference = 2*pi*(diameter/2);
      System.out.println("The circumference of the sphere is "+circumference);
      
  }
}
