package Learn_Threading.PracticSet;
import static VerseMinds.ColoredConsole.Main.*;
public class GoodMorning extends Thread{
    void goodMorning(){
        int d = 0;
        for (int i =0; i < 10; i++) {
            d++;d--;d++;
            println(" GOOD MORNING  ",BLACK,BRIGHT_BG_YELLOW);
        }
    }
    @Override
    public void run() {
        goodMorning();
    }
}
