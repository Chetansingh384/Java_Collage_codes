import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_textarea height=500 width=500>
    </applet>*/
public class Ex_textarea extends Applet implements ActionListener
{ 
  TextArea ta;
  Label l1;
  Button b1;
  TextField t1;
  public void init()
 {
  l1= new Label("NAME");
  t1= new TextField(10);
  b1 = new Button("OK");
  ta = new TextArea();
  
   b1.addActionListener(this);
  add(l1);
  add(t1);
  add(b1);
  add(ta);
 }
 public void actionPerformed(ActionEvent ae)
 {
    ta.append(t1.getText()+ "\n");
    t1.setText("");
    t1.requestFocus();
 }

}