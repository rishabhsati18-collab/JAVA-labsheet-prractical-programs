import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener {
    TextField id = new TextField(12), name = new TextField(12);
    TextField des = new TextField(12), salary = new TextField(12);
    Choice dept = new Choice();
    CheckboxGroup g = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", g, false);
    Checkbox female = new Checkbox("Female", g, false);
    TextArea output = new TextArea(5, 25);
    Button submit = new Button("Submit"), clear = new Button("Clear");

    Main() {
        setLayout(new FlowLayout());

        add(new Label("ID")); add(id);
        add(new Label("Name")); add(name);
        add(new Label("Designation")); add(des);
        add(new Label("Salary")); add(salary);

        add(male); add(female);

        dept.add("IT"); dept.add("HR"); dept.add("Finance");
        add(dept); add(submit); add(clear); add(output);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setSize(300, 450);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            output.setText("ID: " + id.getText() +
                "\nName: " + name.getText() +
                "\nDesignation: " + des.getText() +
                "\nSalary: " + salary.getText() +
                "\nDepartment: " + dept.getSelectedItem() +
                "\nGender: " +
                (g.getSelectedCheckbox() == null ? "Not selected" :
                g.getSelectedCheckbox().getLabel()));
        } else {
            id.setText(""); name.setText("");
            des.setText(""); salary.setText("");
            output.setText("");
            g.setSelectedCheckbox(null);
            dept.select(0);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}