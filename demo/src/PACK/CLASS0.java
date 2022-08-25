/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PACK;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;

public class CLASS0 extends JFrame{
    JLabel label;
      public CLASS0() {
           
          displayWelcomeScreen();
          //setVisible(true);
          setSize(900,800);
          //setBackground(Color.grey);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          Font font = new Font("Times New Roman",Font.BOLD,30);
          label = new JLabel("Welcome to Inventory Management System.....");
          
          label.setHorizontalAlignment(SwingConstants.CENTER);
          label.setFont(font);
          add(label);
          label.setBackground(Color.pink);
          label.setForeground(Color.blue);
         label.addMouseListener(new MouseAdapter()//ListenerImpl
         {
             @Override 
          public void mouseClicked(MouseEvent e)
            {
               X f=new X();
                dispose();
            }
         
         });
         
      }
      
      public static void main(String args[]){
          new CLASS0();
      }

       private void displayWelcomeScreen(){

       JWindow w =new JWindow(this);
       w.setSize(900,500);
       w.setLocationRelativeTo(null);
       w.setVisible(true);

       JPanel panel = new JPanel();
       w.add(panel);
       String imagePath="C:\\Users\\Juhie\\Documents\\JavaIT\\JuhiePractical\\practical\\swing\\demo\\images\\welcome.jpg";
       //JLabel lebel= new JLabel(new ImageIcon(imagePath));
       //label.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel label3 = new JLabel(new ImageIcon(imagePath));
        label3.setHorizontalAlignment(SwingConstants.CENTER);

       //lebel.setText("Loading.....Please wait!");

       panel.add(label3);
       panel.setBackground(Color.white);
       panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

       JLabel label1= new JLabel("Loading........Please wait!");
       label1.setFont(new Font("Verdana", Font.BOLD, 14));
       panel.add(label1);

       JProgressBar progress = new JProgressBar(0,100);
       progress.setForeground(Color.blue);
       w.add(BorderLayout.PAGE_END,progress);


       w.revalidate();
       
     
       timer = new Timer(100,new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e)  {
            int x=progress.getValue();
            if(x==100){
               w.dispose();
               CLASS0.this.setVisible(true);
               timer.stop();
             } else{
                  progress.setValue(x+2);

               }
       
           }
        });

        timer.start();

     }
    Timer timer;

    
}
