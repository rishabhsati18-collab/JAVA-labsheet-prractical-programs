import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Main extends JFrame implements ActionListener {
    JTextArea area = new JTextArea();
    JMenuItem n = new JMenuItem("New");
    JMenuItem o = new JMenuItem("Open");
    JMenuItem s = new JMenuItem("Save");
    JMenuItem x = new JMenuItem("Exit");

    Main() {
        add(new JScrollPane(area));

        JMenu file = new JMenu("File");
        file.add(n); file.add(o); file.add(s); file.add(x);

        JMenuBar bar = new JMenuBar();
        bar.add(file);
        setJMenuBar(bar);

        n.addActionListener(this);
        o.addActionListener(this);
        s.addActionListener(this);
        x.addActionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == n) {
                area.setText("");
            } else if (e.getSource() == o) {
                JFileChooser c = new JFileChooser();
                if (c.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                    area.setText(new String(
                        java.nio.file.Files.readAllBytes(
                            c.getSelectedFile().toPath())));
            } else if (e.getSource() == s) {
                JFileChooser c = new JFileChooser();
                if (c.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                    FileWriter w = new FileWriter(c.getSelectedFile());
                    w.write(area.getText());
                    w.close();
                }
            } else {
                System.exit(0);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "File Error");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}