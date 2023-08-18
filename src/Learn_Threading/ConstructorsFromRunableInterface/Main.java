package Learn_Threading.ConstructorsFromRunableInterface;



public class Main {
    public static void main(String[] args) {

        Upload Uvideo1 = new Upload("Grandma.mp4");
        Download Dvideo1 = new Download("SunnyLeon.mp4");

        Thread UP1 = new Thread(Uvideo1);
        Thread DV1 = new Thread(Dvideo1);

        UP1.threadId();
        DV1.threadId();


        UP1. setName("Aloof");

        System.out.println(UP1.getName()+ UP1.threadId());
        UP1.start();
        DV1.start();

    }
}




