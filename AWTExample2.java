import java.awt.*;

class AWTExample2 {

   AWTExample2() {
      Frame f = new Frame();
      Label l = new Label("Employee id:");
      Button b = new Button("Submit");
      TextField t = new TextField();
      l.setBounds(20, 80, 80, 30);
      t.setBounds(20, 110, 500, 30);
      b.setBounds(521, 109, 80, 30);
      t.setText("Write......");
      // t.setEchoChar('*');
      f.add(b);
      f.add(l);
      f.add(t);
      f.setSize(400, 300);
      f.setTitle("Employee info");
      f.setLayout(null);
      f.setVisible(true);
   }
   public static void main(String args[]) {
      AWTExample2 awt_obj = new AWTExample2();
   }
}