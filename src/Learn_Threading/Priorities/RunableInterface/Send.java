package Learn_Threading.Priorities.RunableInterface;

import static VerseMinds.ColoredConsole.Main.*;

public class Send implements Runnable{
    String video;
    public Send(String video){
        this.video=video;
    }

    String RESET ="\u001B[0m";
    String UC = BRIGHT_BG_WHITE + BLACK;

    void send(){
        String D="% SENDING";
        int st=0;
        for (int i = 0; i <= 10; i++) {
            st=st+10;
            switch (i) {
                case 0 -> {
                    st = 0;       //st=st-10;
                    System.out.println(UC+video+" "+ st + "% SENDING STARTED"+RESET);
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(UC+video+" "+st+ D+RESET);
                case 10 -> System.out.println(UC+video+" "+st + "% COMPLETED "+RESET);
            }
        }
    }

    @Override
    public void run() {
        send();
    }

}
