import java.io.*;

public class TypeCasting {
    public static void main(String[]args){
        // Wide Casting(Automatic/Implicit)
        int aInt = 100;
        double bDouble = aInt;

        //Narrow Casting(Manual/Explicit)
        double aDouble = 100.244;
        int bInt = (int)aDouble;
        
        System.out.println(aInt);
        System.out.println(bDouble);
        System.out.println(aDouble);
        System.out.println(bInt);
    }
}
