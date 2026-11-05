import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JTextField name = new JTextField(12);
    JComboBox<String> course = new JComboBox<>(
        new String[]{"BCA", "BBA", "B.Tech"});
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JCheckBox java = new JCheckBox("Java");
    JCheckBox python = new JCheckBox("Python");
    JButton submit = new JButton("Submit");

    Main() {
        setLayout(new FlowLayout());
        ButtonGroup g = new ButtonGroup();
        g.add(male); g.add(female);

        add(new JLabel("Name")); add(name);
        add(course); add(male); add(female);
        add(java); add(python); add(submit);

        submit.addActionListener(this);
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = male.isSelected() ? "Male" :
                        female.isSelected() ? "Female" : "Not Selected";

        JOptionPane.showMessageDialog(this,
            "Name: " + name.getText() +
            "\nCourse: " + course.getSelectedItem() +
            "\nGender: " + gender +
            "\nSubjects: " +
            (java.isSelected() ? "Java " : "") +
            (python.isSelected() ? "Python" : ""));
    }

    public static void main(String[] args) {
        new Main();
    }
}