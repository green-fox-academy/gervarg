import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_14_FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;

        drawLines(graphics, x, y);



    }
    public static void drawLines(Graphics graphics, int x, int y) {
        graphics.setColor(Color.RED);
        for (int i = 0; i < WIDTH/20; i++) {
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
            x = x +20;
        }
        for (int j = 0; j < HEIGHT/20 ; j++) {
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
            y += 20;
        }
        for (int k = 0; k < WIDTH/20 ; k++) {
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
            x -= 20;
        }
        for (int l = 0; l < HEIGHT/20; l++) {
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
            y -= 20;
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}