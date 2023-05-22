import java.awt.*;
import java.awt.event.*;

public class A_mouse_event extends Frame implements MouseListener {
    Button l;
    A_mouse_event() {
        setTitle("Mouse Events");
        l = new Button();
        l.addMouseListener(this);
        l.setBounds(20, 50, 100, 50);
        l.setBackground(Color.RED);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        l.setLabel("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setLabel("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setLabel("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setLabel("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setLabel("Mouse Released");
    }
    public static void main(String[] args) {
        new A_mouse_event();
    }
}

// import java.awt.*;
// import java.awt.event.*;

// public class A_mouse_event extends Frame implements MouseListener {
//     mouse_event() {
//         addMouseListener(this);
//         setSize(300, 300);
//         setLayout(null);
//         setVisible(true);
//     }

//     public void mouseClicked(MouseEvent e) {
//         Graphics g = getGraphics();
//         g.setColor(Color.BLUE);
        // g.fillOval(e.getX(), e.getY(), 100, 100);
//     }
//     public void mouseEntered(MouseEvent e) {}
//     public void mouseExited(MouseEvent e) {}
//     public void mousePressed(MouseEvent e) {}
//     public void mouseReleased(MouseEvent e) {}

//     public static void main(String[] args) {
//         new A_mouse_event();
//     }
// }
