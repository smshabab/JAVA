package finalProject;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener{
	
	/**
	 * 
	 */

	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
	
	private JLabel text1;
	private JLabel userid1;
	private JLabel code1;
	private JLabel password1;
	private JLabel varification;
	private JLabel note;
	private JLabel userid3;
	private JLabel password3;
	

	private JTextField userid2;
	private JTextField code2;
	private JTextField userid4;
	
	private JPasswordField password2;
	private JPasswordField password4;
	
	private JButton back;
	private JButton register;

	private JPanel panelOne;
	
	public static int counter=0;
	public static int idCount=0;
	
	public Signup() {
		
		super("SignUp");
		setLayout(null);
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("signup-icon.png");
        setIconImage(icon);
		
		image1 = new ImageIcon("signup-icon.png");
		text1 = new JLabel(image1);
		text1.setBounds(160, 20, 80, 80);
		add(text1);

		
		userid1 = new JLabel("User_id             : ",10);
		userid1.setBounds(20, 140, 100, 50);
		add(userid1);
		
		userid2 = new JTextField(null, 50);
		userid2.setBounds(110, 140, 270, 50);
		add(userid2);
		
		code1 = new JLabel("Security Code : ",10);
		code1.setBounds(20, 200, 100, 50);
		add(code1);
		
		code2 = new JTextField(null, 50);
		code2.setBounds(110, 200, 270, 50);
		add(code2);
		
		password1 = new JLabel("Password        : ",10);
		password1.setBounds(20, 260, 100, 50);
		add(password1);
		
		password2 = new JPasswordField(null, 50);
		password2.setBounds(110, 260, 270, 50);
		add(password2);
		
		varification = new JLabel("...VARIFICATION...");
		varification.setBounds(150, 320, 100, 50);
		add(varification);
		
		note = new JLabel("...INFORMATION OF ANY INSIDER...");
		note.setBounds(100, 350, 300, 50);
		add(note);
		
		userid3 = new JLabel("User_id             : ", 10);
		userid3.setBounds(20, 410, 100, 50);
		add(userid3);
		
		userid4 = new JTextField(null, 50);
		userid4.setBounds(110, 410, 270, 50);
		add(userid4);
		
		password3 = new JLabel("Password        : ");
		password3.setBounds(20, 470, 100, 50);
		add(password3);
		
		password4 = new JPasswordField(null, 10);
		password4.setBounds(110, 470, 270, 50);
		add(password4);
		
		
		image2 = new ImageIcon("back-button2.png");
		back = new JButton(image2);
		back.setBounds(20, 570, 150, 50);
		add(back);
		
		image3 = new ImageIcon("register-button.png");
		register = new JButton(image3);
		register.setBounds(225, 570, 150, 50);
		add(register);
		
		panelOne = new JPanel();
		panelOne.setBounds(0, 0, 400, 700);
		panelOne.setBackground(Color.CYAN);
		add(panelOne);
		
		back.addActionListener(this);
		register.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			this.setVisible(false);
			Thread t2 = new Thread(new Login());
			t2.start();
		}else if(e.getSource() == register) {
			
		try {	
			int identifier = Integer.parseInt(userid2.getText());
			DbConnection.searchData5(identifier);
			
			if(idCount==1) {	
			
				idCount=0;
				
				
				String str1 = userid4.getText();
				int id = Integer.parseInt(str1);
				
				char[] passStr = password4.getPassword();
				String str2 = new String(passStr);
				int pass = Integer.parseInt(str2);
				
			DbConnection.searchData4(id, pass);
			
			
			
			if(counter==1) {
				try {
					counter=0;
					setVisible(false);
					int id1 = Integer.parseInt(userid2.getText());
					char[] pass2 = password2.getPassword();
					String passString = new String(pass2);
					int password1 = Integer.parseInt(passString);
					int code1 = Integer.parseInt(code2.getText());
					DbConnection.insertData1(id1, password1, code1);
					JOptionPane.showMessageDialog(null, "YOU ARE REGISTERED ... !\nTRY TO LOGIN ... !");
					new Login();
					}catch(Exception ex) {
						counter=0;
						JOptionPane.showMessageDialog(null, "WRONG ENTRY ... ! \nONLY INTEGER INPUTS ARE ALLOWED ... !");
						new Signup();
					}
			}
			
		}else {
			JOptionPane.showMessageDialog(this, "USER ALREADY EXSIST ... !\nTRY ANOTHER USER_ID ... !");
		}
		
		
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(this, "WRONG ENTRY ... ! \nONLY INTEGER INPUTS ARE ALLOWED ... !");
		}
			
		
		}
		

	
	}
	
	
	
	
}
