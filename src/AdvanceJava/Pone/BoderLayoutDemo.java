package AdvanceJava.Pone;

import java.awt.*;

public class BoderLayoutDemo {
    BoderLayoutDemo() {
        Frame f = new Frame("BorderLayoutDemo");
        f.setResizable(false);
        f.setBackground(Color.DARK_GRAY);
        f.setSize(400, 250);
        f.setLayout(new BorderLayout(6, 6));

        Button North = new Button("NORTH");
        Button South = new Button("SOUTH");
        Button East = new Button("EAST");
        Button West = new Button("WEST");
        Button Center = new Button("CENTER");

        f.add(Center, BorderLayout.CENTER);
        f.add(South, BorderLayout.SOUTH);
        f.add(East, BorderLayout.EAST);
        f.add(West, BorderLayout.WEST);
        f.add(North, BorderLayout.NORTH);


        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoderLayoutDemo();
    }
}
