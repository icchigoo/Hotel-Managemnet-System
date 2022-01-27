
package HMS;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Room2 extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4, t5;
    private JComboBox comboBox, comboBox_1,comboBox_2;
    JButton b1,b2;
    Choice c1;




    public Room2() {
        setBounds(450, 250, 900, 500);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/bed3.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l15 = new JLabel(i2);
        l15.setBounds(400,30,460,370);
        add(l15);

        JLabel l10 = new JLabel("ADD ROOM FOR CLIENTS");
        l10.setFont(new Font("Tahoma", Font.BOLD, 18));
        l10.setBounds(150, 10, 250, 22);
        contentPane.add(l10);



        JLabel l1 = new JLabel("Room Number");
        l1.setForeground(new Color(25, 25, 112));
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(64, 70, 102, 30);
        contentPane.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(174, 70, 156, 30);
        contentPane.add(t1);
        
      
        JLabel l2 = new JLabel("Available");
        l2.setForeground(new Color(25, 25, 112));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(64, 110, 102, 30);
        contentPane.add(l2);
        
        comboBox = new JComboBox(new String[] { "Available", "Occupied"});
        comboBox.setBounds(176, 110, 154, 30);
        contentPane.add(comboBox);
        
       
        


       

        JLabel l3 = new JLabel("Cleaning status");
        l3.setForeground(new Color(25, 25, 112));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(64, 150, 102, 30);
        contentPane.add(l3);
        
        comboBox_1 = new JComboBox(new String[] { "Cleaned", "Cleaning"});
        comboBox_1.setBounds(176, 150, 154, 30);
        contentPane.add(comboBox_1);

     

        JLabel l4 = new JLabel("Price");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(64, 190, 102, 30);
        contentPane.add(l4);

        t2 = new JTextField();
        t2.setBounds(174, 190, 156, 30);
        contentPane.add(t2);

        JLabel l5 = new JLabel("Bed type");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(64, 230, 102, 30);
        contentPane.add(l5);
        
        comboBox_2 = new JComboBox(new String[] { "Single ", "Double"});
        comboBox_2.setBounds(176, 230, 154, 30);
        contentPane.add(comboBox_2);

     
     


        b1 = new JButton("Add");
        b1.addActionListener(this);
        b1.setBounds(64, 340, 111, 33);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setBounds(198, 340, 111, 33);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);


        contentPane.setBackground(Color.WHITE);

    }

    public void actionPerformed(ActionEvent ae){
        try{

            if(ae.getSource() == b1){
                try{
                    conn c = new conn();
                    String room = t1.getText();
                    String available = (String)comboBox.getSelectedItem();
                    String status = (String)comboBox_1.getSelectedItem();
                    String price = t2.getText();
                    String type = (String)comboBox_2.getSelectedItem();
                    
                   
                    
                    String str = "INSERT INTO room2 values( '"+room+"', '"+available+"', '"+status+"','"+price+"', '"+type+"')";


                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Room Successfully Added");
                    this.setVisible(false);

                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                new Homepage().setVisible(true);
                this.setVisible(false);
            }
        }catch(Exception eee){

        }
    }
    public static void main(String[] args) {
        new Room2().setVisible(true);
    }
} 