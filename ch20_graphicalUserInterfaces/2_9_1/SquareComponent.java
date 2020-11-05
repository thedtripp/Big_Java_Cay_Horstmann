//2.9
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class SquareComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(5, 10, 30, 30);
        g2.draw(box);
        Rectangle square = new Rectangle(50, 60, 20, 30);
        g2.draw(square);
    }
}
