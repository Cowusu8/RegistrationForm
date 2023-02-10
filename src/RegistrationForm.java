import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class RegistrationForm implements ActionListener {

	// Creating object of JFrame class
	JFrame frame;

	// Creating objects
	String[] gender = { "Male", "Female" };
	JLabel nameLabel = new JLabel("NAME");
	JLabel genderLabel = new JLabel("GENDER");
	JLabel fatherNameLabel = new JLabel("FATHER NAME");
	JLabel passwordLabel = new JLabel("PASSWORD");
	JLabel confirmPasswordLabel = new JLabel("CONFIRM PASSWORD");
	JLabel cityLabel = new JLabel("CITY");
	JLabel emailLabel = new JLabel("EMAIL");
	JTextField nameTextField = new JTextField();
	JComboBox genderComboBox = new JComboBox(gender);
	JTextField fatherTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JPasswordField confirmPasswordField = new JPasswordField();
	JTextField cityTextField = new JTextField();
	JTextField emailTextField = new JTextField();
	JButton registerButton = new JButton("REGISTER");
	JButton resetButton = new JButton("RESET");

	RegistrationForm() {

		createWindow();// calling method from constructor
		setLocationAndSize();
		addComponentsToFrame();
	}

	// Creating user-defined method
	public void createWindow() {
		// Setting properties of JFrame
		frame = new JFrame();
		frame.setTitle("Registration Form");
		frame.setBounds(40, 40, 380, 600);
		frame.getContentPane().setBackground(Color.pink);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}

	public void setLocationAndSize() {
		// Setting Location and Size of Each Component
		nameLabel.setBounds(20, 20, 40, 70);
		genderLabel.setBounds(20, 70, 80, 70);
		fatherNameLabel.setBounds(20, 120, 100, 70);
		passwordLabel.setBounds(20, 170, 100, 70);
		confirmPasswordLabel.setBounds(20, 220, 140, 70);
		cityLabel.setBounds(20, 270, 100, 70);
		emailLabel.setBounds(20, 320, 100, 70);
		nameTextField.setBounds(180, 43, 165, 23);
		genderComboBox.setBounds(180, 93, 165, 23);
		fatherTextField.setBounds(180, 143, 165, 23);
		passwordField.setBounds(180, 193, 165, 23);
		confirmPasswordField.setBounds(180, 243, 165, 23);
		cityTextField.setBounds(180, 293, 165, 23);
		emailTextField.setBounds(180, 343, 165, 23);
		registerButton.setBounds(70, 400, 100, 35);
		resetButton.setBounds(220, 400, 100, 35);
	}

	public void addComponentsToFrame() {
		// Adding components to Frame
		frame.add(nameLabel);
		frame.add(genderLabel);
		frame.add(fatherNameLabel);
		frame.add(passwordLabel);
		frame.add(confirmPasswordLabel);
		frame.add(cityLabel);
		frame.add(emailLabel);
		frame.add(nameTextField);
		frame.add(genderComboBox);
		frame.add(fatherTextField);
		frame.add(passwordField);
		frame.add(confirmPasswordField);
		frame.add(cityTextField);
		frame.add(emailTextField);
		frame.add(registerButton);
		frame.add(resetButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
