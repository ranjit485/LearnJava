package Learn_Threading.MultiThreading.UsingThreadClass;

public class Main {
    public static void main(String[] args) {
        Download  DV1 = new Download();
        Download  DV2 = new Download();
        DV1.VideoName="Evil-Dead.mp4";
        DV2.VideoName="Ghost-House.mp4";

        Upload UV1 = new Upload();
        UV1.VideoName="The-ring.mp4";

        DV1.start();
        DV2.start();
        UV1.start();
    }
}
