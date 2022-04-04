package GUI.text;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Myframe extends Frame{
    public Myframe() {
        TextField text = new TextField();
        add(text);
        MyActionListener myActionListener = new MyActionListener();
        text.addActionListener(myActionListener);
        setVisible(true);
        pack();
        windowclose();
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
