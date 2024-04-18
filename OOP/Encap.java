public class Encap {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int numInp) {
        this.num = numInp;
    }

    public static void main(String[] args) {
        Encap e = new Encap();
        e.setNum(1240124);
        System.out.println(e.getNum());

    }
}
