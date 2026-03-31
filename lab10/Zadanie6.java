import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class zadanie6 extends Applet implements ActionListener {
    TextField tf;
    Button btn;
    String message = "";

    public void init() {
        tf = new TextField(15);
        btn = new Button("OK");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Привет, " + tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}