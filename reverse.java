//This java package contains the Scanner class
import java.util.*;
public class reverseString {
     public static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add sentence here:");
        String string1 = CONSOLE.nextLine();
        tryStringBuilder(string1);
    }

    public static void tryStringBuilder(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(line);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    
}
}
