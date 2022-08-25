/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PACK;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 class print {

  static class MyComponent extends JPanel {
    Random random = new Random();
  public void paint(Graphics g) {
      Polygon convex, concave, selfintersecting;
      convex = new Polygon();
      convex.addPoint(20, 20);

      concave = new Polygon();
      concave.addPoint(100 + 20, 20);
      concave.addPoint(100 + 60, 24);

      selfintersecting = new Polygon();

      for (int i = 0; i < 8; i++) {
        selfintersecting.addPoint(200 + random.nextInt(80), 20 + random
            .nextInt(80));
      }
g.fillPolygon(convex);
      g.drawPolygon(concave);
      g.fillPolygon(selfintersecting);
    }
  }

  public static void main(String args[]) {
    final JFrame frame = new JFrame("Printing 1.1");

    Container contentPane = frame.getContentPane();

    final Component printIt = new MyComponent();
    contentPane.add(printIt, BorderLayout.CENTER);
JButton button = new JButton("Print");
    contentPane.add(button, BorderLayout.SOUTH);

    ActionListener listener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Toolkit def = Toolkit.getDefaultToolkit();
        PrintJob job = def.getPrintJob(frame, "Print Job", null);
        if (job != null) {
          Graphics pg = job.getGraphics();
          printIt.print(pg);
          pg.dispose();
          job.end();
        }
      }
    };
    button.addActionListener(listener);

    frame.setSize(300, 200);
    frame.show();
  }
}
 /*private Container ContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBorder(Color BLACK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/