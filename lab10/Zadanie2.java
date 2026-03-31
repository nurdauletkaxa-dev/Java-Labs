import java.applet.Applet;
import java.awt.*;

public class Zadanie2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 80, 80);

        g.setColor(Color.GREEN);
        g.fillOval(150, 50, 80, 80);

        g.setColor(Color.BLUE);
        g.drawLine(50, 150, 200, 150);

        g.setColor(Color.ORANGE);
        g.drawRect(250, 50, 80, 80);
    }
}