package Learn_Threading.PracticSet;

public class Main {
    public static void main(String[] args) {
        GoodMorning G1 = new GoodMorning();
        Welcome w1 = new Welcome();

        Thread Th1 = new Thread(w1);

        Th1.start();
        System.out.println(Th1.getState());
        G1.start();
        System.out.println(G1.getState());

    }
}
