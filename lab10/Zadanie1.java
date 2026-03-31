import java.applet.Applet;
import java.awt.*;

public class Zadanie1 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 60, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 210, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Line", 100, 140);
    }
}