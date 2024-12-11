import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_text height=500 width=500>
    </applet>*/
public class Ex_text extends Applet implements ActionListener
{    
     Button B1;
     TextField T1,T2,T3;
     Color C1=Color.green;
     String s2="";
     public void init()
     {  
          B1= new Button("OK");
          T1= new TextField(5);
          T2= new TextField(5);
          T3= new TextField(5);
          setForeground(Color.red);
     
           B1.addActionListener(this);
           add(B1);
           add(T1);
           add(T2);
           add(T3);
    }
    public void actionPerformed(ActionEvent ae)
   {     
       if(ae.getSource()==B1)
       {  try{
          int red=Integer.parseInt(T1.getText());
          int green=Integer.parseInt(T2.getText());
          int blue=Integer.parseInt(T3.getText());
          
          if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
               throw new NumberFormatException();
           }
          
          C1= new Color(red,green,blue);
          T1.setText("");
          T1.requestFocus();
          T2.setText("");
          T2.requestFocus();
          T3.setText("");
          T3.requestFocus();
       }
     
     catch (NumberFormatException e) {
          // Display an error message for invalid input
        s2="PLEASE ENTER A VALID NUMBER";
      }
  
    repaint();
   }
}
public void paint(Graphics g)
     {   
          setBackground(C1);
          g.setColor(Color.red);
          g.drawString("HELLO DON" + ""+ s2,100,200);

     }
}