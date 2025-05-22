package pomobuddy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class TimerPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private double progress = 0.0;
    private int totalSeconds = 0;
    private int elapsedSeconds = 0;

    public TimerPanel() {
    }

    public void setProgress(double progress, int totalSeconds, int elapsedSeconds) {
        this.progress = progress;
        this.totalSeconds = totalSeconds;
        this.elapsedSeconds = elapsedSeconds;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int diameter = Math.min(getWidth(), getHeight());
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        // Background circle
        g2d.setColor(new Color(255, 175, 204));
        g2d.fillOval(x, y, diameter, diameter);

        // Progress arc
        g2d.setColor(new Color(255, 175, 204));
        g2d.fillArc(x, y, diameter, diameter, 90, (int) (-360 * progress));

        // Inner white circle
        g2d.setColor(new Color(189, 224, 254));
        g2d.fillOval(x + 20, y + 20, diameter - 40, diameter - 40);

        // Remaining time
        int remainingSeconds = totalSeconds - elapsedSeconds;
        int remainingMinutes = remainingSeconds / 60;
        int remainingSecs = remainingSeconds % 60;

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString(
            String.format("%02d:%02d", remainingMinutes, remainingSecs),
            getWidth() / 2 - 30, getHeight() / 2 + 5
        );
    }

}