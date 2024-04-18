abstract class AbstractionClass {
    int num = 20;

    abstract void callAbstract();

}

class AbstractedClass extends AbstractionClass {
    public void callAbstract() {
        System.out.println(num);
    }
}

public class Abstract {
    public static void main(String[] args) {
        AbstractedClass a = new AbstractedClass();
        a.callAbstract();
    }
}
