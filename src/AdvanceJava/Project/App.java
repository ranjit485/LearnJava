package AdvanceJava.Project;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    JButton BtnSem3, BtnSem4, BtnSem5, BtnSem6;
    JPanel Main;
    JPanel Navigation, NavChild, BuyMe;
    private JButton buyMeATeaButton;
    private JTabbedPane tabbedPane1;
    private JButton button1;
    private JButton sem5;
    private JButton btn3;
    private JButton sem6;
    private JButton sem4;
    private JButton sem3;

    App() {

        this.setTitle("runner");
        this.setSize(400, 400);
        this.setLayout(new GridLayout(3, 1));
//        this.add(Main);
//        Main.setBackground(Color.darkGray);
//        Main.setSize(400, 10);

        Navigation = new JPanel(); // This panel contain group of button
        Navigation.setLayout(new GridLayout(1, 3));
        Navigation.setBackground(Color.yellow);
        Navigation.setSize(400, 20);

        BtnSem3 = new JButton("SEM-3");
        BtnSem4 = new JButton("SEM-4");
        BtnSem5 = new JButton("SEM-5");
        BtnSem6 = new JButton("SEM-6");

        Navigation.add(BtnSem3);
        Navigation.add(BtnSem4);
        Navigation.add(BtnSem5);
        Navigation.add(BtnSem6);

        NavChild = new JPanel();
        BuyMe = new JPanel();

//        this.add(Main);
//        this.add(NavChild);
        this.add(Navigation);
//
//        sem6.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(sem6, "hello");
//            }
//        });
//        sem3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(sem3, "hello");
//            }
//        });
//        sem4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(sem4, "hello");
//            }
//        });
//        sem5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(sem5, "hello");
//            }
//        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
