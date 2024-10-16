import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private AnimationPanel animationPanel;
    private JButton startButton;
    private JButton stopButton;

    public MainFrame() {
        setTitle("Ball Animation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        animationPanel = new AnimationPanel(400);
        add(animationPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        
        startButton.addActionListener(e -> animationPanel.startAnimation());
        stopButton.addActionListener(e -> animationPanel.stopAnimation());

        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        add(controlPanel, BorderLayout.SOUTH);
    }
}