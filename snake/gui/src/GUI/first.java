package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class first {
    public static void main(String[] args) {
        Frame frame = new Frame("first");
        frame.setVisible(true);
        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        button2.setActionCommand("cnm");
        mymonitor mmn = new mymonitor();
        button1.addActionListener(mmn);
        button2.addActionListener(mmn);

        frame.add(button1, BorderLayout.SOUTH);
        frame.add(button2, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
        windowclose(frame);
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

class mymonitor implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("nima" + e.getActionCommand());
    }

}
