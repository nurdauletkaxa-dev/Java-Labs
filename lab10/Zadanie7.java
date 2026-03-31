import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class zadanie7 extends Applet implements ActionListener {
    Color color = Color.BLACK;

    public void init() {
        Button r = new Button("Red");
        Button g = new Button("Green");
        Button b = new Button("Blue");

        add(r);
        add(g);
        add(b);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Red")) color = Color.RED;
        if (cmd.equals("Green")) color = Color.GREEN;
        if (cmd.equals("Blue")) color = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(100, 100, 100, 100);
    }
}