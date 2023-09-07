//This java package contains the Scanner class
import java.util.*;

public class Main {
    public static final Scanner CONSOLE = new Scanner(System.in);
   public static void main(String[] args) {
       System.out.println("What is the n?");
        int n = CONSOLE.nextInt();
        int counter = 0;
       int[] array = new int[n];
        while (n > 1) //
    {
        //System.out.println(n);
      n = n/2;  
      array[n/2] = array[n]; //array[n/4] = array[n/2]
      // System.out.println(n);
      counter++;
    }
     System.out.println(counter);
   }

  }
