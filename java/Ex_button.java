import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_check height=500 width=500>
    </applet>*/
public class Ex_button extends Applet implements ItemListener
{    
   
     Checkbox ch1,ch2,ch3,ch4;
     String s1="",s2="";
     public void init()
     {  
          ch1= new Checkbox("A");
          ch2= new Checkbox("B");
          ch3= new Checkbox("C");
          ch4= new Checkbox("SELECT ALL");

           ch1.addItemListener(this);
           ch2.addItemListener(this);
           ch3.addItemListener(this);
           ch4.addItemListener(this);
           add(ch1);
           add(ch2);
           add(ch3);
           add(ch4);
    }
    public void itemStateChanged(ItemEvent ie)
   {     
      if(ie.getSource()==ch4)
      {  
          ch1.setState(ch4.getState());
          ch2.setState(ch4.getState());
          ch3.setState(ch4.getState());
      }
       
       
      repaint();
    }
public void paint(Graphics g)
     {   
     }
}     
       