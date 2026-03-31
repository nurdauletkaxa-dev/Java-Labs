import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class zadanie4 extends Applet implements ActionListener {
    Button btn;
    String message = "";

    public void init() {
        btn = new Button("Нажми меня");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Кнопка нажата!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}