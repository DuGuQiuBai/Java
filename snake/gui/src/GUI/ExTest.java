package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setBounds(300, 300, 500, 700);
        f.setBackground(Color.BLUE);
        f.setLayout(new GridLayout(2, 1));

        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));
        
        p1.add(new Button("EAST-1"), BorderLayout.EAST);
        p1.add(new Button("WEST-1"), BorderLayout.WEST);
        p2.add(new Button("1"));
        p2.add(new Button("2"));
        p1.add(p2, BorderLayout.CENTER);

        p3.add(new Button("EAST-2"), BorderLayout.EAST);
        p3.setBackground(Color.BLACK);
        p3.add(new Button("WEST-2"), BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            p4.add(new Button(" " + i));
        }
        p3.add(p4, BorderLayout.CENTER);

        f.add(p1);
        f.add(p3);
        windowclose(f);
    }

    private static void windowclose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
