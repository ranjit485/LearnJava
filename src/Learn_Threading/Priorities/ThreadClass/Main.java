package Learn_Threading.Priorities.ThreadClass;

public class Main {
    public static void main(String[] args) {
     Download DV1 = new Download("SUNNY.mp4");
     Upload UV1 = new Upload("JONNY.mp4");
     DV1.start();
    }
}
