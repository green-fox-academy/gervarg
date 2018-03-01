import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveSquares {
  static int LIMIT = 10;
  public static void mainDraw(Graphics graphics){

    int size = WIDTH/3;
    int x = size;
    int y = size;
    int n = 0;
    recurseDrawSqaure(x,y,graphics, n,size);
    graphics.drawRect(0,0,WIDTH,HEIGHT);

  }

  private static void recurseDrawSqaure(int w, int h, Graphics g, int n, int size){
    if ( n == LIMIT ) {
      return;
    } else {
      n++;

      g.drawRect(w,h-size,size,size);
      recurseDrawSqaure(w+size/3,h-size+size/3,g,n,size/3);
      g.drawRect(w-size,h,size,size);
      recurseDrawSqaure(w-size+size/3,h+size/3,g,n,size/3);
      g.drawRect(w+size,h,size,size);
      recurseDrawSqaure(w+size+size/3,h+size/3,g,n,size/3);
      g.drawRect(w,h+size,size,size);
      recurseDrawSqaure(w+size/3,h+size+size/3,g,n,size/3);
    }

  }

  // Don't touch the code below
  static int WIDTH = 486;
  static int HEIGHT = 486;

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