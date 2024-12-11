import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_check height=500 width=500>
    </applet>*/
public class Ex_practical extends Applet implements ItemListener
{    
   
     Checkbox ch1;
     public void init()
     {  
          ch1= new Checkbox("A");
          ch1.addItemListener(this);
          add(ch1);
           
    }
    public void itemStateChanged(ItemEvent ie)
   {       
       
      repaint();
    }
public void paint(Graphics g)
     {   
     }
     public static void main(String[] args) {
          new Ex_practical();
      }
  
}     
       