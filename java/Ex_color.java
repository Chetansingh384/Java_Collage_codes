import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_color height=500 width=500>
    </applet>*/
public class Ex_color extends Applet 
{    
     
     public void init()
     {  
          setBackground(Color.yellow);
          setForeground(Color.red);
    }
   
public void paint(Graphics g)
     {   
          g.drawString("HELLO JAVA="+getBackground(),100,200);
          g.setColor(Color.blue);
          g.drawString("WELCOME JAVA=",150,300);
     }
}