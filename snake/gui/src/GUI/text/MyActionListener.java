package GUI.text;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField f = (TextField) e.getSource();
        System.out.println(f.getText());
        f.setText("");
    }
}