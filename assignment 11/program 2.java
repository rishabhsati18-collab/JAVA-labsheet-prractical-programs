import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener {
    TextField a = new TextField(10), b = new TextField(10);
    Label result = new Label("Result");
    Button add = new Button("+"), sub = new Button("-");
    Button mul = new Button("*"), div = new Button("/");

    Main() {
        setLayout(new FlowLayout());
        add(a); add(b);
        add(add); add(sub); add(mul); add(div);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double x = Double.parseDouble(a.getText());
            double y = Double.parseDouble(b.getText());
            double z = 0;

            if (e.getSource() == add) z = x + y;
            if (e.getSource() == sub) z = x - y;
            if (e.getSource() == mul) z = x * y;
            if (e.getSource() == div) {
                if (y == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                z = x / y;
            }
            result.setText("Result: " + z);
        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}