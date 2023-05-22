import java.awt.*;
import java.awt.event.*;

public class A_color implements ActionListener{
    Frame f1;
    Panel p1;
    Button b1,b2,b3;

    A_color() {
        f1 = new Frame("Color Change Program");
        p1 = new Panel();
        f1.setSize(400,500);
        f1.setVisible(true);
        f1.add(p1);
        b1 = new Button("Red");
        b1.addActionListener(this);
        b2 = new Button("GREEN");
        b2.addActionListener(this);
        b3 = new Button("BLUE");
        b3.addActionListener(this);
        p1.setLayout(null);
        b1.setBounds(100,100,50,30);
        b2.setBounds(220,100,50,30);
        b3.setBounds(160,100,50,30);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
    }
    public void actionPerformed(ActionEvent e) {
        Object o1 = e.getSource();
        if(o1 == b1){
            p1.setBackground(Color.RED);
        }
        if(o1 == b2){
            p1.setBackground(Color.GREEN);
        }
        if(o1 == b3){
            p1.setBackground(Color.BLUE);
        }
    }
    public static void main(String[] args) {
        new A_color();
    }
}
