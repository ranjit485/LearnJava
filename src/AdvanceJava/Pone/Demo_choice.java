package AdvanceJava.Pone;

import java.awt.*;

public class Demo_choice {
    Demo_choice() {
        Frame f1 = new Frame();
        f1.setSize(300, 300);
        f1.setTitle("Ranjit");


        Choice names = new Choice();
        names.add("ranjit");
        names.add("raj");
        names.add("rohit");

        f1.add(names);

        f1.setVisible(true);

    }

    public static void main(String[] args) {
        new Demo_choice();
    }
}
