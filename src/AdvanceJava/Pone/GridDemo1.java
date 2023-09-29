package AdvanceJava.Pone;

import java.awt.*;

public class GridDemo1 {
    GridDemo1() {
        Frame f = new Frame();
        f.setTitle("GridDemo1");
        f.setSize(300, 300);
        GridLayout g1 = new GridLayout(3, 5, 9, 9);
        f.setLayout(g1);
        f.setBackground(Color.DARK_GRAY);
        f.setResizable(false);

        for (int i = 0; i < 9; i++) {
            f.add(new Button(" " + i));

        }
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new GridDemo1();
    }
}
