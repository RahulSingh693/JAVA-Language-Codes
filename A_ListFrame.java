import java.awt.*;
import java.awt.event.*;

public class A_ListFrame extends Frame implements ActionListener {
    Frame f1;
    List l1, l2;
    Button b1, b2;
    Panel p1;

    A_ListFrame()
    {
        f1 = new Frame("Names");
        f1.setSize(400, 400);
        f1.setVisible(true);
        p1 = new Panel();
        f1.add(p1);
        l1 = new List(10, false);
        l1.add("Rahul");
        l1.add("Rajnish");
        l1.add("Sahil");
        l2 = new List(10, false);
        l2.add("Lakshay");
        l2.add("Kundan");
        b1 = new Button("=>");
        b2 = new Button("<=");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1.setBounds(100,100,100,200);
        l2.setBounds(300,100,100,200);
        b1.setBounds(220,140,50,30);
        b2.setBounds(220,180,50,30);
        p1.setLayout(null);
        p1.add(l1);
        p1.add(l2);
        p1.add(b1);
        p1.add(b2);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        String s1;
        if(obj == b1)
        {
            s1 = l1.getSelectedItem();
            if(s1.length() > 0){
                l2.add(s1);
                l1.remove(s1);
            }
        }
        else if(obj == b2)
        {
            s1 = l2.getSelectedItem();
            if(s1.length() > 0) {
                l1.add(s1);
                l2.remove(s1);
            }
        }
    }
    public static void main(String[] args) {
        new A_ListFrame();
    }
}
