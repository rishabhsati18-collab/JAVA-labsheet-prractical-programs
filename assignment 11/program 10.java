import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JTextField acc = new JTextField(10);
    JTextField name = new JTextField(10);
    JTextField amount = new JTextField(10);
    JLabel balance = new JLabel("Balance: 5000");

    JButton deposit = new JButton("Deposit");
    JButton withdraw = new JButton("Withdraw");
    JButton check = new JButton("Check Balance");
    JButton clear = new JButton("Clear");

    double money = 5000;

    Main() {
        setLayout(new FlowLayout());

        add(new JLabel("Account Number")); add(acc);
        add(new JLabel("Customer Name")); add(name);
        add(balance);
        add(new JLabel("Amount")); add(amount);

        add(deposit); add(withdraw); add(check); add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            acc.setText("");
            name.setText("");
            amount.setText("");
            return;
        }

        if (e.getSource() == check) {
            JOptionPane.showMessageDialog(this, "Balance: " + money);
            return;
        }

        try {
            double a = Double.parseDouble(amount.getText());

            if (a <= 0) {
                JOptionPane.showMessageDialog(this, "Enter positive amount");
            } else if (e.getSource() == deposit) {
                money += a;
                JOptionPane.showMessageDialog(this, "Amount Deposited");
            } else if (a <= money) {
                money -= a;
                JOptionPane.showMessageDialog(this, "Amount Withdrawn");
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient Balance");
            }

            balance.setText("Balance: " + money);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Amount");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}