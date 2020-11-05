//2.9
import javax.swing.JFrame;

public class FrameWindows {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        frame.setSize(300, 300);
        frame.setTitle("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SquareComponent component = new SquareComponent();
        frame.add(component);
        frame.setVisible(true);


    }
}