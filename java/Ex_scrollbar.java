import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/**<applet code=Ex_scrollbar height=500 width=500>
</applet>*/

public class Ex_scrollbar extends Applet implements AdjustmentListener,ActionListener
{
   Scrollbar sc1,sc2,sc3;
   int r,g,b;
   TextField t1,t2,t3;
   Button b1;
   Color c1= Color.pink;
   public void init()
   {     
     setLayout(null);
     sc1 = new Scrollbar(Scrollbar.HORIZONTAL,100,10,0,265);
     t1 = new TextField(10);
     sc2 = new Scrollbar(Scrollbar.HORIZONTAL,100,10,0,265);
     t2 = new TextField(10);
     sc3 = new Scrollbar(Scrollbar.HORIZONTAL,100,10,0,265);
     t3 = new TextField(10);
     b1 = new Button("CHANGE COLOR"); 
      
     sc1.setBounds(100,100,200,20);
     t1.setBounds(300, 100, 50, 20);
     sc2.setBounds(100,200,200,20);
     t2.setBounds(300, 200, 50, 20);
     sc3.setBounds(100,300,200,20);
     t3.setBounds(300, 300, 50, 20);
     b1.setBounds(390,200,120,20);
    
     sc1.setUnitIncrement(10);
     sc2.setUnitIncrement(10);
     sc3.setUnitIncrement(10);
     sc1.setBlockIncrement(50);
     sc2.setBlockIncrement(50);
     sc3.setBlockIncrement(50);
    
     sc1.addAdjustmentListener(this);
     sc2.addAdjustmentListener(this);
     sc3.addAdjustmentListener(this);
     b1.addActionListener(this);
    
     add(sc1);
     add(sc2);
     add(sc3);
     add(t1);
     add(t2);
     add(t3);
     add(b1);
   }
public void adjustmentValueChanged(AdjustmentEvent ae)
{
   if(ae.getSource()==sc1)
   {
      t1.setText(""+sc1.getValue());
   }
   if(ae.getSource()==sc2)
   {
      t2.setText(""+sc2.getValue());
   }
   if(ae.getSource()==sc3)
   {
      t3.setText(""+sc3.getValue());
   }
   repaint();
}
public void actionPerformed(ActionEvent ae)
{
   r=Integer.parseInt(t1.getText());
   g=Integer.parseInt(t2.getText());
   b=Integer.parseInt(t3.getText());
   c1= new Color(r,g,b);
   repaint();
}
public void paint (Graphics g)
{
   setBackground(c1);
}
}