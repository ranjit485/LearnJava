package AdvanceJava.Pone;

import java.awt.*;
/*  w  w w . j  a v  a 2 s .  c om*/
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class test1 extends JFrame {
    private JPanel childPanel1 = new JPanel();
    private JPanel childPanel2 = new JPanel();
    private JPanel childPanel3 = new JPanel();

    public test1() {


        JFrame Screen = new JFrame();
        Screen.setLayout(new GridLayout(3,1));
        Screen.setLocation(100, 200);
        Screen.setSize(350,300);
//        Screen.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));


        // this is button box
        JPanel Navbar = new JPanel();
        Navbar.setBackground(Color.DARK_GRAY);

        Navbar.setBorder(new EmptyBorder(0, 10, 0, 10));
        Navbar.setPreferredSize(new Dimension(200,50));
        JButton semBtn1 = new JButton("SEM-3");
        JButton semBtn2 = new JButton("SEM-4");
        JButton semBtn3 = new JButton("SEM-5");
        JButton semBtn4 = new JButton("SEM-6");
        JButton exa = new JButton("EXAM");



        Navbar.add(semBtn1);
        Navbar.add(semBtn2);
        Navbar.add(semBtn3);
        Navbar.add(semBtn4);

        childPanel1.setBackground(Color.red);
        childPanel1.setPreferredSize(new Dimension(300, 40));

        childPanel3.setBackground(Color.yellow);
        childPanel3.setPreferredSize(new Dimension(300, 40));


        childPanel2.setPreferredSize(new Dimension(300, 40));
        childPanel2.setBackground(Color.blue);


        semBtn2.addActionListener(e -> {
            childPanel1.add(exa);
            System.out.println("added");
        });



        Screen.add(Navbar);
        Screen.add(childPanel1);
        Screen.add(childPanel3);

        pack();
        Screen.setVisible(true);
    }

    public static void main(String[] args) {
        new test1();
    }

}