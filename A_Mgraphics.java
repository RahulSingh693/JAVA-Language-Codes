import java.awt.*;
import java.awt.event.*;

public class A_Mgraphics extends Frame implements ActionListener {
    MenuBar m;
    Menu m1, m2, m3, m4, m5, m6, m7;
    MenuItem m11,m12,m13,m14,m15;
    int f;

    A_Mgraphics() {
        setTitle("Graphics drawing");
        m = new MenuBar();
        setMenuBar(m);

        m1 = new Menu("Circle");
        m11 = new MenuItem("Draw");
        m2 = new Menu("Rectangle");
        m12 = new MenuItem("Draw");
        m3 = new Menu("Oval");
        m13 = new MenuItem("Draw");
        m4 = new Menu("Line");
        m14 = new MenuItem("Draw");
        m5 = new Menu("Arc");
        m15 = new MenuItem("Draw");
        
        m.add(m1);  m.add(m2);  m.add(m3);  m.add(m4);  m.add(m5);

        m11.addActionListener(this);
        m1.add(m11);
        m12.addActionListener(this);
        m2.add(m12);
        m13.addActionListener(this);
        m3.add(m13);
        m14.addActionListener(this);
        m4.add(m14);
        m15.addActionListener(this);
        m5.add(m15);
        setSize(600, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o == m11) {f = 1;}
        else if (o == m12) {f = 2;}
        else if (o == m13) {f = 3;}
        else if (o == m14) {f = 4;}
        else if (o == m15) {f = 5;}
        repaint();
    }

    public void paint(Graphics g) {
        if(f == 1) {g.drawOval(100, 100, 300, 300);}
        if(f == 2) {g.drawRect(100, 100, 400, 300);}
        if(f == 3) {g.drawOval(100, 100, 300, 250);}
        if(f == 4) {g.drawLine(50, 100, 300, 260);}
        if(f == 5) {g.drawArc(100, 100, 300, 100, 190, 150);}
    }
    public static void main(String[] args) {
        new A_Mgraphics();
    }
}