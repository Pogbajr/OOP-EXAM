import java.awt.*;
import javax.swing.*;

public class ExhibitionRegistration extends JFrame {
    private JTextField regIdField, nameField, facultyField, projectField, contactField, emailField;
    private JButton registerButton, clearButton, exitButton;

    public ExhibitionRegistration() {
        setTitle("Victoria University Exhibition Registration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Initialize components
        add(new JLabel("Registration ID:"));
        regIdField = new JTextField();
        add(regIdField);

        add(new JLabel("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Faculty:"));
        facultyField = new JTextField();
        add(facultyField);

        add(new JLabel("Project Title:"));
        projectField = new JTextField();
        add(projectField);

        add(new JLabel("Contact Number:"));
        contactField = new JTextField();
        add(contactField);

        add(new JLabel("Email Address:"));
        emailField = new JTextField();
        add(emailField);

        // Buttons
        registerButton = new JButton("Register");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(registerButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);
        add(buttonPanel);

        // Exit button action
        exitButton.addActionListener(e -> System.exit(0));

        // Clear button action
        clearButton.addActionListener(e -> clearFields());
    }

    private void clearFields() {
        regIdField.setText("");
        nameField.setText("");
        facultyField.setText("");
        projectField.setText("");
        contactField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExhibitionRegistration frame = new ExhibitionRegistration();
            frame.setVisible(true);
        });
   
    }
}