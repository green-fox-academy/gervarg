import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_02_LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int n = 4;
    int division = WIDTH/n;
    drawLines(graphics, n, division);




  }
  public static void drawLines(Graphics graphics, int n, int division) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < division; j+= 20/n) {
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(j,0, division, j);
      }

      for (int k = 0; k < division ; k+=20/n) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(division-k,division, 0, division-k);
      }

    }


  }
 /* public static void drawLines(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < WIDTH/2; i+= 10) {
      graphics.drawLine(WIDTH/2,i, WIDTH/2+i, WIDTH/2);
      graphics.drawLine(WIDTH/2,i, WIDTH/2-i, WIDTH/2);
      graphics.drawLine(WIDTH/2,WIDTH-i,WIDTH/2-i,WIDTH/2);
      graphics.drawLine(WIDTH/2,WIDTH-i, WIDTH/2+i,WIDTH/2);
    }
  }*/



  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new Exercise_01_LinePlay.ImagePanel());
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
