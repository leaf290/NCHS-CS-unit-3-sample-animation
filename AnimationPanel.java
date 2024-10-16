import javax.swing.*;
import java.awt.*;

public class AnimationPanel extends JPanel {
    private Ball ball;
    private Timer timer;

    public AnimationPanel(int windowSize) {
        ball = new Ball(0, 100, windowSize);
        timer = new Timer(16, e -> {
            ball.move();
            repaint();
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }

    public void startAnimation() {
        timer.start();
    }

    public void stopAnimation() {
        timer.stop();
    }
}