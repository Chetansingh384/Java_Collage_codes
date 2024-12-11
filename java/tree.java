import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tree extends JFrame implements AdjustmentListener {
    JScrollBar sc1, sc2;
    int x = 100, y = 100;

    public tree() {
        setLayout(null);
        setSize(500, 500);

        sc1 = new JScrollBar(JScrollBar.HORIZONTAL, 100, 10, 0, 2000);
        sc2 = new JScrollBar(JScrollBar.VERTICAL, 100, 10, 0, 2000);

        sc1.setUnitIncrement(10);
        sc2.setUnitIncrement(10);
        sc1.setBlockIncrement(50);
        sc2.setBlockIncrement(50);

        sc1.setBounds(0, getHeight() - 50, getWidth() - 30, 30);
        sc2.setBounds(getWidth() - 30, 0, 30, getHeight() - 50);

        sc1.addAdjustmentListener(this);
        sc2.addAdjustmentListener(this);

        add(sc1);
        add(sc2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource() == sc1) {
            x = sc1.getValue();
        } else {
            y = sc2.getValue();
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("HELLO DON", x, y);
    }

    public static void main(String[] args) {
        new tree();
    }
}
