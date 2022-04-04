package GUI.calc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame {

    public Calculator() {
        //3个文本框
        TextField num1 = new TextField(15);
        TextField num2 = new TextField(15);
        TextField num3 = new TextField(30);
        
        //1个按钮
        Button button = new Button("=");
        //1个标签
        Label label = new Label("+");

        setLayout(new FlowLayout());
        setVisible(true);
        pack();
        windowclose();

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        MyCalculatorListener myCalculatorListener = new MyCalculatorListener(num1, num2, num3);
        button.addActionListener(myCalculatorListener);
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
