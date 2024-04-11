public class For {
    public static void main(String[] args) {
        String[] pattern = { "car", "bike", "motorbike" };
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }

        for(String i : pattern){
            System.out.println(i);
        }
    }
}