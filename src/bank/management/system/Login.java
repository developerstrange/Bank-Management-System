package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel level1, level2, level3, level4;
    JTextField textfield2;
    JPasswordField passwordfield3;
    JButton button1, button2, button3;
    Login(){
        super("Bank Management System");
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank-icon3.png"));
//        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(20, 80, 100, 100);
//        add(image);

        level1 = new JLabel("Welcome to MIM Bank");
        level1.setForeground(Color.white);
        level1.setFont(new Font("Atlan", Font.BOLD, 35));
        level1.setBounds(130,44,450,40);
        add(level1);


        level2 = new JLabel("Card No : ");
        level2.setForeground(Color.WHITE);
        level2.setFont(new Font("Ralway", Font.BOLD, 28));
        level2.setBounds(15,130,400, 30);
        add(level2);

        textfield2 = new JTextField(15);
        textfield2.setFont(new Font("Times New Roman", Font.BOLD, 23));
        textfield2.setBounds(150, 133, 380, 28);
        //setForeground(Color.WHITE);
        add(textfield2);

        level3 = new JLabel("PIN           : ");
        level3.setForeground(Color.WHITE);
        level3.setFont(new Font("Ralway", Font.BOLD, 24));
        level3.setBounds(15, 180, 400,30);
        add(level3);

        passwordfield3 = new JPasswordField(15);
        //passwordfield3.setForeground(Color.WHITE);
        passwordfield3.setBounds(150,183,380,28);
        passwordfield3.setFont(new Font("Times New Roman", Font.BOLD, 23));
        add(passwordfield3);


        button2 = new JButton("CLEAR");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 23));
        button2.setBounds(365, 230, 160, 28);
        button2.addActionListener(this);
        add(button2);

        button1 = new JButton("Log In");
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 23));
        button1.setBounds(160, 230, 160, 28);
        button1.addActionListener(this);
        add(button1);

        button3 = new JButton("Create an Account");
        button3.setFont(new Font("Times New Roman", Font.BOLD, 23));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(160, 280, 370, 30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank-icon1.png"));
        Image ii2 = ii1.getImage().getScaledInstance(1050, 600, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0, 0, 1050, 600);
        add(iimage);


        setLayout(null);
        setSize(1050,600);
        setVisible(true);
        setLocation(180, 80);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == button1) {
                Con c = new Con();
                String cardno = textfield2.getText().trim();
                String pin = new String(passwordfield3.getPassword()).trim();
                String q = "select * from login where card_number = '" + cardno + "' and  pin = '" + pin + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }


            }else if (e.getSource() == button2){
                textfield2.setText("");
                passwordfield3.setText("");
            }else if (e.getSource() == button3){
                new signUp();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
