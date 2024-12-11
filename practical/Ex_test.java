import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_test height=500 width=500>
    </applet>*/
public class Ex_test extends Applet implements ItemListener
{    
   
     Checkbox ch1;
     Label l1;
     public void init() 
     {  
          ch1= new Checkbox("A");
          l1 = new Label("hello");
          ch1.addItemListener(this);
          add(ch1);
          add(l1);
           
    }
    public void itemStateChanged(ItemEvent ie)
    
   {       
       
      repaint();
    }
public void paint(Graphics g)
     {   
     }
     public static void main(String[] args) {
          new Ex_test();
      }
  
}     
       