package Learn_Threading.PracticSet;

import static VerseMinds.ColoredConsole.Main.*;

public class Welcome implements Runnable{
    void wellocome(){
        for (int i =0; i < 10; i++) {
            println(" HELLO WELCOME ",WHITE,BG_BLACK);
        }
    }
    @Override
    public void run(){
        wellocome();
    }
}
