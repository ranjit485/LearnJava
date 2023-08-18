package Learn_Threading.MultiThreading.UsingRunableInterface;


public class Main {
    public static void main(String[] args) {
        Download DVideo1 =new Download();
        DVideo1.VideoName="KGF-FULL-MOVIE";

         Upload UVideo1 = new Upload();
         UVideo1.VideoName="RRR-MOVIE";

         Thread DV1 = new Thread(DVideo1);
         Thread UV1 = new Thread(UVideo1);

        DV1.start();
        UV1.start();

    }
}
