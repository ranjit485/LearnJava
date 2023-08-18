package Learn_Threading.UsingThreadClass;

public class Main {
    public static void main(String[] args) {
    Download D1 = new Download();
    Download D2 = new Download();
    D1.VideoName="Guatami Viral video";
    D2.VideoName="mask girl";
    D2.start();
    D1.start();
    }
}
