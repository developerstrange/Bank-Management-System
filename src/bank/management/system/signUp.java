package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUp extends JFrame implements ActionListener {
    Random ran = new Random();
    long first1 = (ran.nextLong()%9000L)+10000L;
    String first = " " + Math.abs(first1);

    JTextField textName, textFname, textEmail, textPadd, textcity, textPin, textState, textId;
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, m1, m2, m3;
    JButton next;

    signUp(){
        super("Sing Up");

        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank-icon5.png"));
        Image j2 = j1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel image = new JLabel(j3);
        image.setBounds(430,-40,170,170);
        add(image);

        JLabel level1 = new JLabel("APPLICATION FORM NO: "+first);
        level1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level1.setBounds(400, -140, 500, 500);
        add(level1);

        JLabel level2 = new JLabel("Page No: 1");
        level2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level2.setBounds(480, -20, 300, 300);
        add(level2);

        JLabel level3 = new JLabel("Personal Details    :");
        level3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        level3.setBounds(255,10, 300, 300);
        add(level3);

        JLabel levelname = new JLabel("Name                     : ");
        levelname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelname.setBounds(250, 42, 300, 300);
        add(levelname);

        textName = new JTextField();
        textName.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textName.setBounds(420, 185, 200, 22);
        add(textName);

        JLabel levelFname = new JLabel("Father's Name       : ");
        levelFname .setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelFname .setBounds(252, 68, 300, 300);
        add(levelFname );

        textFname = new JTextField();
        textFname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textFname.setBounds(420, 210, 200, 22);
        add(textFname);

        JLabel levelbirth = new JLabel("Date-of-Birth         : ");
        levelbirth  .setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelbirth .setBounds(250, 94, 300, 300);
        add(levelbirth);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(420, 235, 200, 22);
        add(dateChooser);

        JLabel levelG = new JLabel("Gender                  : ");
        levelG.setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelG.setBounds(251, 180, 200, 200);
        add(levelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r1.setBounds(420,270, 80, 22);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r2.setBounds(520,270, 80, 22);
        add(r2);

        r3 = new JRadioButton("Others");
        r3.setBackground(new Color(222, 255, 228));
        r3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r3.setBounds(630,270, 80, 22);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel levelEmail = new JLabel("Email-Address       : ");
        levelEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelEmail.setBounds(250,155, 300, 300);
        add(levelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(420, 295, 200, 22);
        textEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(textEmail);

        JLabel levelMS = new JLabel("Marital Status      :");
        levelMS.setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelMS.setBounds(251, 183,300,300);
        add(levelMS);

        m1 = new JRadioButton("Married");
        m1.setBounds(420,326,100,22);
        m1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        m1.setBackground(new Color(222, 255,228));
        add(m1);

        m2 = new JRadioButton("Un-Married");
        m2.setBounds(525,326,120,22);
        m2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        m2.setBackground(new Color(222, 255,228));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(650,326,120,22);
        m3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        m3.setBackground(new Color(222, 255,228));

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        add(m3);

        JLabel levelPadd = new JLabel("Present Address     :");
        levelPadd.setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelPadd.setBounds(249, 208,300,300);
        add( levelPadd);

        textPadd = new JTextField();
        textPadd.setBounds(420, 350, 200, 22);
        textPadd.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(textPadd);

        JLabel levelcity = new JLabel("City                       :");
        levelcity  .setFont(new Font("Times New Roman", Font.BOLD, 18));
        levelcity  .setBounds(250, 238,300,300);
        add( levelcity  );

        textcity = new JTextField();
        textcity.setBounds(420, 380, 200, 22);
        textcity.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(textcity);

        JLabel levelPin = new JLabel("Pin Code               : ");
        levelPin.setBounds(251, 268, 300, 300);
        levelPin.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(levelPin);

        textPin = new JTextField();
        textPin.setBounds(420, 410, 200, 22);
        textPin.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(textPin);

        JLabel levelState = new JLabel("State                      : ");
        levelState.setBounds(249, 300, 300, 300);
        levelState.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(levelState);

        textState = new JTextField();
        textState.setBounds(420, 440, 200, 22);
        textState.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(textState);

        JLabel levelId = new JLabel("National ID           : ");
        levelId.setBounds(249, 337, 300, 300);
        levelId.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(levelId);

        textId = new JTextField();
        textId.setBounds(420, 476, 200, 22);
        textId.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(textId);

        next = new JButton("Next");
        next.setBounds(820, 480, 90,35);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        setFont(new Font("Times New Roman", Font.BOLD, 45));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(1050, 600);
        setLocation(180,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Others";
        }
        String email = textEmail.getText();
        String MS = null;
        if(m1.isSelected()){
            MS = "Married";
        } else if (m2.isSelected()) {
            MS = "Un-Married";
        } else if (m3.isSelected()) {
            MS = "Others";
        }
        String address = textPadd.getText();
        String city = textcity.getText();
        String pin = textPin.getText();
        String state = textState.getText();
        String id= textId.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill up the required Information.");
            } else if (textId.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill up the required Information.");
            }else if (textEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill up the required Information.");
            }else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+MS+"','"+address+"','"+city+"','"+pin+"','"+state+"','"+id+"')";
                con1.statement.executeUpdate(q);
                new signUp2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signUp();
    }
}
