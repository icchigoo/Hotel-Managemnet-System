package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Customer4 extends JFrame implements ActionListener {

JTextField t1,t2,t3,t4,t5;
JButton b1,b2;
JComboBox c1;
Choice c2;
JRadioButton r1,r2;
Customer4(){
    JLabel l1 = new JLabel("New Booking Form ");
    l1.setForeground(Color.BLUE);
    l1.setBounds(100,20,600,30);
    l1.setFont(new Font("Tahoma",Font.BOLD,25));
    add(l1);

    JLabel l2 = new JLabel("ID");
    l2.setBounds(35,70,120,30);
    add(l2);

    String str[] ={"Passport","Voter-id card","Driving License","Citizen Ship"};
    c1 = new JComboBox(str);
    c1.setBackground(Color.white);
    c1.setBounds(145,70,150,30);
    add(c1);

    JLabel l3 = new JLabel("Number");
    l3.setBounds(35,110,120,30);
    add(l3);

    t1 = new JTextField();
    t1.setBounds(145,110,150,30);
    add(t1);


    JLabel l4 = new JLabel("Name");
    l4.setBounds(35,150,120,30);
    add(l4);

    t2 = new JTextField();
    t2.setBounds(145,150,150,30);
    add(t2);

    JLabel l5 = new JLabel("Gender");
    l5.setBounds(35,190,120,30);
    add(l5);

    r1 = new JRadioButton("Male");
    r1.setBounds(145,190,70,30);
    r1.setBackground(Color.white);
    r1.setFont(new Font("Tahoma", Font.PLAIN, 17));
    add(r1);

    r2 = new JRadioButton("Female");
    r2.setBounds(230,190,90,30);
    r2.setBackground(Color.white);
    r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
    add(r2);


    JLabel l6 = new JLabel("Country");
    l6.setBounds(35,230,120,30);
    add(l6);

    t3 = new JTextField();
    t3.setBounds(145,230,150,30);
    add(t3);

    JLabel l7 = new JLabel("Room no ");
    l7.setBounds(35,270,100,30);
    add(l7);
    
   
  c2 = new Choice();
    try{
        conn c = new conn();
        String strb ="Select * from room2";
        ResultSet rs = c.s.executeQuery(strb);
        while(rs.next()){
            c2.add(rs.getString("room"));
        }
               
        
    }catch(Exception e){
        
    }
    c2.setBounds(145,270,120,40);
    add(c2);
    
    

    JLabel l8 = new JLabel("Check In");
    l8.setBounds(35,310,120,30);
    add(l8);
    
    
    t4 = new JTextField();
    t4.setBounds(145,310,150,30);
    add(t4);

    JLabel l9 = new JLabel("Deposit");
    l9.setBounds(35,360,120,30);
    add(l9);
    
    t5 = new JTextField();
    t5.setBounds(145,360,150,30);
    add(t5);

    getContentPane().setBackground(Color.white);
    setLayout(null);
    setBounds(500,200,900,600);
    
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/Customer2.jpg"));
       // Image i2 = i1.getImage().getScaledInstance();
       // Image i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i1);
        lbl1.setBounds(360,50,500,470);
        add(lbl1);

    
    
      b1 = new JButton("Book Now");
      b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(25,430,120,30);
       
        add(b1);

       
      b2 = new JButton("Back");
       b2.addActionListener(this);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(170,430,120,30);
        b2.addActionListener(this);
        add(b2);

}public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String id = (String) c1.getSelectedItem();
    String number = t1.getText();
    String name = t2.getText();
    String gender = null;
            if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
    String country =t3.getText();
    String room = c2.getSelectedItem();
    String status =t4.getText();
    String deposit = t5.getText();
   
        conn c = new conn();
       String str = "insert into Customer3 values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+status+"','"+deposit+"')";
       String str2 ="update room set available = 'Occupied' where room = '"+room+"'";


        
        try{
           
             c.s.executeUpdate(str);
             c.s.executeUpdate(str2);
         JOptionPane.showMessageDialog(null,"Customer added");
         setVisible(false);
           
        }
        catch (Exception a) {
                        a.printStackTrace();
        	    }
            
        
            new Reception4().setVisible(true);
            this.setVisible(false);

        } if(e.getSource()==b1){
            new Reception4().setVisible(true);
            this.setVisible(false);
            
        } else if(e.getSource() == b2){
                new Reception4().setVisible(true);
                this.setVisible(false);
        
      
    }
}


public static void main(String[]args){
    new Customer4().setVisible(true);
}
}
