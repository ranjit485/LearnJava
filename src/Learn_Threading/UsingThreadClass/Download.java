package Learn_Threading.UsingThreadClass;

public class Download extends Thread{
    String VideoName;
    void download() {
        int st = 0;
        for (int i = 0; i <= 10; i++) {
            st = st + 10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(VideoName + " " + st + "% DOWNLOAD STARTED");
                }
                case 1 -> System.out.println(VideoName + " " + st + "% DOWNLOAD STARTED");
                case 2 -> System.out.println(VideoName + " " + st + "% DOWNLOADED");
                case 3 -> System.out.println(VideoName + " " + st + "% DOWNLOADED");
                case 4 -> System.out.println(VideoName + " " + st + "% DOWNLOADED");
                case 5 -> System.out.println(VideoName + " " + st + "% DOWNLOADED");
                case 6 -> System.out.println(VideoName + " " + st + "% DOWNLOADED ");
                case 7 -> System.out.println(VideoName + " " + st + "% DOWNLOADED ");
                case 8 -> System.out.println(VideoName + " " + st + "% DOWNLOADED ");
                case 9 -> System.out.println(VideoName + " " + st + "% DOWNLOADED ");
                case 10 -> System.out.println(VideoName + " " + st + "% COMPLETED ");
            }
        }
    }
    @Override
    public void run() {
        download();
    }
}
