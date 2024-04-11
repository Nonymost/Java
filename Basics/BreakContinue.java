public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                System.out.println("III");
                continue;
            }
            if(i == 4){
                System.out.println("Four");
                break;
            }
            System.out.println(i);
        }
    }

}
