package Learn_Threading.ConstructorsFromThreadClass;


public class Upload extends Thread{
    public Upload(String videoName){
        super(videoName);
    }

    String RESET ="\u001B[0m";
    String YB_BC = "\u001B[43m"+"\u001B[30m";
    String BB_WC = "\u001B[40m"+"\u001B[37m";

    void upload(){
        String U="% UPLOADED";
        int st=0;
        for (int i = 0; i <= 10; i++) {
            st=st+10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(YB_BC+threadId()+" "+getName() + " " + st + U+RESET);
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(YB_BC+threadId()+" "+getName() + " " + st + U+RESET);
                case 10 -> System.out.println(YB_BC+threadId()+" "+getName() + " " + st + "% COMPLETED "+U+RESET);
            }
        }
    }
    @Override
    public void run() {
        upload();
    }
}
