package GUI.MyCalc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCalculator extends Frame {
    public MyCalculator() {
        setBounds(1000, 100, 400, 600);
        setVisible(true);
        setLayout(new GridLayout(2,1));
        
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        
        AddButton(p2);

        add(p1);
        add(p2);

        //关闭窗口
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
    }

    //设置输入输出框
    public void AddTextField(Container cp) {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        cp.add(tf1, tf2);
    }

    //添加键盘数字
    public void AddButton(Container cp) {
        Button button11 = new Button("%");
        Button button12 = new Button("CE");
        Button button13 = new Button("C");
        Button button14 = new Button("Back");
        Button button21 = new Button("1/x");
        Button button22 = new Button("x²");
        Button button23 = new Button("sqrt(x)");
        Button button24 = new Button("÷");
        Button button31 = new Button("7");
        Button button32 = new Button("8");
        Button button33 = new Button("9");
        Button button34 = new Button("×");
        Button button41 = new Button("4");
        Button button42 = new Button("5");
        Button button43 = new Button("6");
        Button button44 = new Button("-");
        Button button51 = new Button("1");
        Button button52 = new Button("2");
        Button button53 = new Button("3");
        Button button54 = new Button("+");
        Button button61 = new Button("+/-");
        Button button62 = new Button("0");
        Button button63 = new Button(".");
        Button button64 = new Button("=");

        button64.setBackground(new Color(207, 82, 119));
        cp.setLayout(new GridLayout(6, 4, 3, 3));

        cp.add(button11);cp.add(button12);cp.add(button13);cp.add(button14);
        cp.add(button21);cp.add(button22);cp.add(button23);cp.add(button24);
        cp.add(button31);cp.add(button32);cp.add(button33);cp.add(button34);
        cp.add(button41);cp.add(button42);cp.add(button43);cp.add(button44);
        cp.add(button51);cp.add(button52);cp.add(button53);cp.add(button54);
        cp.add(button61);cp.add(button62);cp.add(button63);cp.add(button64);
    }
}
