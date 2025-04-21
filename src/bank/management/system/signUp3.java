package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUp3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;

    JButton submit, cancel;
    String formno;

    signUp3(String formno){
        this.formno = formno;
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank-icon5.png"));
        Image j2 = j1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel image = new JLabel(j3);
        image.setBounds(430,-40,170,170);
        add(image);


        JLabel level12 = new JLabel("APPLICATION FORM");
        level12.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level12.setBounds(400, -140, 500, 500);
        add(level12);

        JLabel level22 = new JLabel("Page No: 2");
        level22.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level22.setBounds(475, -16, 300, 300);
        add(level22);

        JLabel level32 = new JLabel("Account Type    :");
        level32.setFont(new Font("Times New Roman", Font.BOLD, 22));
        level32.setBounds(115,10, 300, 300);
        add(level32);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new Color(135, 230, 230));
        r1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        r1.setBounds(125,185, 180, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(135, 230, 230));
        r2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        r2.setBounds(480,185, 220, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(135, 230, 230));
        r3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        r3.setBounds(125,225, 180, 20);
        add(r3);

        r4= new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(135, 230, 230));
        r4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        r4.setBounds(480,225, 300, 20);
        add(r4);

        ButtonGroup buttonGroup5 = new ButtonGroup();
        buttonGroup5.add(r1);
        buttonGroup5.add(r2);
        buttonGroup5.add(r3);
        buttonGroup5.add(r4);


        JLabel level33 = new JLabel("Card Number        :");
        level33.setFont(new Font("Times New Roman", Font.BOLD, 21));
        level33.setBounds(115,210, 300, 150);
        add(level33);

        JLabel level34 = new JLabel("(Your 16 digit card number)");
        level34.setFont(new Font("Times New Roman", Font.BOLD, 16));
        level34.setBounds(112,158, 300, 300);
        add(level34);

        JLabel level35 = new JLabel("XXXX-XXXX-XXXXX-4248");
        level35.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level35.setBounds(400,210, 300, 150);
        add(level35);

        JLabel level36 = new JLabel("(It will appear on your ATM/Check book and Statements)");
        level36.setFont(new Font("Times New Roman", Font.BOLD, 14));
        level36.setBounds(400,158, 400, 300);
        add(level36);

        JLabel level37 = new JLabel("PIN                         : ");
        level37.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level37.setBounds(120,270, 300, 150);
        add(level37);

        JLabel level38 = new JLabel("(4-digit password)");
        level38.setFont(new Font("Times New Roman", Font.BOLD, 15));
        level38.setBounds(120,212, 300, 300);
        add(level38);

        JLabel level39 = new JLabel("XXXX");
        level39.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level39.setBounds(400,270, 300, 150);
        add(level39);

        JLabel level310 = new JLabel("Service Required   : ");
        level310.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level310.setBounds(115,360, 300, 80);
        add(level310);

        c1= new JCheckBox("Atm Card");
        c1.setBackground(new Color(135,230,230));
        c1.setFont(new Font("Times New Roman", Font.BOLD,17));
        c1.setBounds(150,425,150,20);
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setBackground(new Color(135,230,230));
        c2.setFont(new Font("Times New Roman", Font.BOLD,17));
        c2.setBounds(350,425,200,20);
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(135,230,230));
        c3.setFont(new Font("Times New Roman", Font.BOLD,16));
        c3.setBounds(150,447,150,20);
        add(c3);

        c4= new JCheckBox("Check book");
        c4.setBackground(new Color(135,230,230));
        c4.setFont(new Font("Times New Roman", Font.BOLD,16));
        c4.setBounds(350,447,150,20);
        add(c4);

        c5= new JCheckBox("E-Statement");
        c5.setBackground(new Color(135,230,230));
        c5.setFont(new Font("Times New Roman", Font.BOLD,17));
        c5.setBounds(150,467,150,20);
        add(c5);

        c6= new JCheckBox("Email-Alert");
        c6.setBackground(new Color(135,230,230));
        c6.setFont(new Font("Times New Roman", Font.BOLD,16));
        c6.setBounds(350,467,150,20);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(135,230,230));
        c7.setFont(new Font("Times New Roman", Font.BOLD,14));
        c7.setBounds(100,500,550,20);
        add(c7);

        JLabel levelfn = new JLabel("Form No: ");
        levelfn.setBounds(840, 00, 100, 60);
        levelfn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(levelfn);

        JLabel levelfn1 = new JLabel(formno);
        levelfn1.setBounds(920, 00, 100, 60);
        levelfn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(levelfn1);

        submit = new JButton("Submit");
        submit.setBounds(860, 480, 90,35);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        setFont(new Font("Times New Roman", Font.BOLD, 45));
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(760, 480, 90,35);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        setFont(new Font("Times New Roman", Font.BOLD, 45));
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(new Color(135, 230, 230));
        setLayout(null);
        setSize(1050, 600);
        setLocation(180,80);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String actype = null;
        if(r1.isSelected()){
                actype = "Saving Account";
        }else if(r2.isSelected()){
                actype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
                actype = "Current Account";
        } else if (r4.isSelected()) {
                actype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first2 = (ran.nextLong() % 90000000L + 1409963000000000L);
        String cardno = " "+ Math.abs(first2);

        long first3 = (ran.nextLong() % 9000L + 1000L);
        String pin = " " + Math.abs(first3);

        String service = "";
        if(c1.isSelected()){
            service += "Atm Card";
        } else if (c2.isSelected()) {
            service += "Internet Banking";
        } else if (c3.isSelected()) {
            service += "Mobile Banking";
        } else if (c4.isSelected()) {
            service += "Check Book";
        } else if (c5.isSelected()) {
            service += "E-Statements";
        }else if(c6.isSelected()){
            service += "Email Alerts";
        }


        try{
            if(e.getSource()==submit){
                if(actype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill the required fields");
                }
                else{
                    Con c1 = new Con();
                    String q1 = "insert into signupThree values('"+formno+"','"+actype+"','"+cardno+"','"+pin+"','"+service+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";

                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card No: "+cardno+"\nPIN: "+pin);
                    new Deposite(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);

            }
        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {

        new signUp3("");
    }
}
