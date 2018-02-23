import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise_04_Triangles {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    triangles(graphics);




  }
  public static void triangles(Graphics graphics) {
    int Xoldal = 10;
    int Yoldal = 17;//(int) Math.sqrt(3)*Xoldal;
    int[] xPoints = {WIDTH/2, WIDTH/2-Xoldal,WIDTH/2+Xoldal};
    int[] yPoints = {0,Yoldal, Yoldal};

    for (int rows = 0; rows < 30 ; rows++) {
      for (int i = 0; i < 3; i++) {
        xPoints[i] = xPoints[i]-Xoldal;
      }
      for (int j = 0; j < 3 ; j++) {
        yPoints[j] = yPoints[j]+Yoldal;
      }
      graphics.drawPolygon(xPoints,yPoints,3);
      for (int k = 0; k < rows; k++) {
        for (int l = 0; l < 3 ; l++) {
          xPoints[l] = xPoints[l]+2*Xoldal;
        }
        for (int m = 0; m < rows; m++) {
          graphics.drawPolygon(xPoints,yPoints,3);
        }
      }
      for (int n = 0; n < 3 ; n++) {
        xPoints[n] = xPoints[n] - 2*Xoldal*rows;

      }


    }


   /* for (int i = 0; i < WIDTH/2; i+= 10) {

    }*/
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
    }
  }
}