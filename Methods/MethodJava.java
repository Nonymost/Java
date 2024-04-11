public class MethodJava {
    static String checkAge(int age) {
        if (age > 18) {
            return "User can vote! Age : " + age;
        } else {
            return "User cannot vote! Age : " + age;
        }

    }

    public static void main(String[] args) {
        System.out.println(checkAge(26));
    }
}