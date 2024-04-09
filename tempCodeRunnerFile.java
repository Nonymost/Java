public class Strings {
    public static void main(String[]args){
        String string = "String";

        // .length() method
        int stringLength = string.length();
        //toUpperCase(), toLowerCase()
        String stringUpper = string.toUpperCase();
        String stringLower = string.toLowerCase();
        
        int index = string.indexOf("g");
        System.out.println(index);
    }
}
