package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.foreign.AddressLayout;

public class signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4;
    String formno;
    JTextField textpan,textField;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    signup2(String formno){
        super("Application Form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank (1).png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,130,100,30);
        add(l3);

        String [] religion={"Muslim","Hindu","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,130,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,180,100,30);
        add(l4);

        String [] category={"General","OBC","SC","Other"};
        comboBox1=new JComboBox(category);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,180,320,30);
        add(comboBox1);

        JLabel l5=new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,230,100,30);
        add(l5);

        String [] income={"null","50000","100000","150000",">150000"};
        comboBox2=new JComboBox(income);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,230,320,30);
        add(comboBox2);

        JLabel l6=new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,280,100,30);
        add(l6);

        String [] education={"Non-Graduate","Graduate","Post Graduate","Other"};
        comboBox3=new JComboBox(education);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,280,320,30);
        add(comboBox3);

        JLabel l7=new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,330,200,30);
        add(l7);

        String [] occupation={"Salaried","Student","Business","Self-Employed","Other"};
        comboBox4=new JComboBox(occupation);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,330,320,30);
        add(comboBox4);

        JLabel l8=new JLabel("Pan Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,380,200,30);
        add(l8);

        textpan=new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,380,200,30);
        add(textpan);

        JLabel l9=new JLabel("CNIC Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,430,200,30);
        add(l9);

        textField=new JTextField();
        textField.setFont(new Font("Raleway",Font.BOLD,18));
        textField.setBounds(350,430,200,30);
        add(textField);


        JLabel l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,480,200,30);
        add(l10);

        r1=new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,480,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,480,100,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11=new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,530,200,30);
        add(l11);

        r3=new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,530,100,30);
        add(r3);

        r4=new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(450,530,100,30);
        add(r4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l12=new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,12));
        l12.setBounds(650,10,200,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(700,10,100,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(600,580,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(252,208,76));
        setLayout(null);
        setSize(850,700);
        setLocation(360,40);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox1.getSelectedItem();
        String inc=(String) comboBox2.getSelectedItem();
        String edu=(String) comboBox3.getSelectedItem();
        String occ=(String) comboBox4.getSelectedItem();
        String pan=(String) textpan.getText();
        String cnic=(String) textField.getText();
        String scitizen=null;
        if(r1.isSelected()){
            scitizen="yes";
        } else if (r2.isSelected()) {
            scitizen="no";
        }
        String exiAcc=null;
        if(r3 .isSelected()){
            exiAcc="yes";
        } else if (r4.isSelected()) {
            exiAcc="no";
        }
        try{
            if(textpan.getText().equals("")|| textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Pan and CNIC fields must be filled ");
            }
            else{
                Con c1=new Con();
                String query2="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+cnic+"','"+scitizen+"','"+exiAcc+"')";
                c1.statement.executeUpdate(query2);
                new Signup3(formno);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signup2("");
    }
}
