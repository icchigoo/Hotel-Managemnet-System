package HMS;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food extends JFrame implements ActionListener {
    JTextField txt1, txt2, txt3,txt4, txt5, txt6;
    JComboBox cm1, cm2, cm3, cm4, cm5, cm6,cm7;
    JButton btn1,btn2,btn3,btn4;

    Food(){
        JLabel birayani = new JLabel("BIRAYANI");
        birayani .setFont(new Font("Tahoma", Font.PLAIN, 17));
        birayani.setBounds(55,50,120,30);
        add(birayani);

        txt1 = new JTextField("");
        txt1.setBounds(185,50,150,30);
        add(txt1);
        
        String str1[] ={"AVAILABLE","NOT AVAILABLE"};
        cm1 = new JComboBox(str1);
        cm1.setBackground(Color.white);
        cm1.setBounds(380,50,150,30);
        add(cm1);

        JLabel kababs  = new JLabel("KABABS");
        kababs .setFont(new Font("Tahoma", Font.PLAIN, 17));
        kababs.setBounds(60,100,120,30);
        add(kababs);

        txt2 = new JTextField();
        txt2.setBounds(185,100,150,30);
        add(txt2);
        
        String str2[] ={"AVAILABLE","NOT AVAILABLE"};
        cm2 = new JComboBox(str2);
        cm2.setBackground(Color.white);
        cm2.setBounds(380,100,150,30);
        add(cm2);

        JLabel breds = new JLabel("BREADS");
        breds .setFont(new Font("Tahoma", Font.PLAIN, 17));
        breds.setBounds(60,150,120,30);
        add(breds);

        txt3 = new JTextField();
        txt3.setBounds(185,150,150,30);
        add(txt3);
        
        String str3[] ={"AVAILABLE","NOT AVAILABLE"};
        cm3 = new JComboBox(str3);
        cm3.setBackground(Color.white);
        cm3.setBounds(380,150,150,30);
        add(cm3);

        JLabel gender = new JLabel("DESSERTS");
        gender .setFont(new Font("Tahoma", Font.PLAIN, 17));
        gender.setBounds(60,200,120,30);
        add(gender);
        
        txt4 = new JTextField();
        txt4.setBounds(185,200,150,30);
        add(txt4);
        
        String str4[] ={"AVAILABLE","NOT AVAILABLE"};
        cm4 = new JComboBox(str4);
        cm4.setBackground(Color.white);
        cm4.setBounds(380,200,150,30);
        add(cm4);

       
       

        JLabel JOB = new JLabel("COFFEE");
        JOB .setFont(new Font("Tahoma", Font.PLAIN, 17));
        JOB.setBounds(60,250,120,30);
        add(JOB);
        
        
        txt5 = new JTextField();
        txt5.setBounds(185,250,150,30);
        add(txt5);
        
        String str5[] ={"AVAILABLE","NOT AVAILABLE"};
        cm5 = new JComboBox(str5);
        cm5.setBackground(Color.white);
        cm5.setBounds(380,250,150,30);
        add(cm5);

       

        JLabel Salary = new JLabel("SEKUWA");
        Salary .setFont(new Font("Tahoma", Font.PLAIN, 17));
        Salary.setBounds(60,300,120,30);
        add(Salary);

        txt6 = new JTextField();
        txt6.setBounds(185,300,150,30);
        add(txt6);
        
        String str6[] ={"AVAILABLE","NOT AVAILABLE"};
        cm6 = new JComboBox(str6);
        cm6.setBackground(Color.white);
        cm6.setBounds(380,300,150,30);
        add(cm6);

      
        btn1 = new JButton("Done");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.white);
        btn1.setBounds(200,400,120,30);
        btn1.addActionListener(this);
        add(btn1);
        
        btn4 = new JButton("Homepage");
        btn4.setBackground(Color.LIGHT_GRAY);
        btn4.setForeground(Color.white);
        btn4.setBounds(650,510,120,30);
        btn4.addActionListener(this);
        add(btn4);
        
        btn2 = new JButton("Drinks");
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setForeground(Color.white);
        btn2.setBounds(40,400,120,30);
        btn2.addActionListener(this);
        add(btn2);
        
        btn3 = new JButton("ADD FOOD");
        btn3.setBackground(Color.LIGHT_GRAY);
        btn3.setForeground(Color.white);
        btn3.setBounds(390,400,120,30);
        btn3.addActionListener(this);
        add(btn3);

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/food.jpg"));
       // Image i2 = i1.getImage().getScaledInstance();
        // Image i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i1);
        lbl1.setBounds(190,2,700,600);
        add(lbl1);


        JLabel lbl3 = new JLabel("STATUS ");
        lbl3.setForeground(Color.blue);
        lbl3 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl3.setBounds(400,10,300,30);
        add(lbl3);
        
        JLabel lbl4 = new JLabel("ITEMS LIST ");
        lbl4.setForeground(Color.blue);
        lbl4 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl4.setBounds(50,10,300,30);
        add(lbl4);
        
        JLabel lbl5 = new JLabel("PRICE");
        lbl5.setForeground(Color.blue);
        lbl5 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl5.setBounds(220,10,300,30);
        add(lbl5);
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(300,160,800,600);
        setVisible(true);
    }

      
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
     String BIRAYANI = txt1.getText();
        String KABABS = txt2.getText();
        String BREADS = txt3.getText();
        String DESSERTS  = txt4.getText();
        String COFFEE = txt5.getText();
        String SEKUWA = txt6.getText();
       
       

        String BIRAYANI1=(String) cm1.getSelectedItem();
        String KABABS1=(String) cm1.getSelectedItem();
        String BREADS1=(String) cm1.getSelectedItem();
        String DESSERTS1=(String) cm1.getSelectedItem();
        String COFFEE1=(String) cm1.getSelectedItem();
        String SEKUWA1=(String) cm1.getSelectedItem();
        
        conn c = new conn();
        String str = "insert into Food values('"+BIRAYANI+"','"+KABABS+"','"+BREADS+"','"+DESSERTS+"','"+COFFEE+"','"+SEKUWA+"')";


        
        try{
           
             c.s.executeUpdate(str);
         JOptionPane.showMessageDialog(null,"FOOD Added");
         setVisible(false);
           
        }
        catch (Exception a) {
                        a.printStackTrace();
        	    }
            
        
            new Homepage().setVisible(true);
            this.setVisible(false);

        } if(e.getSource()==btn3){
            new AddFood().setVisible(true);
            this.setVisible(false);
            
        } if(e.getSource()==btn2){
            new Drinks().setVisible(true);
            this.setVisible(false);
        }   if(e.getSource()==btn4){
            new Homepage
        
        
        
        ().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[]args){
        new Food();
    }
}

