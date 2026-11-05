import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JTextField temp = new JTextField(10);
    JRadioButton cf = new JRadioButton("Celsius to Fahrenheit");
    JRadioButton fc = new JRadioButton("Fahrenheit to Celsius");
    JButton convert = new JButton("Convert");
    JButton clear = new JButton("Clear");
    JLabel result = new JLabel("Result");

    Main() {
        setLayout(new FlowLayout());

        ButtonGroup g = new ButtonGroup();
        g.add(cf); g.add(fc);

        add(temp); add(cf); add(fc);
        add(convert); add(clear); add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double t = Double.parseDouble(temp.getText());

                if (cf.isSelected())
                    result.setText("Fahrenheit: " + (t * 9 / 5 + 32));
                else if (fc.isSelected())
                    result.setText("Celsius: " + ((t - 32) * 5 / 9));
                else
                    result.setText("Select conversion");
            } catch (Exception ex) {
                result.setText("Invalid Input");
            }
        } else {
            temp.setText("");
            result.setText("Result");
            cf.setSelected(false);
            fc.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}