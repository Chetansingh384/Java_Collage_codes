import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code=Ex_radio height=500 width=500>
    </applet>*/
public class Ex_radio extends Applet implements ItemListener,ActionListener
{    
     CheckboxGroup cbg= new CheckboxGroup();
     Checkbox r1,r2;
     Button b1,b2,b3,b4;
     Label l1;
     Color c1,c2;
     String s1="",s2="";
     public void init()
     {  
        b1 = new Button("RED"); 
        b2 = new Button("GREEN"); 
        r1= new Checkbox("BACKGROUND",true,cbg);
        b3 = new Button("BLUE"); 
        b4 = new Button("YELLOW"); 
        r2= new Checkbox("FOREGROUND",true,cbg);
        l1 = new Label("HELLO"); 

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        r1.addItemListener(this);
        r2.addItemListener(this);
        add(r1);
        add(r2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l1);
    }
    public void itemStateChanged(ItemEvent ie)
   {     
       
      repaint();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(r1.getState()==true)
        {
            if(ae.getSource()==b1)
            {
                c1=Color.red;
            }
            else if(ae.getSource()==b2)
            {
                c1=Color.green;
            }
        }
        else if(r2.getState()==true)
        {
            if(ae.getSource()==b3)
            {
                c2=Color.blue;
            }
            else if(ae.getSource()==b4)
            {
                c2=Color.yellow;
            }
        }
        repaint();
    }
public void paint(Graphics g)
     {   
       setBackground(c1);
       g.setColor(c2);
       g.drawString("HELLO DON",100,200);

      }
}