public class Program {

    static void basicFunction() {

        String name = "Ram";
        name = name.toUpperCase();
        name = name.toLowerCase();
        int age = 21;
        float amount = 22.45f;
        int amountInt = (int) amount;
        final char initials = 'A';
        
        boolean isPresent = true;

        System.out.println(name + " is " + age + " year old. " + name + " has " + amount +
                ". \n" + "Initials : " + initials + "\nPresent : " + isPresent);
        // System.out.println(name.length());
        
    }

    public static void main(String[] args) {

      basicFunction();
    }
}