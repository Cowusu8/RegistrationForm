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

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
