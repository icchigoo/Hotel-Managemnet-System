package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

// joining class with JFrame
public class Login3 extends JFrame implements ActionListener{ //implements ActionListener {


    // better to declare variable outside the constructor as it can be access globally.
    //creating constructor
    JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
    JPasswordField txt2;
    JButton btn1, btn2;
    JCheckBox ch1;
    JTextField txt1;
    Login3(){

        setBounds(350,180,800,500);
        setLayout(null);



       // importing images
       // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/123.jpg"));
       // JLabel lbl1 = new JLabel(i1);
        //lbl1= new JLabel(i1);
       // lbl1.setBounds(0,0,1400,880);
       // add(lbl1);

        lbl2 = new JLabel("UserName");
        lbl2.setBounds(50,120,150,30);
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(new Font("serief",Font.ITALIC,25));
        //lbl1.add(lbl2);
        add(lbl2);

        txt1 = new JTextField();
        txt1.setBounds(200,120,220,30);
        txt1.setBackground(Color.WHITE);
    //    txt1.setFont(new Font("serief",Font.ITALIC,25));
      //  lbl1.add(txt1);
      add(txt1);

        lbl3 = new JLabel("Password");
        lbl3.setBounds(50,160,150,30);
        lbl3.setForeground(Color.BLACK);
        lbl3.setFont(new Font("serief",Font.ITALIC,25));
      //  lbl1.add(lbl3);
      add(lbl3);
        

        txt2 = new JPasswordField();
        txt2.setBounds(200,160,220,30);
        txt2.setBackground(Color.WHITE);
    //    txt2.setFont(new Font("serief",Font.ITALIC,25));
        
       // lbl1.add(txt2);
        add(txt2);

        JCheckBox ch1 =  new JCheckBox("Show Password");
        ch1.setBounds(200,200,150,30);
       ch1.setBackground(Color.WHITE);
       ch1.addActionListener(this);
     //   ch1.setFont(new Font("serief",Font.ITALIC,25));
//        lbl1.add(ch1);
         add(ch1);
         
         
         
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/Key1.jpg"));
       Image i2 = i1.getImage().getScaledInstance(18,18,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        lbl4 = new JLabel(i3);
         lbl4.setBounds(27,125,20,20);
       add(lbl4);
       
       
       
        ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/lock.png"));
       Image i10 = i9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
       ImageIcon i11 = new ImageIcon(i10);
        lbl5 = new JLabel(i11);
         lbl5.setBounds(27,165,23,23);
       add(lbl5);

        btn1 = new JButton("Login");
        btn1.setBounds(80,300,120,30);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.addActionListener(this);
         //lbl1.add(btn1);
         add(btn1);
  

        btn2 = new JButton("Cancel");
        btn2.setBounds(230,300,120,30);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.addActionListener(this);
        //lbl1.add(btn2);
        add(btn2);
        

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/User2.jpg"));
          Image i14 = i5.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
       ImageIcon i16 = new ImageIcon(i14);
        // this is image is not compelete i will edit it from photoshop
        JLabel lbl20 = new JLabel(i16);
        lbl20.setBounds(450,28,300,400);
        //lbl1.add(lbl4);
        add(lbl20);

        setVisible(true);
        getContentPane().setBackground(Color.white);
    }
        
          public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn1){
        try{
            conn c1 = new conn();
            String username = txt1.getText();
            String password = txt2.getText();
            
            String q = "select * from regsiter2 where username='"+username+"' and password='"+password+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){ 
                new Homepage3().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login not registered");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==btn2){
            System.exit(0);
        }else if(ae.getSource()==ch1){
             if (ch1.isSelected()) {
                
               txt2.setEchoChar((char)0);
            }else {
                
                txt2.setEchoChar('*');
            }
            
        }
    }

    
    public static void main (String[]args){
        new  Login3();
    }
}
