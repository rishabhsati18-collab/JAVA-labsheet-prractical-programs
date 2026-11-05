import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JTextField name = new JTextField(12), roll = new JTextField(12);
    JTextField course = new JTextField(12);
    JRadioButton excellent = new JRadioButton("Excellent");
    JRadioButton good = new JRadioButton("Good");
    JRadioButton average = new JRadioButton("Average");
    JCheckBox teaching = new JCheckBox("Teaching");
    JCheckBox lab = new JCheckBox("Laboratory");
    JCheckBox material = new JCheckBox("Course Material");
    JCheckBox assignment = new JCheckBox("Assignments");
    JTextArea comments = new JTextArea(3, 15);
    JButton submit = new JButton("Submit"), reset = new JButton("Reset");

    Main() {
        setLayout(new FlowLayout());

        ButtonGroup g = new ButtonGroup();
        g.add(excellent); g.add(good); g.add(average);

        add(new JLabel("Name")); add(name);
        add(new JLabel("Roll")); add(roll);
        add(new JLabel("Course")); add(course);

        add(excellent); add(good); add(average);
        add(teaching); add(lab); add(material); add(assignment);
        add(comments); add(submit); add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(300, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String rating = excellent.isSelected() ? "Excellent" :
                good.isSelected() ? "Good" :
                average.isSelected() ? "Average" : "Not selected";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nRoll: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + rating +
                "\nTeaching: " + teaching.isSelected() +
                "\nLaboratory: " + lab.isSelected() +
                "\nCourse Material: " + material.isSelected() +
                "\nAssignments: " + assignment.isSelected() +
                "\nComments: " + comments.getText());
        } else {
            name.setText(""); roll.setText(""); course.setText("");
            comments.setText("");
            gReset();
        }
    }

    void gReset() {
        excellent.setSelected(false);
        good.setSelected(false);
        average.setSelected(false);
        teaching.setSelected(false);
        lab.setSelected(false);
        material.setSelected(false);
        assignment.setSelected(false);
    }

    public static void main(String[] args) {
        new Main();
    }
}