import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/** <applet code=Ex_scrollbar2 height=500 width=500>
</applet> */

public class Ex_scrollbar2 extends Applet implements AdjustmentListener
{
  Scrollbar sc1,sc2;
  int x=100,y=100;
  public void init()
  {
    setLayout(null);
    sc1= new Scrollbar(Scrollbar.HORIZONTAL,100,10,0,2000);
    sc2= new Scrollbar(Scrollbar.VERTICAL,100,10,0,2000);
    
    sc1.setUnitIncrement(10);
    sc2.setUnitIncrement(10);
    sc1.setBlockIncrement(50);
    sc2.setBlockIncrement(50);


    sc1.addAdjustmentListener(this);
    sc2.addAdjustmentListener(this);


    add(sc1);
    add(sc2);
  }

public void adjustmentValueChanged(AdjustmentEvent ae)
{
  if(ae.getSource()==sc1)
  {
     x=sc1.getValue();
  }
  else
  {
    y=sc2.getValue();
  }
 repaint();
}
public void paint(Graphics g)  
{
  sc1.setBounds(0, getHeight() - 50, getWidth() - 30, 30);
  sc2.setBounds(getWidth() - 30, 0, 30, getHeight() - 50);

   g.drawString("HELLO DON",x,y);
}
}