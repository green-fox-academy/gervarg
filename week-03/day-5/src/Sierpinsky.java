import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky {
  static int LIMIT = 7;
  static int ITERATOR = 0;
  public static void mainDraw(Graphics graphics){

    int size = WIDTH/3;
    int x = WIDTH/2-size/2;
    int y = HEIGHT/2-size/2;
    int n = 0;
    int iterator = 0;
    sierpinsky(x,y,graphics, n,size, iterator);
    graphics.fillRect(x,y,size,size);

  }
  private static Color getRandomColor() {
    Random random = new Random();
    int r = random.nextInt(256);
    int g = random.nextInt(256);
    int b = random.nextInt(256);
    return new Color(r, g, b);

  }

  private static void sierpinsky(int x, int y, Graphics g, int n, int size, int iterator){
    //g.setColor(getRandomColor());
    g.fillRect(x,y,size,size);
    if ( n == LIMIT ) {
      return;
    } else if (iterator < ITERATOR) {
      n++;
      size /= 3;
      //top left
      sierpinsky(x-2*size,y-2*size,g,n,size, iterator+5);
      //left
      sierpinsky(x-2*size,y+size,g,n,size, iterator+10);
      //top mid
      sierpinsky(x+size,y-2*size,g,n,size,iterator+5);
      //right
      sierpinsky(x+4*size,y+size,g,n,size,iterator+10);
      //bottom right
      sierpinsky(x+4*size,y+4*size,g,n,size,iterator+15);
      //bottom mid
      sierpinsky(x+size,y+4*size,g,n,size,iterator+10);
      //bottom left
      sierpinsky(x-2*size,y+4*size,g,n,size, iterator+15);
      //top right
      sierpinsky(x+4*size,y-2*size,g,n,size,iterator+5);




    }

  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("Drawing");
    ImagePanel imagePanel = new ImagePanel();
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    while(true) {
      imagePanel.repaint();
      ITERATOR++;
      Thread.sleep(300);

    }
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