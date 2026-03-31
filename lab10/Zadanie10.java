import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class zadanie10 extends Applet implements ActionListener {
    TextField tf;
    Button btn;
    String text = "";
    Color color = Color.BLUE;

    public void init() {
        tf = new TextField(15);
        btn = new Button("Показать");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();
        color = new Color((int)(Math.random() * 255),
                          (int)(Math.random() * 255),
                          (int)(Math.random() * 255));
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(100, 100, 100, 50);

        g.setColor(Color.BLACK);
        g.drawString(text, 100, 80);
    }
}