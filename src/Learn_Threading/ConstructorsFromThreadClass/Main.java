package Learn_Threading.ConstructorsFromThreadClass;

public class Main {
    public static void main(String[] args) {
        Upload UP1 = new Upload("Bahubali.mp4");
        Download D1 = new Download("PushpaMovie.mp4");
        UP1.start();
        D1.start();

    }
}
