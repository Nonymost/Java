public class TypeCasting {
    public static void main(String[]args){
        // Wide Casting(Automatic)
        int a = 100;
        double b = a;

        //Narrow Casting(Manual)
        double aD = 100.244;
        int bD = (int)aD;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(aD);
        System.out.println(bD);
    }
}
