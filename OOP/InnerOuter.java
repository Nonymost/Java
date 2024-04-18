class Outer {
    int x = 10;

    class Inner {
        int y = 20;
        public int num(){
            return x;
        }
    }
}

public class InnerOuter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(outer.x+inner.y+"\n"+inner.num());


    }
}
