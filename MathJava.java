
public class MathJava {
    public static void main(String[] args) {
        int a = 20, b = 25;
        float c = -14.5f;

        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Random Number: "+ ((int)(Math.random()*7)));
        System.out.println("Absolute value: " + Math.abs(c));
        System.out.println("Square root: " + Math.sqrt(b));
    }
}
