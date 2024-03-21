import java.util.Scanner;

//Checking for correct input
//name = Ram
//code = 111
public class Program2 {

    static void test(int code, String name) {
        if ((name.equals("Ram")) && (code == 111)) {
            System.out.println("Success:");
        } else {
            System.out.println("Unsuccessful:\n" + name + "\t" + code);
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
                
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String nameInput = scan.nextLine();
        System.out.println("Enter code:");
        int numInput = scan.nextInt();
        test(numInput, nameInput);

    }

}