import java.util.HashMap;

public class HashJava {
    public static void main(String[] args) {

        HashMap<String, String> carList = new HashMap<String, String>();
        carList.put("Mustang", "2002A");
        carList.put("Celero", "2010");
        carList.put("Mantos", "2499r");

        String name = carList.get("Mustang");
        carList.remove("Celero");
        // System.out.println(carList);
        // System.out.println(name);
        // carList.clear();
        // System.out.println(carList);

        for (String s : carList.keySet()) { //to get the key from the hashmap
            System.out.println(s);
        }

        for (String s : carList.values()) { //to get the values from the hashmap
            System.out.println(s);
        }
    }
}
