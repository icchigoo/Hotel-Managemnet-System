package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register2 extends JFrame implements ActionListener {
    JTextField txt1, txt2, txt3,txt4, txt5, txt6, txt7,txt8;
    JRadioButton r1, r2;
    JComboBox cm1;
    JButton btn1,btn2;

    Register2(){
        JLabel name = new JLabel("Contact person");
        name .setFont(new Font("Tahoma", Font.PLAIN, 17));
        name.setBounds(60,20,120,30);
        add(name);

        txt1 = new JTextField();
        txt1.setBounds(185,20,150,30);
        add(txt1);

        JLabel country  = new JLabel("Country");
        country .setFont(new Font("Tahoma", Font.PLAIN, 17));
        country.setBounds(60,70,120,30);
        add(country);

        txt2 = new JTextField();
        txt2.setBounds(185,70,150,30);
        add(txt2);

        JLabel age = new JLabel("Business Name");
        age .setFont(new Font("Tahoma", Font.PLAIN, 17));
        age.setBounds(60,120,120,30);
        add(age);

        txt3 = new JTextField();
        txt3.setBounds(185,120,150,30);
        add(txt3);

        JLabel gender = new JLabel("Gender");
        gender .setFont(new Font("Tahoma", Font.PLAIN, 17));
        gender.setBounds(60,170,120,30);
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setBounds(185,170,70,30);
        r1.setBackground(Color.white);
        r1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(260,170,150,30);
        r2.setBackground(Color.white);
        r2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(r2);

        JLabel Username = new JLabel("Username");
        Username .setFont(new Font("Tahoma", Font.PLAIN, 17));
        Username.setBounds(60,220,120,30);
        add(Username);
        
        txt4 = new JTextField();
        txt4.setBounds(185,220,150,30);
        add(txt4);

        

        JLabel Password = new JLabel("Password");
        Password .setFont(new Font("Tahoma", Font.PLAIN, 17));
        Password.setBounds(60,270,120,30);
        add(Password);
        
        txt8 = new JPasswordField();
        txt8.setBounds(185,270,150,30);
        txt8.setBackground(Color.WHITE);
      //  txt8.setFont(new Font("serief",Font.ITALIC,25));
       // lbl1.add(txt2);
        add(txt8);

       

        JLabel phone = new JLabel("Phone");
        phone .setFont(new Font("Tahoma", Font.PLAIN, 17));
        phone.setBounds(60,320,120,30);
        add(phone);

        txt5 = new JTextField();
        txt5.setBounds(185,320,150,30);
        add(txt5);

        JLabel citizenship = new JLabel("Citizenship");
        citizenship.setFont(new Font("Tahoma", Font.PLAIN, 17));
        citizenship.setBounds(60,370,120,30);
        add(citizenship);

        txt6 = new JTextField();
        txt6.setBounds(185,370,150,30);
        add(txt6);

        JLabel Email = new JLabel("Email");
        Email .setFont(new Font("Tahoma", Font.PLAIN, 17));
        Email.setBounds(60,420,120,30);
        add(Email);

        txt7 = new JTextField();
        txt7.setBounds(185,420,150,30);
        add(txt7);

        btn1 = new JButton("Register");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.white);
        btn1.setBounds(50,470,120,30);
        btn1.addActionListener(this);
        add(btn1);
        
        
        btn2 = new JButton("Back");
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setForeground(Color.white);
        btn2.setBounds(200,470,130,30);
        btn2.addActionListener(this);
        add(btn2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/register1.png"));
       // Image i2 = i1.getImage().getScaledInstance();
       // Image i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i1);
        lbl1.setBounds(400,50,300,450);
        add(lbl1);


        JLabel lbl3 = new JLabel("Register Page for CopeateClient");
        lbl3.setForeground(Color.blue);
        lbl3 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl3.setBounds(430,10,300,30);
        add(lbl3);

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(400,160,800,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
        String person = txt1.getText();
        String country = txt2.getText();
        String business = txt3.getText();
        String username  = txt4.getText();
        String password = txt8.getText();
        String phone = txt5.getText();
        String citizenship = txt6.getText();
        String email = txt7.getText();
        
 
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }

        
        conn c = new conn();
        String str = "insert into regsiter2 values('"+person+"','"+country+"','"+business+"','"+gender+"','"+username+"','"+password+"','"+phone+"','"+citizenship+"','"+email+"')";


        
        try{
           
             c.s.executeUpdate(str);
         JOptionPane.showMessageDialog(null,"Register Success");
         setVisible(false);
           
        }
        catch (Exception a) {
                        a.printStackTrace();
        	    }
            
        
            new Login3().setVisible(true);
            this.setVisible(false);
            
        }else if(e.getSource()==btn2){
             new Register().setVisible(true);
        this.setVisible(false);
        
            
        }

        }

    public static void main(String[]args){
        new Register2();
    }
}
