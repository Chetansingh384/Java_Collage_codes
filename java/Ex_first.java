import java.applet.*;
import java.awt.*;
/** <applet code=Ex_first height=500 width=500>
    </applet>*/

public class Ex_first extends Applet 
{    
     public void paint(Graphics g)
     {   
       
          g.drawRect(100,240,50,50);
          g.drawOval(100,240,50,50);
          g.fillRect(100,240,50,50);
     }
}