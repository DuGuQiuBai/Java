package GUI.MyCalc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCalculator extends Frame {
    public MyCalculator() {
        setBounds(300, 300, 400, 600);
        setVisible(true);
        setLayout(new GridLayout(2,1));
        windowclose();

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Button button11 = new Button("%");
        Button button12 = new Button("CE");
        Button button13 = new Button("C");
        Button button14 = new Button("Back");
        Button button21 = new Button("1/x");
        Button button22 = new Button("x²");
        Button button23 = new Button("x");


        p2.setLayout(new GridLayout(6, 4));
        p2.add(button11);
        p2.add(button12);
        p2.add(button13);
        p2.add(button14);

        add(p1);
        add(p2);
    }

    public void windowclose() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
