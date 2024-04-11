public class If_Else {
    public static void main(String[] args) {
        
        int age = -19;
        char sex = 'M';

        if (age > 18) {
            System.out.println("You're above the age of 18!");
        }
        else if(age == 18 ){
            System.out.println("You're 18!");
        }
        else if(age <= 0){
            System.out.println("Enter a valid age!");
        }
        else{
            System.out.println("You need to be atleast 18 or above to apply!");
        } 

        //ternary operator (short hand if-else statement)
        String result = (sex=='M')?"True":"False";
        System.out.println(result);
    }
}
