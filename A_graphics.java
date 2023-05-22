import java.applet.*;
import java.awt.*;

public class A_graphics extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello Rahul", 100, 60);
        g.fillRect(100, 200, 100, 40);
        g.drawRect(100, 40, 100, 40);
        g.drawRoundRect(100, 170, 100, 30, 10, 10);
        g.drawOval(80, 10, 50, 50);
        g.drawLine(100, 60, 200, 60);
        g.drawArc(150, 200, 50, 40, 180, 180);
    }
}