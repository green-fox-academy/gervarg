import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky {
  static int LIMIT = 5;
  public static void mainDraw(Graphics graphics){

    int size = WIDTH/4;
    int x = WIDTH/2-size/2;
    int y = HEIGHT/2-size/2;
    int n = 0;
    sierpinsky(x,y,graphics, n,size);
    graphics.fillRect(x,y,size,size);

  }

  private static void sierpinsky(int x, int y, Graphics g, int n, int size){
    if ( n == LIMIT ) {
      return;
    } else {
      n++;
      size /= 3;

      g.fillRect(x-2*size,y-2*size,size,size);
      sierpinsky(x-2*size,y-2*size,g,n,size);
      g.fillRect(x-2*size,y+size,size,size);
      sierpinsky(x-2*size,y+size,g,n,size);
      g.fillRect(x+size,y-2*size,size,size);
      sierpinsky(x+size,y-2*size,g,n,size);

    }

  }

  // Don't touch the code below
  static int WIDTH = 666;
  static int HEIGHT = 666;

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
      //setBackground(Color.yellow);
    }
  }
}