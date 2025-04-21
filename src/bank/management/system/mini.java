package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    mini(String pin){
        this.pin = pin;

        JLabel level1 = new JLabel();
        level1.setBounds(20,140,400,200);
        add(level1);

        JLabel level2 = new JLabel("MIM Bank");
        level2.setFont(new Font("System", Font.BOLD,25));
        level2.setBounds(150,20,200,20);
        add(level2);

        JLabel level3 = new JLabel();
        level3.setBounds(20,80,300,20);
        add(level3);

        JLabel level4 = new JLabel();
        level4.setBounds(20,400,300,20);
        add(level4);

        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                level3.setText("Card number: "+resultSet.getString("card_number").substring(0,3)+"XXXXXXXXXXXX"+resultSet.getString("card_number").substring(12));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        try{
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){

                level1.setText(level1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            level4.setText("Your Total Balance is Rs "+balance);

        }catch (Exception E){
            E.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);


        getContentPane().setBackground(new Color(255, 220, 150));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
