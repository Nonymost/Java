import java.util.HashSet;

public class HashSetJ {
    public static void main(String[] args) {

        HashSet<String> hash = new HashSet<String>();
        
        hash.add("this");
        hash.add("this");
        hash.add("is");
        hash.add("Something");

        hash.remove("Something");
        int size = hash.size();
        Boolean t =  hash.contains("is");
        System.out.println(hash+" "+size);
        hash.clear();
        System.out.println(hash);
    }
}
