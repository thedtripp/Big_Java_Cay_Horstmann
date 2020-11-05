import javax.swing.JFrame;

//Moar GUI programming in Chapters 3, 10, 20.

public class EmptyFrameViewer {
    public static void main(String[] args) {
        System.out.println("hi.");
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("An empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}