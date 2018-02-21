import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_13_CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int horizontalPos = 0;
        int verticalPos = 0;
        int size = 40;

        for (int row = 0; row < 8; row++) {

            for (int column = 0; column < 8 ; column++) {
                
                if (redConditionCheck(row, column)){
                    graphics.setColor(Color.RED);
                } else {
                    graphics.setColor(Color.BLACK);
                }
                graphics.fillRect(horizontalPos,verticalPos, size, size);
                horizontalPos = horizontalPos + size;
            }
            horizontalPos = 0;
            verticalPos += size;
        }
    }

    public static boolean redConditionCheck(int row, int column) {
        return (column % 2 == 0 && row % 2 == 0) || (column % 2 != 0 && row % 2 != 0);
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