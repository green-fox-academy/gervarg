import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveSquares {
  static int LIMIT = 5;
  public static void mainDraw(Graphics graphics){

    int size = WIDTH/3;
    int x = size;
    int y = size;
    int n =0;
    recurseDrawSqaure(x,y,graphics, n,size);
    graphics.drawRect(0,0,WIDTH,HEIGHT);

  }

 /* private static void (Graphics graphics, int squareSize, int x, int y) {
    int n =0;
    graphics.drawRect(x,0,squareSize,squareSize);
    recurseDrawSqaure(x,0,graphics,n, squareSize);
    graphics.drawRect(0,y,squareSize,squareSize);
    graphics.drawRect(2*x,y,squareSize,squareSize);
    graphics.drawRect(x,2*y,squareSize,squareSize);
  }*/
  private static void recurseDrawSqaure(int w, int h, Graphics g, int n, int size){
    if ( n == LIMIT ) {
      return;
    } else {
      n++;
      g.drawRect(w-size,h,size,size);
      recurseDrawSqaure(w+size/3,h-size/3,g,n,size/3);
      g.drawRect(w+size,h,size,size);
      recurseDrawSqaure(w+size/3,h+size/3,g,n,size/3);
    }

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