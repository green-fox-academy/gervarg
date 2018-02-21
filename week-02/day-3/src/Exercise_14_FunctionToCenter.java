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
        while (x <= 300){
            x = x +20;
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
        }
        y= 343;
        x = 0;
        while ( x <= 300){
            x += 20;
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
        }
        while( y >= 0){
            y -= 20;
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
        }
        x = 0;
        while ( y <= 340){
            y += 20;
            graphics.drawLine(x,y, WIDTH/2, HEIGHT/2);
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