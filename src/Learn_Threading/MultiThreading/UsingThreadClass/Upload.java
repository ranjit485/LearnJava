package Learn_Threading.MultiThreading.UsingThreadClass;

public class Upload extends Thread{
    String VideoName;
    void upload() {
        int st = 0;
        for (int i = 0; i <= 10; i++) {
            st = st + 10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(VideoName + " " + st + "% UPLOAD STARTED");
                }
                case 1 -> System.out.println(VideoName + " " + st + "% UPLOAD STARTED");
                case 2 -> System.out.println(VideoName + " " + st + "% UPLOADED");
                case 3 -> System.out.println(VideoName + " " + st + "% UPLOADED");
                case 4 -> System.out.println(VideoName + " " + st + "% UPLOADED");
                case 5 -> System.out.println(VideoName + " " + st + "% UPLOADED");
                case 6 -> System.out.println(VideoName + " " + st + "% UPLOADED ");
                case 7 -> System.out.println(VideoName + " " + st + "% UPLOADED ");
                case 8 -> System.out.println(VideoName + " " + st + "% UPLOADED ");
                case 9 -> System.out.println(VideoName + " " + st + "% UPLOADED ");
                case 10 -> System.out.println(VideoName + " " + st + "% UPLOADED ");
            }
        }
    }
    @Override
    public void run() {
        upload();
    }
}
