import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_choice2 height=500 width=500>
    </applet>*/
public class Ex_choice2 extends Applet implements ItemListener,ActionListener
{
   Choice c1,c2,c3;
   Button b1;
   Color c4=Color.white;
   String s1="";
   int r,g,b;
   public void init()
   {
      c1= new Choice();
      c2= new Choice();
      c3= new Choice();
      b1= new Button("OK");
      
      for(int i=0;i<256;i++)
      {
         c1.addItem(""+i);
         c2.addItem(""+i);
         c3.addItem(""+i);

      }

      c1.addItemListener(this);
      c2.addItemListener(this);
      c3.addItemListener(this);
      b1.addActionListener(this);
      

      add(c1);
      add(c2);
      add(c3);
      add(b1);
   }
  public void itemStateChanged(ItemEvent ie)
  {  
   r= Integer.parseInt(c1.getSelectedItem());
   g= Integer.parseInt(c2.getSelectedItem());
   b= Integer.parseInt(c3.getSelectedItem()); 
      repaint();
  }
  public void actionPerformed(ActionEvent ae)
  {
  
   c4= new Color(r,g,b);
   repaint();
  }
public void paint(Graphics g)
{
   setBackground(c4);
}
}