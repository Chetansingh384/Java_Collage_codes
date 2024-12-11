import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_choice height=500 width=500>
    </applet>*/
public class Ex_choice extends Applet implements ItemListener,ActionListener
{
   Label l1;
   TextField t1;
   Button b1;
   Choice c1;
   TextArea ta;
   
   public void init()
 {
   l1= new Label("NAME");
   t1= new TextField(10); 
   b1= new Button("OK");
   c1= new Choice();
   ta= new TextArea();
   
   c1.setFont(new Font("Arial", Font.BOLD,18));
   c1.setSize(500, c1.getPreferredSize().height); 
   
    b1.addActionListener(this);
    c1.addItemListener(this);
    add(l1);
    add(t1);
    add(b1);
    add(ta);
    add(c1);
}


public void itemStateChanged(ItemEvent ie)
{
   ta.append(c1.getSelectedItem()+"\n");
   repaint();
}
public void actionPerformed(ActionEvent ae)
{
   c1.addItem(t1.getText());
   t1.setText("");
   t1.requestFocus();
}
public void paint(Graphics g)
{   
  
}
}