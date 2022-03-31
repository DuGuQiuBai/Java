package day11.Component;

import java.awt.*;


public class PanelTest {
    public static void main(String[] args) {
        Frame f = new Frame("Panel test");
        Panel p = new Panel();
        p.add(new TextField("text test"));
        p.add(new Button("button"));
        f.add(p);
        f.setBounds(200, 200, 500, 500);
        f.setVisible(true);
        f.setBackground(Color.DARK_GRAY);
        
    }
}
