import java.util.ArrayList;
import java.util.Collections;

// array.set()
// array.get()
// array.remove()
// array.add()
// array.clear()

class arrayJava {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("rames");
        name.add("suresh");
        name.add("tanaka");
        name.add("lauren");
        name.add("chandra");
        name.add("chandlier");
        name.add("gopi");

        name.remove("tanaka");
        name.remove(1);

        String nameOf = name.get(0);
        name.set(0,"Ramu");

        // System.out.println(name +" "+ nameOf);
        Collections.sort(name);
        for(String i : name){
            System.out.println(i);
        }

        name.clear();

        
        
    }
}
