import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class zadanie5 extends Applet implements ActionListener {
    Button btn;
    int count = 0;

    public void init() {
        btn = new Button("Нажми");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Счётчик: " + count, 50, 100);
    }
}