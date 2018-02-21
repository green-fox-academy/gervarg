import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_15_ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] polygon = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                 {120, 100}, {85, 130}, {50, 100}};
        connectDots(graphics,box);
        connectDots(graphics,polygon);


    }

    public static void connectDots(Graphics graphics, int[][] dots) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < dots.length; i++) {
            int startX = dots[i][0];
            int startY = dots[i][1];
            int endX, endY;
            if (i == dots.length-1) {
                endX = dots[0][0];
                endY = dots[0][1];
            } else {
                endX = dots[i + 1][0];
                endY = dots[i + 1][1];
            }
            graphics.drawLine(startX, startY, endX, endY);
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


// create a 300x300 canvas.