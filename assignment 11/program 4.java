import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JTextField[] m = new JTextField[5];
    JButton btn = new JButton("Calculate");

    Main() {
        setLayout(new FlowLayout());
        String[] s = {"English", "Maths", "Java", "DBMS", "Networks"};

        for (int i = 0; i < 5; i++) {
            add(new JLabel(s[i]));
            m[i] = new JTextField(5);
            add(m[i]);
        }

        add(btn);
        btn.addActionListener(this);

        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int total = 0;
            boolean pass = true;

            for (JTextField t : m) {
                int x = Integer.parseInt(t.getText());
                if (x < 0 || x > 100) throw new Exception();
                total += x;
                if (x < 40) pass = false;
            }

            double p = total / 5.0;
            String grade = !pass ? "F" : p >= 80 ? "A" : p >= 60 ? "B" : "C";

            JOptionPane.showMessageDialog(this,
                "Total: " + total + "\nPercentage: " + p +
                "\nGrade: " + grade + "\nStatus: " + (pass ? "Pass" : "Fail"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid marks (0-100)");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}