import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AnimationPanel extends JPanel implements KeyListener {
    private Ball ball;
    private Timer timer;

    public AnimationPanel(int windowSize) {
        ball = new Ball(0, 100, windowSize);
        timer = new Timer(16, e -> {
            // if(){}
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

    public void keyTyped(KeyEvent e) {
        // Invoked when a key has been typed.
    }

    public void keyPressed(KeyEvent e) {
        // Invoked when a key has been pressed.
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            // myMethod();
            System.out.println();
        }
    }

    public void keyReleased(KeyEvent e) {
        // Invoked when a key has been released.
    }
}