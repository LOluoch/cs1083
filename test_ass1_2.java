//This java package contains the Scanner class
import java.util.*;

public class Main {
    public static final Scanner CONSOLE = new Scanner(System.in);
   public static void main(String[] args) {
       System.out.println("What is the n?");
        int n = CONSOLE.nextInt();
        int i;
        int counter1 = 0, counter2 = 0;
       int[] array = new int[n];
      for(i = 0; i < n; i++)
    {
        counter1++;
      for(n = n-1; n>1; n/=1.01) //stops at n=1
      {
        array[n-1] = array[n]; //shift left?
        counter2++;
      }
    }
     System.out.println(counter1);
     System.out.println(counter2);
   }

  }
