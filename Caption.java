import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Caption extends Applet implements ActionListener{
    Button b1;
    boolean flag;

    public void init() {
        b1 = new Button("OK");
        b1.addActionListener(this);
        b1.setBounds(100,100, 100, 40);
        setLayout(null);
        add(b1);
        flag = true;
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == b1 && flag) {
            b1.setLabel("DONE");
            flag = false;
        }
        else if(obj == b1 && !flag) {
            b1.setLabel("OK");
            flag = true;
        }
    }
}