package Learn_Threading.Priorities.ThreadClass;

import static VerseMinds.ColoredConsole.Main.*;

public class Download extends Thread{
    Download(String videoName){}
    String BB_WC = "\u001B[40m"+"\u001B[37m";

    void download(){
        String D="% DOWNLOADED";
        int st=0;
        for (int i = 0; i <= 10; i++) {
            st=st+10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(BB_WC+threadId()+" "+getName() + " " + st + "% DOWNLOAD STARTED"+RESET);
                }
                case 1 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st+ D+RESET);
                case 2 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 3 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 4 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 5 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 6 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 7 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 8 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 9 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + D+RESET);
                case 10 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + "% COMPLETED "+RESET);
            }
        }
    }

    public void run(){
        download();
    }

}
