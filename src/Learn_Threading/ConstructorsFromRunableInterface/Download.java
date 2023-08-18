package Learn_Threading.ConstructorsFromRunableInterface;

import static java.lang.Character.getName;

public class Download implements Runnable{

    String RESET ="\u001B[0m";
    String YB_BC = "\u001B[43m"+"\u001B[30m";
    String BB_WC = "\u001B[40m"+"\u001B[37m";
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
                    System.out.println(BB_WC+video+" "+ st + "% DOWNLOAD STARTED"+RESET);
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(BB_WC+ video+" "+st+ D+RESET);
                case 10 -> System.out.println(BB_WC+video+" "+st + "% COMPLETED "+RESET);
            }
        }
    }


    @Override
    public void run() {
//        System.out.println("THREAD_ID :"+threadId()+" NAME : "+getName()+" PRIORITY : "+getPriority());
        download();
    }

}
