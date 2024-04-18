class OOPjava {
    String name;
    int age;
    char initials;

    public OOPjava() {
        name = "Ram";
        age = 25;
        initials = 'R';
    }

    public void print() {
        System.out.println(name + age + initials);
    }

    public static void main(String[] args) {
        OOPjava test = new OOPjava();
        test.print();

    }
}
