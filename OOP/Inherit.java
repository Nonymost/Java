class Test {
    protected String name;
    protected int num;

    public void info(String nameInp, int numInp) {
        name = nameInp;
        num = numInp;
    }
    public void print(){
        System.out.println(name + " " + num); 
    }
}

public class Inherit extends Test {
    public static void main(String[] args) {
        Inherit t = new Inherit();
        t.info("test",100);
        t.print();
    }
}
