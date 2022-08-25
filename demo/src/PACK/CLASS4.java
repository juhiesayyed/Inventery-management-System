package PACK;
import java.awt.FlowLayout;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import static java.awt.Component.LEFT_ALIGNMENT;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


     
     public class CLASS4 
     {
        public static void main(String args[]) throws IOException
	{
            Display disp  =new Display();
            // final Component printIt = new Display();
            
        }

      }
    
	class Display extends JFrame
        {
             JTextArea jt;
             JButton btn1,btn2,back;
             JLabel label;
             Container c;
             JFrame frame1;
	        public Display(){
                   
                   
                 jt=new JTextArea();
                 jt.setBounds(30,30,820,600);
                 Font font1 = new Font("Times New Roman",Font.BOLD,20);
                 jt.setFont(font1);
                 //jt.setBorder((Border) Color.BLACK);
                setSize(900,700);
                setVisible(true);
                setLayout(null);//new FlowLayout()
                setBackground(Color.GRAY);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frame1 =new JFrame();
                
                
                
                
                
                btn1 = new JButton("Print");
                Font font = new Font("Times New Roman",Font.BOLD,30);
                btn1.setFont(font);
                btn1.setSize(150, 50);
                btn1.setLocation(350,500);
                btn1.setBackground(Color.PINK);
                btn1.setForeground(Color.BLUE);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                btn1.setCursor(cur);
                btn1.setBackground(Color.WHITE);
                
                back = new JButton("Back");
                Font f = new Font("Times New Roman",Font.BOLD,30);
                back.setFont(f);
                back.setSize(150, 50);
                back.setLocation(180,500);
                back.setBackground(Color.PINK);
                back.setForeground(Color.BLUE);
                Cursor curr = new Cursor(Cursor.HAND_CURSOR);
                back.setCursor(curr);
                back.setBackground(Color.WHITE);
                
                 Font font3= new Font("Times New Roman",Font.BOLD,30);
                 btn2=new JButton("DISPLAY ITEMS LIST");
                 btn2.setSize(350, 50);
                 btn2.setLocation(250,20);
                 btn2.setFont(font3);
                 btn2.setBackground(Color.LIGHT_GRAY);
                 btn2.setForeground(Color.BLUE);
                
                 
                jt.setBackground(Color.WHITE);
                add(jt);
                jt.add(btn1);
                jt.add(back);
                jt.add(btn2);
         
                
                //btn1setVisible(true);
                //f.show();
                try {FileReader reader = new FileReader("C:\\Users\\Juhie\\Documents\\JavaIT\\JuhiePractical\\practical\\swing\\demo\\inventory.txt");
                BufferedReader br= new BufferedReader(reader);
                jt.read(br,null );
                br.close();
                jt.requestFocus();
               
                 }catch(Exception e){}
                
            
                btn1.addActionListener(new ActionListener()
        {
                  
            public void actionPerformed(ActionEvent e)
                    {
                        if(e.getSource()==btn1)
                            {
                               try {
                                   boolean complete = jt.print();
                                   if(complete)
                                   {
                                   JOptionPane.showMessageDialog(null,"Done printing","Information",JOptionPane.INFORMATION_MESSAGE);
                                   }
                                   else
                                   {
                                   JOptionPane.showMessageDialog(null,"printing!","printer",JOptionPane.ERROR_MESSAGE);
                                   }
                               } catch (PrinterException ei)
                               {
                               JOptionPane.showMessageDialog(null, ei);
                               }
                            }
                    }
        });
                 back.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
                    {
                        if(e.getSource()==back)
                            {
                               X d= new X();
                               dispose();
                            }
                    }
        });
                
                
   
        }

   
        
}
