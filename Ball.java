import java.awt.*;

public class Ball {
    private int x, y;
    private int size = 30;
    private int move = 4;
    private int windowSize = 100;
    private boolean changeColor = false;
    private int num = 0;

    private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    public Ball(int x, int y, int windowSize) {
        this.x = x;
        this.y = y;
        this.windowSize = windowSize;
    }

    public void move() {
        x += move; // Move 4 pixels to the right each frame
        if(x >= windowSize-(size)){
            move *=-1;
            changeColor = true;
        } else if (x < 0){
            move *=-1;
            changeColor = true;
        }
    }

    public void draw(Graphics g) {
        if(changeColor){
            num = (int)(Math.random() * (colors.length-1));
            size++;
            changeColor = false;
        }
        // Color colour = colors[(int)(Math.random() * (colors.length-1))];
        // System.out.println(colour + "");
        Color colour = colors[num];
        g.setColor(colour);
        g.fillRect(x, y, size, size);
    }
}