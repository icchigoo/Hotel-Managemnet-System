
package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Checkout4 extends JFrame implements ActionListener{
    Choice c1;
    JTextField t1;
    JButton b1,b2,b3;
    Checkout4(){
        JLabel l1 = new JLabel("Cancel Booking");
        l1.setBounds(30,20,160,30);
         l1.setFont(new Font("Tahoma",Font.PLAIN,22));
        l1.setForeground(Color.BLUE);
        add(l1);






        JLabel l2 = new JLabel("Customer ID");
        l2.setBounds(30,80,100,30);
        add(l2);

        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer3");
            while (rs.next()){
                c1.add(rs.getString("number"));
            }

        }catch (Exception e){

        }

        c1.setBounds(160,80,140,40);
        add(c1);

        JLabel l3 = new JLabel("Foom Number");
        l3.setBounds(30,130,100,30);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(160,130,140,27);
        add(t1);
        
        
        b1 = new JButton("Cancel booking");
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.white);
        b1.setBounds(25,190,130,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.white);
        b2.setBounds(180,190,130,30);
        b2.addActionListener(this);
        add(b2);
        
        
        getContentPane().setBackground(Color.white);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/tick.png"));
       Image i2 = i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        b3 = new JButton(i3);
        b3.addActionListener(this);
       b3.setBounds(310,80,20,20);
       add(b3);
       
       
      


        setLayout(null);
    setBounds(500,200,1000,330);
    setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String id = c1.getSelectedItem();
            String room =t1.getText();
            String str = "delete from customer3 where number ='"+id+"'";
            String str2 = "update room set available ='available' where room ='"+room+"'";
            conn c = new conn();
            try{
                c.s.executeUpdate(str);
                c.s.executeUpdate(str2);
                JOptionPane.showMessageDialog(null,"Your Room Was Success fully Canceled");
                new Reception3().setVisible(true);
                this.setVisible(false);
                
            }catch(Exception e){}
            
            
        }else if(ae.getSource()==b2){
            new Reception4().setVisible(true);
            this.setVisible(false);
            
        }else if(ae.getSource()==b3){
            conn c = new conn();
            String id =c1.getSelectedItem();
            try{
            ResultSet rs =c.s.executeQuery("select * from customer3 where number = '"+id+"'");
            while(rs.next()){
                t1.setText(rs.getString("room"));
            }
            }catch(Exception e){}
            
        }
        
    }
    public static void main(String[]args){
        new Checkout4().setVisible(true);
    }

}
