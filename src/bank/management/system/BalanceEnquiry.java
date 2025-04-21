package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel level2;
    JButton b1;
    String pin;

    BalanceEnquiry(String pin){
        super("Bank Management System");
        this.pin = pin;

        JLabel level1 = new JLabel("Your Account Balance is: ");
        level1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level1.setForeground(Color.WHITE);
        level1.setBounds(450,340,700,25);
        add(level1);

        level2 = new JLabel();
        level2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level2.setForeground(Color.WHITE);
        level2.setBounds(460,370,500,25);
        add(level2);

        b1 = new JButton("BACK");
        b1.setBounds(800,465,180,28);
        b1.setFont(new Font("Times New Roman", Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        int balance =0;
        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        level2.setText(""+balance);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-90,-35,1550,900);
        add(l3);

        setLayout(null);
        setLocation(0,0);
        setSize(1550,1060);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}

