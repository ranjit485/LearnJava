package Learn_Threading.ThreadMethods;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Download Dv1 = new Download("KGF MOVIE");
        Upload Uv1 =new Upload("EVIL DEAD");

        Thread TH1 = new Thread(Uv1);

        Dv1.start();
        Dv1.interrupt();
        TH1.start();

    }

}
