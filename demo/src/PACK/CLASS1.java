package PACK;

import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;  
import javax.swing.*;


public class CLASS1
{
    public static void main(String[] args)
    {
        X obj = new X();
    }
}

class X extends JFrame{

JLabel l1,img1,img2;
JButton b1,b2,b4;//b1-cart,b2 display,b4 searck
JPanel panel,panel1, panel2;
     

public X() 
    {
        //   setComponents();
       
        
        
        l1 = new JLabel("Invento");
        l1.setForeground(Color.WHITE);  
        b1 = new JButton("CART");
        b1.setBackground(Color.gray); 
        b1.setForeground(Color.WHITE);
        b2 = new JButton("DISPLAY");
        b2.setBackground(Color.gray); 
        b2.setForeground(Color.WHITE);
        b4 = new JButton("Search");
        b4.setBackground(Color.gray); 
        b4.setForeground(Color.WHITE);
         //...........................................................................IMAGE
        img1 = new JLabel(new ImageIcon("C:\\Users\\Juhie\\Documents\\JavaIT\\JuhiePractical\\practical\\swing\\demo\\images\\homepage.png"));  
        img1.setBounds(130,210,250,250);
        img2 = new JLabel(new ImageIcon("C:\\Users\\Juhie\\Documents\\JavaIT\\JuhiePractical\\practical\\swing\\demo\\images\\display.jpg"));  
        img2.setBounds(490,210,250,250);
        //.........................PANEL
        //1
        panel=new JPanel();  
        panel.setBounds(10,30,860,80);    
        panel.setBackground(Color.gray); 
        
        panel1=new JPanel();  
        panel1.setBounds(110,250,300,400);    
        panel1.setBackground(Color.gray);
        //3
        panel2=new JPanel();  
        panel2.setBounds(470,250,300,400);    
        panel2.setBackground(Color.gray);

        //..........................................Set boundary
        l1.setBounds(30,40,300,65);
        l1.setFont(l1.getFont().deriveFont(64.0f));
        //..........................................SEARCH BUTTON
        b4.setBounds(720,70,150,40);
        b4.setFont(b4.getFont().deriveFont(25.0f));

        //............................................CART BUTTON
        b1.setBounds(180,500,150,40);
        b1.setFont(b1.getFont().deriveFont(25.0f));
        //............................................CART BUTTON
        b2.setBounds(550,500,150,40);
        b2.setFont(b2.getFont().deriveFont(25.0f));

        setSize(900,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //.............................Adding stuff so that they can be displayed
       
        
        add(img1);
        add(img2);
        add(l1);
        add(b4);
        add(b1);
        add(b2);
        add(panel);
        add(panel1);
        add(panel2);
        
        
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                new ADDING();
                dispose();
            }
        });
        
        b4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                new CLASS3();
                dispose();
            }
        });
        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                new  Display();
                dispose();
            }
        });
       
        
        
    }
}

   

