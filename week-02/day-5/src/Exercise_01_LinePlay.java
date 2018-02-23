import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_01_LinePlay {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int x = 0;
    int y = 0;

    drawLines(graphics, x, y);




  }
  public static void drawLines(Graphics graphics, int x, int y) {
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < WIDTH/20; i++) {
      graphics.drawLine(x,0, WIDTH, y);
      x = x +20;
      y = y + 20;
    }
    x = 0;
    y = 0;
    graphics.setColor(Color.GREEN);
    for (int j = 0; j < WIDTH/20 ; j++) {
      graphics.drawLine(WIDTH-x,HEIGHT, 0, HEIGHT-y);
      x = x + 20;
      y += 20;
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