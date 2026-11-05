import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JTextField user = new JTextField(12);
    JPasswordField pass = new JPasswordField(12);
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");

    Main() {
        setLayout(new FlowLayout());
        add(new JLabel("Username")); add(user);
        add(new JLabel("Password")); add(pass);
        add(login); add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);

        setSize(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            if (user.getText().equals("admin") &&
                new String(pass.getPassword()).equals("1234"))
                JOptionPane.showMessageDialog(this, "Login Successful");
            else
                JOptionPane.showMessageDialog(this, "Invalid Login");
        } else {
            user.setText("");
            pass.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}