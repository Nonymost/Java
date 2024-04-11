public class While {
    public static void main(String[] args) {
        int num = 1;
        int n = 10;
        while (num < 11) {
            System.out.print(num + ",");
            ++num;
        }
        System.out.print("\n");
        do {
            System.out.print(n + ",");
            --n;
        } while (n > 0);
    }
}
