package Learn_Threading.Priorities.RunableInterface;

public class Upload implements Runnable{
    String video;
    public Upload(String video){
        this.video=video;
    }

    String RESET ="\u001B[0m";
    String UC = "\u001B[40m"+"\u001B[37m";

    void upload(){
        String D="% UPLOADED";
        int st=0;
        for (int i = 0; i <= 10; i++) {
            st=st+10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(UC+video+" "+ st + "% UPLOAD STARTED"+RESET);
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(UC+video+" "+st+ D+RESET);
                case 10 -> System.out.println(UC+video+" "+st +" "+ D+RESET);
            }
        }
    }

    @Override
    public void run() {
        upload();
    }

}
