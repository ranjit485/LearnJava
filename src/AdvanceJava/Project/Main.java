package AdvanceJava.Project;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.PanelUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class Main extends BasicTabbedPaneUI {


    Main() {
        Color BgColor = new Color(40, 41, 46);

        JPanel Manuals, ModalAnswers, Syllabus, Notes, ThankMe;
        JPanel Three, Four, Five, Six;

        String[] css = {
                "margin:0px;",
                "padding:100%;",
                "width:3px;height:15px;margin:2px;" +
                        "color:white;" +
                        "text-align:center;border:none;"
        };

        String tabStyle = css[0] + css[1] + css[2];
        String html1 = "<html><body style = '" + tabStyle + "'>";
        String html2 = "</body></html>";

        JFrame Screen = new JFrame("RBuddy");
        ImageIcon Logo = new ImageIcon("AdvanceJava/Project/play-button.png");
        Screen.setIconImage(Logo.getImage());
        Screen.setLayout(new GridLayout(1, 1));
        Screen.setSize(350, 400);
        Screen.setResizable(false);
        Screen.getContentPane().setBackground(BgColor);


        JTabbedPane Navigation = new JTabbedPane();
        Navigation.setBackground(BgColor);

        // Remove borders from the tabbedPane
        Navigation.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void installDefaults() {
                super.installDefaults();
                tabAreaInsets = new Insets(0, 0, 0, 0);
                contentBorderInsets = new Insets(1, 0, 0, 0);
            }
        });


        Border customBorder = BorderFactory.createLineBorder(Color.RED, 1);


        Three = new JPanel();
        Four = new JPanel();
        Five = new JPanel();
        Six = new JPanel();
        ThankMe = new JPanel();


        // Styling components
        Three.setBackground(BgColor);
        Four.setBackground(BgColor);
        Five.setBackground(BgColor);
        Six.setBackground(BgColor);
        ThankMe.setBackground(BgColor);


        Navigation.addTab(html1 + "SEM-3" + html2, Three);
        Navigation.addTab(html1 + "SEM-4" + html2, Four);
        Navigation.addTab(html1 + "SEM-5" + html2, Five);
        Navigation.addTab(html1 + "SEM-6" + html2, Six);
        Navigation.addTab(html1 + "SUPPORT" + html2, ThankMe);

        Screen.add(Navigation);
        Screen.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

}
