interface Inter{
    int a = 100;
    public void print();
}

class Innerface implements Inter{
    public void print(){
        System.out.println("Printing:::"+a+"%");
    }
}
public class Interfacing {
    public static void main(String[]args){
        Innerface i = new Innerface();
        i.print();
    }
}
