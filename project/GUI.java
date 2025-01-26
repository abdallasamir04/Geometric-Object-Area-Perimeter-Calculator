package oop.project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame {
    JPanel pan;
    JLabel ms1 ,ms2 , ms3 ,ms4 , ms5 , tx3 ,tx4;
    JComboBox box1;
    String [] ar = {"Rectangle","Square","Circle"};
    JButton but1,but2;
    JTextField tx1,tx2;
    GridLayout gl1 ;
    public GUI()
    {
        setTitle("Project 2024 FCI Assuit");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ms1 = new JLabel ("Select your shape : ");
        box1 = new JComboBox(ar);
        box1.addActionListener(new change_shape ());
        ms2 = new JLabel ("Enter the length of the Rectangle :"); 
        tx1 = new JTextField (5);
        ms3 = new JLabel ("Enter the width of the Rectangle :"); 
        tx2 = new JTextField (5);
        
        but1 = new JButton("Display");
        but1.setForeground(Color.red);
        but1.addActionListener(new calc());
        but2 = new JButton("Reset");
        but2.setForeground(Color.red);        
        but2.addActionListener(new reset());
        
        
        // read only
        ms4 = new JLabel ("Area :"); 
        tx3 = new JLabel ();
        ms5 = new JLabel ("Perimeter :"); 
        tx4 = new JLabel ();
        
        
        // create panel
        pan = new JPanel ();
        gl1 = new GridLayout(6,2);
        pan.setLayout(gl1);
        // add control to panel
        pan.add(ms1);
        pan.add(box1);
        pan.add(ms2);
        pan.add(tx1);
        pan.add(ms3);
        pan.add(tx2);
        pan.add(but1);
        pan.add(but2);
        pan.add(ms4);
        pan.add(tx3);
        pan.add(ms5);
        pan.add(tx4);
        
        //pan.setBackground(Color.black);
        pan.setForeground(Color.cyan);
        // add panel to frame
        add(pan);
        pack();
        setVisible (true);
    }
    class change_shape implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (box1.getSelectedIndex() == 0)
            {
                ms2.setText("Enter the length of the Rectangle");
                ms3.setVisible(true);
                tx2.setVisible(true);
            }
            else if (box1.getSelectedIndex() == 1)
            {
                ms2.setText("Enter the length of the Square");
                ms3.setVisible(false);
                tx2.setVisible(false);
            }
            
            else if (box1.getSelectedIndex() == 2)
            {
                ms2.setText("Enter the radius of the Circle");
                ms3.setVisible(false);
                tx2.setVisible(false);
            }
            
    
        }       
    }
    class calc implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (box1.getSelectedIndex() == 0)
            {
                try
                {
               double len = Double.parseDouble(tx1.getText());
               double wid = Double.parseDouble(tx2.getText());
               if(len <= 0 || wid <= 0) throw new Exception() ;
               Rectangle r1 = new Rectangle(len , wid);
               tx3.setText(r1.getArea()+"");
               tx4.setText(r1.getPer()+"");
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null, "Enter Positive numiric Data");
                }
            }
            else if (box1.getSelectedIndex() == 1)
            {
                try
                {
                double side = Double.parseDouble(tx1.getText());
                if(side <= 0) throw new Exception();
                square s1 = new square(side);
                tx3.setText(s1.getArea()+"");
                tx4.setText(s1.getPer()+"");
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null, "Enter Positive numiric Data");
                }
            }
                else if (box1.getSelectedIndex() == 2)
            {
                try
                {
                double radius = Double.parseDouble(tx1.getText());
                if(radius <= 0 ) throw new Exception();
                Circle c1 = new Circle(radius);
                tx3.setText(c1.getArea()+"");
                tx4.setText(c1.getPer()+"");
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null, "Enter Positive numiric Data");
                }     
        
            }        
            
            
        }
        
    }
        class reset implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");
            tx4.setText("");       
        }
            
      }

}