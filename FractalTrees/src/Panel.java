import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Panel extends JPanel {
    private final int height;

    public Panel(int height) {
        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1440, 770);
        g.setColor(new Color(255, 255, 255, 155));
        g.translate(770, 770);
        //((Graphics2D) g).scale(2, 2);
        drawBranch(8, height, (Graphics2D) g);
    }

    private void drawBranch(int level, int length, Graphics2D g) {
        if (level > 0) {
            g.drawLine(0, 0, 0, -length);
            g.translate(0, -length);
            double increment = Math.PI / (level + 1);
            double startingAngle = Math.max((-Math.PI / 2) + increment , Math.toRadians(-30));
            double endAngle = (Math.PI / 2);
            while (startingAngle <= endAngle) {
                AffineTransform affineTransform = g.getTransform();
                g.rotate(startingAngle);
                drawBranch(level - 1, (int) (length * 0.6), g);
                startingAngle += increment;
                g.setTransform(affineTransform);
            }
        }

    }
}
