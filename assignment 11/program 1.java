import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener {
    TextField n, r, c;
    Choice sem;
    CheckboxGroup g = new CheckboxGroup();
    Checkbox m, f;
    Button submit, reset;
    Label result;

    Main() {
        setLayout(new FlowLayout());

        add(new Label("Name")); n = new TextField(15); add(n);
        add(new Label("Roll")); r = new TextField(15); add(r);
        add(new Label("Course")); c = new TextField(15); add(c);

        m = new Checkbox("Male", g, false);
        f = new Checkbox("Female", g, false);
        add(m); add(f);

        sem = new Choice();
        for (int i = 1; i <= 6; i++) sem.add("" + i);
        add(sem);

        submit = new Button("Submit");
        reset = new Button("Reset");
        add(submit); add(reset);

        result = new Label("");
        add(result);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(300, 350);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit)
            result.setText(n.getText() + " " + r.getText() + " " + c.getText());
        else {
            n.setText(""); r.setText(""); c.setText("");
            g.setSelectedCheckbox(null);
            sem.select(0);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}