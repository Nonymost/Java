import java.util.Iterator;
import java.util.ArrayList;

public class IteratorJ {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("This");
        arr.add("is");
        arr.add("a");
        arr.add("Test");

        Iterator<String> iterate = arr.iterator();

        while (iterate.hasNext()) {
            iterate.next();
            iterate.remove();
        }
        System.out.println(arr);



    }
}
