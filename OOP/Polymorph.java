class Animal {
    public void print(){
        System.out.println("This is just a check");
    }
    public void sound() {
        System.out.println("Animal makes sound!!");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Barks!!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow!!");
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Dog d1 = new Dog();
        Animal c = new Cat();
        a.sound();
        // d.test();
        d.sound();
        d1.sound();
        d.print();
        c.sound();
    }
}
