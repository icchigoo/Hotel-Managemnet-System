package HMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employess extends JFrame implements ActionListener {
    JTextField txt1, txt2, txt3,txt4, txt5, txt6, txt7;
    JRadioButton r1, r2;
    JComboBox cm1;
    JButton btn1;

    Employess(){
        JLabel name = new JLabel("Name");
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

        JLabel age = new JLabel("Age");
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

        JLabel JOB = new JLabel("JOB");
        JOB .setFont(new Font("Tahoma", Font.PLAIN, 17));
        JOB.setBounds(60,220,120,30);
        add(JOB);

        String str[] ={"Manager","Front desk","Room service","Kitchen staff","Waiter","Accountent","Chief","Guards"};
        cm1 = new JComboBox(str);
        cm1.setBackground(Color.white);
        cm1.setBounds(185,220,150,30);
        add(cm1);

        JLabel Salary = new JLabel("Salary");
        Salary .setFont(new Font("Tahoma", Font.PLAIN, 17));
        Salary.setBounds(60,270,120,30);
        add(Salary);

        txt4 = new JTextField();
        txt4.setBounds(185,270,150,30);
        add(txt4);

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

        btn1 = new JButton("Done");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.white);
        btn1.setBounds(185,470,150,30);
        btn1.addActionListener(this);
        add(btn1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/beby.jpg"));
       // Image i2 = i1.getImage().getScaledInstance();
       // Image i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i1);
        lbl1.setBounds(400,50,300,450);
        add(lbl1);


        JLabel lbl3 = new JLabel("ADD EMPLOYES DETAILS ");
        lbl3.setForeground(Color.blue);
        lbl3 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl3.setBounds(460,10,300,30);
        add(lbl3);

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(400,160,800,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
     String name = txt1.getText();
        String country = txt2.getText();
        String age = txt3.getText();
        String salary  = txt4.getText();
        String phone = txt5.getText();
        String citizenship = txt6.getText();
        String email = txt7.getText();

        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }

        String job=(String) cm1.getSelectedItem();
        conn c = new conn();
        String str = "insert into Employess values('"+name+"','"+country+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+citizenship+"','"+email+"')";


        
        try{
           
             c.s.executeUpdate(str);
         JOptionPane.showMessageDialog(null,"Employee Added");
         setVisible(false);
           
        }
        catch (Exception a) {
                        a.printStackTrace();
        	    }
            
        
            new Homepage1().setVisible(true);
            this.setVisible(false);


        }

    public static void main(String[]args){
        new Employess();
    }
}
