import java.util.Scanner;

class Userinp{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}