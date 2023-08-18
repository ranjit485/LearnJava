package Learn_Threading.ThreadMethods;

import static VerseMinds.ColoredConsole.Main.*;

public class Download extends Thread{

    String RESET ="\u001B[0m";
    //    String DC = "\u001B[43m"+"\u001B[30m";
    String DC = BLACK+BRIGHT_BG_YELLOW;
    String video;
    public Download(String video) {
        this.video =video;
    }

    void download(){
        String D="% DOWNLOADED";
        int st=0;
        for (int i = 0; i <= 10; i++) {
            st=st+10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(DC+" "+video+" "+ st + "% DOWNLOAD STARTED"+RESET);
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(DC+" "+ video+" "+st+ D+RESET);
                case 10 -> System.out.println(DC+video+" "+st + " "+D+RESET);
            }
        }
    }

    @Override
    public void run() {
//        System.out.println("THREAD_ID :"+threadId()+" NAME : "+getName()+" PRIORITY : "+getPriority());
        download();
    }
}
