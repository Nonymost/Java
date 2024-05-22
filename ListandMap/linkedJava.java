import java.util.LinkedList;

public class linkedJava {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        //LinkedList same as ArrayList but different. Arraylist stores data in a array format while 
        //LinkedList store data in a container and is linked to one another 

        cars.add("Jack");
        cars.add("Jones");
        cars.add("Anum");
        cars.remove(2);
        cars.set(1, "Merin");

        String carAt1 = cars.get(1);

        // more methods on LinkedList, no setFirst or setLast
        cars.addFirst("Fast");
        cars.addLast("Slow");
        cars.removeFirst();
        cars.removeLast();
        String first = cars.getFirst();
        String last = cars.getLast();
        System.out.println(first+" "+last);

    }
}
