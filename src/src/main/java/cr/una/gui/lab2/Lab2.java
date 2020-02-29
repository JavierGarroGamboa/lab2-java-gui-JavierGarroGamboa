package cr.una.gui.lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mguzmana
 */
public class Lab2 extends JFrame implements ActionListener {

    JPanel Form;
    JLabel lblFirstName;
    JLabel lblLastName;
    JLabel lblFullName;
    JLabel lblPhone;
    JLabel lblGender;
    JLabel lblResult;
    JTextField firsName;
    JTextField lastName;
    JTextField phone;
    JTextArea comments;
    JButton ok;
    JButton clean;

    public Lab2() {
        super("Account");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Form = new JPanel();
        lblFirstName = new JLabel("FirsName: ");
        lblLastName = new JLabel("LastName: ");
        lblFullName = new JLabel("Complete name: ");
        lblPhone = new JLabel("Phone: ");
        lblGender = new JLabel("Gender: ");
        lblResult = new JLabel("Result: ");
        firsName = new JTextField(15);
        lastName = new JTextField(15);
        phone = new JTextField(8);
        comments = new JTextArea(3, 15);
        ok = new JButton("Ok");
        clean = new JButton("Clean");

        Form.setName("Form");
        lblFirstName.setName("lblFirstName");
        lblLastName.setName("lblLastName");
        lblFullName.setName("lblFullName");
        lblPhone.setName("lblPhone");
        lblGender.setName("lblGender");
        lblResult.setName("lblResult");
        firsName.setName("firsName");
        lastName.setName("lastName");
        phone.setName("phone");
        comments.setName("comments");
        ok.setName("ok");
        clean.setName("clean");

        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);

        Form.add(lblFirstName);
        Form.add(firsName);
        Form.add(lblLastName);
        Form.add(lastName);
        Form.add(lblFullName);
        Form.add(lblPhone);
        Form.add(phone);
        Form.add(lblGender);
        Form.add(lblResult);
        Form.add(comments);
        Form.add(ok);
        Form.add(clean);

        add(Form);

        ok.addActionListener(this);
        clean.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == ok) {
            if (firsName != null || lastName != null) {
            }
        } else if (source == clean) {
            firsName.setText(" ");
            lastName.setText(" ");
            comments.setText(" ");
        }
        repaint();
    }
}