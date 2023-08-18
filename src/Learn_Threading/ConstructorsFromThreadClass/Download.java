package Learn_Threading.ConstructorsFromThreadClass;

public class Download extends Thread{

    String RESET ="\u001B[0m";
    String YB_BC = "\u001B[43m"+"\u001B[30m";
    String BB_WC = "\u001B[40m"+"\u001B[37m";

    public Download(String videoName){
        super(videoName);
    }
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
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st+ D+RESET);
                case 10 -> System.out.println(BB_WC+threadId()+" "+getName() + " " + st + "% COMPLETED "+RESET);
            }
        }
    }

    @Override
    public void run() {
//        System.out.println("THREAD_ID :"+threadId()+" NAME : "+getName()+" PRIORITY : "+getPriority());
        download();

    }
}
