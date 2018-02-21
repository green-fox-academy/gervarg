import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_07_FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 10;
        int y = 10;
        int rectHeight = 20;
        int rectWidth = 20;
        for (int i = 0; i < 4 ; i++) {
            x = x +30;
            y = y+40;
            rectHeight = rectHeight + 10;
            rectWidth = rectWidth + 20;
            graphics.setColor(new Color(255-x,20+y, 50+rectHeight));
            graphics.drawRect(x,y,rectWidth, rectHeight);

        }


    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}