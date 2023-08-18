package PracticSet.Inheritance;

public class Main {
    public static void main(String[] args) {
        shape s;
        s = new shape();
        s.setDim1(5);
        s.setDim2(10);
        s.setDim3(15);
        Rectangle r =new Rectangle();
        System.out.println(r.area());

    }
}
