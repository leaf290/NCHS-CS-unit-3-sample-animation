import java.awt.*;

public class Ball {
    private int x, y;
    private final int SIZE = 30;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += 2; // Move 2 pixels to the right each frame
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, SIZE, SIZE);
    }
}