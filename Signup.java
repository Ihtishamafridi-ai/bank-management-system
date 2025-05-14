package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

        JTextField textName,textName1,textEmail,textAdd,textCity,textPin,textstate;
        JRadioButton r1,r2,m1,m2,m3;
        JButton Next;
        JLabel labelG,labelName;
        JDateChooser dateChooser;
        Random ran= new Random();
        long first4=(ran.nextLong() % 9000L) + 1000;
        String first=" "+ Math.abs(first4);
    Signup(){
        super("APPLICATION FORM ");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        JLabel label1=new JLabel("Application Form NO." + first);
        label1.setBounds(170,20,600,40);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Raleway",Font.BOLD,35));
        add(label1);
        JLabel label2=new JLabel("Page 1");
        label2.setBounds(300,30,200,90);
        label2.setFont(new Font("Raleway", Font.BOLD,20));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(250,36,250,120);
        add(label3);

        labelName=new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,18));
        labelName.setBounds(90,80,150,150);
        add(labelName);
        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,15));
        textName.setBounds(250,145,300,25);
        add(textName);

                JLabel labelName1=new JLabel("Father's Name:");
        labelName1.setBounds(65,110,200,190);
        labelName1.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelName1);
        textName1=new JTextField();
        textName1.setFont(new Font("Raleway",Font.BOLD,15));
        textName1.setBounds(250,190,300,25);
        add(textName1);
        JLabel DOB=new JLabel("Date Of Birth:");
        DOB.setBounds(65,160,200,190);
        DOB.setFont(new Font("Raleway",Font.BOLD,18));
        add(DOB);
        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(250,240,300,25);
        add(dateChooser);

        labelG=new JLabel("Gender:");
        labelG.setBounds(65,285,300,30);
        labelG.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelG);
        r1=new JRadioButton("Male");
        r1.setBackground(new Color(46, 140, 143, 173));
        r1.setBounds(250,290,70,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);
        r2=new JRadioButton("Female");
        r2.setBounds(400,290,90,30);
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(46, 140, 143, 173));
        r2.setForeground(Color.BLACK);
        add(r2);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail=new JLabel("Email Address:");
        labelEmail.setBounds(64,340,300,30);
        labelEmail.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelEmail);
        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,15));
        textEmail.setBounds(250,340,300,25);
        add(textEmail);

        JLabel labelMS=new JLabel("Marital Status:");
        labelMS.setBounds(64,380,300,30);
        labelMS.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelMS);
        m1=new JRadioButton("Married");
        m1.setOpaque(true);
        m1.setBounds(250,380,90,30);
        m1.setBackground(new Color(46, 140, 143,173));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);
        m2=new JRadioButton("UN Married");
        m2.setBounds(400,380,100,30);
        m2.setBackground(new Color(46, 140, 143, 173));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);
        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel labelAdd=new JLabel("Adress:");
        labelAdd.setBounds(64,420,240,30);
        labelAdd.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelAdd);
        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,15));
        textAdd.setBounds(250,420,300,25);
        add(textAdd);

        JLabel labelCity=new JLabel("City:");
        labelCity.setBounds(64,460,240,30);
        labelCity.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelCity);
        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,15));
        textCity.setBounds(250,460,300,25);
        add(textCity);

        JLabel labelPin=new JLabel("PIN Code:");
        labelPin.setBounds(64,500,240,30);
        labelPin.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelPin);
        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,15));
        textPin.setBounds(250,500,300,25);
        add(textPin);

        JLabel labelstate=new JLabel("State:");
        labelstate.setBounds(64,540,240,30);
        labelstate.setFont(new Font("Raleway",Font.BOLD,18));
        add(labelstate);
        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,20));
        textstate.setBounds(250,540,300,25);
        add(textstate);

        Next=new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setForeground(Color.white);
        Next.setBackground(Color.black);
        Next.setBounds(640,580,80,25);
        Next.addActionListener(this);
        add(Next);

        getContentPane().setBackground(new Color(46, 140, 143, 173));
        setLayout(null);
        setSize(750,650);
        setLocation(280,8);
        setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno= first;
        String Name= textName.getText();
        String Name1= textName1.getText();
        String DOB= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String Email=textEmail.getText();
        String Marital=null;
        if(m1.isSelected()){
            Marital="Married";
        }else if(m2.isSelected()){
            Marital="Un Married";
        }
        String Add=textAdd.getText();
        String City=textCity.getText();
        String Pin=textPin.getText();
        String state=textstate.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            }else {
                Connect con=new Connect();
                String q="Insert into Signup values('"+formno+"','"+Name+"','"+Name1+"','"+DOB+"','"+gender+"','"+Email+"','"+Marital+"','"+Add+"','"+City+"','"+Pin+"','"+state+"')";
                con.statement.executeUpdate(q);
                new signup2(first);
                setVisible(false);

            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[]args){
        new Signup();
    }
}



