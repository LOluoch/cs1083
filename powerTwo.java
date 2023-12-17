import java.io.*;
public class MyClass {
    
    
    public static void main(String args[]) {
        System.out.print(powerTwo(4));
    }
    //is number a power of 2? just positive exponents
    public static boolean powerTwo(int x){ //3, -44, 0
        //Java Integer class provides an inbuilt function signum() to check if a number is positive or negative. 
        if (x <= 0 )
            return false;
        int base = 2;
        double power = x;
        
        while (power > 1){
            power = power/base;
            if((power%1)!=0)
                return false;
        }
        return true;

    }
    
}
