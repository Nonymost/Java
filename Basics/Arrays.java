public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"BMW","Aston","Skyline","Subaru"};
        int[] num = {1,4,57,7,3};
        int[][] matrix = {{1,2,3},{2,3,4}};

        num[2] = 100;

        System.out.println(cars[2]);
        // System.out.println(num[2]);

        for(String i : cars){
            // System.out.println(i);
        }
        for(int i : num){
            // System.out.println(i);
        }
        // System.out.print(cars.length);
        System.out.print(matrix[0][2]);
    }
}
