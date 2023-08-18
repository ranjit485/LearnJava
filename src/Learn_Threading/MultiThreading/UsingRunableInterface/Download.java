package Learn_Threading.MultiThreading.UsingRunableInterface;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Download implements Runnable{
    public String VideoName;
    void download(){
        int st=0;
        for (int i = 0; i <= 10; i++) {
            st=st+10;
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
    void NotificationPop(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Notification Enter [1 TO ALLOW] [2 CLOSE] ");
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            if (action ==1){
                System.out.println("Notification ALLOWED");
                break;
            }
            if (action==2){
                break;
            }
            else{
                continue;
            }

        }
    }
    @Override
    public void run() {
        download();
        NotificationPop();

    }

}

