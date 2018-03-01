import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveSquares {
  public static void mainDraw(Graphics graphics){
    int size =1;
    int x = WIDTH/3;
    int y = 0;
    graphics.drawRect(0,0,WIDTH,HEIGHT);
    recursion(graphics, size, x, y);

  }

  private static void recursion(Graphics graphics, int squareSize, int x, int y) {
    graphics.drawRect(x,y,squareSize,squareSize);




  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
      setBackground(Color.yellow);
    }
  }
}