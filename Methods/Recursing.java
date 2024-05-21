public class Recursing {
    public static int Re(int n){
        if(n>0){
            return n + Re(n - 1);
        }else{
            return 0;
        }
    
    }
    public static void main(String[] args){
        System.out.println(Re(10));
    }
}
