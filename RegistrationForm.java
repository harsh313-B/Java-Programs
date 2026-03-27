import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {

    TextField nameField;
    Button submitBtn;
    Checkbox male, female;
    CheckboxGroup gender;

    RegistrationForm() {

        // Frame settings
        setTitle("Registration Form");
        setSize(300, 300);
        setLayout(null);

        // Label
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 60, 80, 20);
        add(nameLabel);

        // TextField
        nameField = new TextField();
        nameField.setBounds(130, 60, 120, 20);
        add(nameField);

        // Checkbox (Radio Buttons)
        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 100, 80, 20);
        add(genderLabel);

        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);

        male.setBounds(130, 100, 60, 20);
        female.setBounds(190, 100, 70, 20);

        add(male);
        add(female);

        // Button
        submitBtn = new Button("Submit");
        submitBtn.setBounds(110, 150, 80, 30);
        add(submitBtn);

        // Menu Bar
        MenuBar mb = new MenuBar();
        Menu file = new Menu("File");
        MenuItem exit = new MenuItem("Exit");

        file.add(exit);
        mb.add(file);
        setMenuBar(mb);

        // Register events
        submitBtn.addActionListener(this);

        exit.addActionListener(e -> System.exit(0));

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Button click event
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String genderValue = gender.getSelectedCheckbox().getLabel();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + genderValue);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
