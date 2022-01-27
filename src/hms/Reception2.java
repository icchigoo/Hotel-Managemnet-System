
package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;
import java.util.*;


public class Reception2 extends JFrame implements ActionListener{

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,v14,b15,b16,b17,b18,b19,b20;


    Reception2(){
        
        JLabel l10 = new JLabel("Customer Page");
        l10.setFont(new Font("Tahoma", Font.BOLD, 18));
        l10.setBounds(60, 0, 150, 22);
        
        add(l10);
        
        
        b1 = new JButton("Details for Booking ");
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.white);
        b1.setBounds(10,70,200,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Room ");
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.white);
        b2.setBounds(10,110,200,30);
        b2.addActionListener(this);
        add(b2);

       ;

        b4 = new JButton("All Employes Info ");
        b4.setBackground(Color.LIGHT_GRAY);
        b4.setForeground(Color.white);
        b4.setBounds(10,150,200,30);
        b4.addActionListener(this);
        add(b4);

       

        b6 = new JButton("Manger Info ");
        b6.setBackground(Color.LIGHT_GRAY);
        b6.setForeground(Color.white);
        b6.setBounds(10,190,200,30);
        b6.addActionListener(this);
        add(b6);
        
        b7 = new JButton("Cancel booking");
        b7.setBackground(Color.LIGHT_GRAY);
        b7.setForeground(Color.white);
        b7.setBounds(10,230,200,30);
        b7.addActionListener(this);
        add(b7);

       

       


        b10 = new JButton("Pickup Service ");
        b10.setBackground(Color.LIGHT_GRAY);
        b10.setForeground(Color.white);
        b10.setBounds(10,270,200,30);
        b10.addActionListener(this);
        add(b10);

        b11 = new JButton("Air Services");
        b11.setBackground(Color.LIGHT_GRAY);
        b11.setForeground(Color.white);
        b11.setBounds(10,310,200,30);
        b11.addActionListener(this);
        add(b11);

        b12 = new JButton("Billing ");
        b12.setBackground(Color.LIGHT_GRAY);
        b12.setForeground(Color.white);
        b12.setBounds(10,350,200,30);
        b12.addActionListener(this);        
        add(b12);
        
        b13 = new JButton("Logout");
        b13.setBackground(Color.LIGHT_GRAY);
        b13.setForeground(Color.white);
        b13.setBounds(10,390,200,30);
        b13.addActionListener(this);        
        add(b13);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/rec.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l15 = new JLabel(i2);
        l15.setBounds(280,50,460,370);
        add(l15);


        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(500,200,800,565);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1){
            new Customer2().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b2){
        new Roominfo2().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b3){
         new Department().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b4){
        new Empinfo2().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b5){
        new Customerinfo().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b6){
       new Managerinfo2().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b7){
         new Checkout2().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b8){
         new Check().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b9){
        new UpdateRoom().setVisible(true);
        this.setVisible(false);
      
    }else if(ae.getSource() ==b10){
        new Pickup2().setVisible(true);
        this.setVisible(false);

        
    }else if(ae.getSource() ==b11){
        new Airservices2().setVisible(true);
        this.setVisible(false);
        
    }else if(ae.getSource() ==b13){
       setVisible(false);
        
    }else if(ae.getSource() ==b12){
        new Billing().setVisible(true);
        
                }
    }
    public static void main(String[]args){
        new Reception2().setVisible(true);
    }




}

