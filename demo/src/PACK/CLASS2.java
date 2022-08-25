
package PACK;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class CLASS2
{
    public static void main(String[] args)
	{
    ADDING a = new ADDING ();
        }
}

 class ADDING extends JFrame
{
        JLabel l1,l2,l3,l4,img1;
	JTextField t1,t2;
	JButton b1,back;
        JPanel p1;
         //setTitle("adding item in cart");
        public ADDING()
        {
        l1=new JLabel("");//ADDING ITEM IN CART
        //lable="Inventory"
        l1.setForeground(Color.RED); 
        l1.setBounds(240,150,500,90);//300.65
        l1.setFont(l1.getFont().deriveFont(32.0f));
        
        //gray pannel
         p1=new JPanel();
         p1.setBounds(80,150,600,470);    
         p1.setBackground(Color.gray);
         
         //name of item
	l2=new JLabel("Name of Item:");
        l2.setBounds(190,300,150,20);
        l2.setForeground(Color.WHITE);
        l2.setFont(l2.getFont().deriveFont(22.0f));
        
        //text field for name of item
        t1=new JTextField();
        t1.setBounds(350,300,200,30);
        t1.setForeground(Color.black);
        t1.setFont(l1.getFont().deriveFont(16.0f));
        
        //quntity label
	l3=new JLabel("Quantity: ");
        l3.setBounds(190,400,100,20);
        l3.setForeground(Color.WHITE);
        l3.setFont(l3.getFont().deriveFont(22.0f));
        
        //text field for quntity
        t2=new JTextField(600);
        t2.setBounds(350,400,200,30);
        t2.setForeground(Color.black);
        t2.setFont(l1.getFont().deriveFont(16.0f));
	
        //add button
	b1=new JButton("Add");
	b1.setBounds(300,500,120,50);
        b1.setBackground(Color.pink); 
        b1.setForeground(Color.WHITE);
        b1.setFont(b1.getFont().deriveFont(25.0f));
        
	//back button
	back =new JButton("back");
        back.setBounds(20,100,120,30);
        back.setBackground(Color.gray); 
        back.setForeground(Color.WHITE);
        back.setFont(back.getFont().deriveFont(20.0f));
        
         //inserting image 
        img1 = new JLabel(new ImageIcon("C:\\Users\\Juhie\\Documents\\JavaIT\\JuhiePractical\\practical\\swing\\demo\\images\\cart1.jpg"));  
        img1.setBounds(300,90,500,150);//150
        
        
        //jframe set
        setSize(800,900);
	setVisible(true);
        setLayout(null);//new FlowLayout()
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding component is sequence mai rehnai dai na
        add(l2);
        add(l1);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(img1);//cart1.jpg
        add(p1);
        add(back);//add(l4);
        
        
       
        
	b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
                    {
                        String file= "inventory.txt";
                        if(e.getSource()==b1)
                            {
                                try{
                                FileWriter fileWriter=new FileWriter(file, true);
                                t1.write(fileWriter);
                                fileWriter.write("\t");
                                t2.write(fileWriter);
                                fileWriter.write("\n");
                                fileWriter.close();
                                }catch(Exception em){}
                                
                                t1.setText(null);
                                t2.setText(null);
                            }
                    }
        });
        
        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
                    {
                        if(e.getSource()==back)
                            {
                                new X();
                                dispose();
                            }
                    }
        });
        
        
        }
	
	}
