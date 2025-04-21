package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;


public class withdrawl extends JFrame implements ActionListener {

    String pin;

    JTextField textField1;

    JButton b1,b2;

    withdrawl(String pin){

        super("Bank Management System");
        this.pin = pin;

        JLabel level1 = new JLabel("Maximum withdrawl limit is TK. 25000: ");
        level1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level1.setForeground(Color.WHITE);
        level1.setBounds(460,320,700,25);
        add(level1);

        JLabel level2 = new JLabel("Please enter your amount: ");
        level2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level2.setForeground(Color.WHITE);
        level2.setBounds(460,350,500,25);
        add(level2);



        textField1 = new JTextField();
        textField1.setBackground(new Color(155,230,230));
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setBounds(500,390,350,22);
        add(textField1);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(800,465,180,28);
        b1.setFont(new Font("Times New Roman", Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(800,495,180,28);
        b2.setFont(new Font("Times New Roman", Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

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
        if(e.getSource()==b1) {
            try {
                String amount = textField1.getText();
                Date date = new Date();
                if (textField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);

                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
