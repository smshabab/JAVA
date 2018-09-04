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




public class Login extends JFrame implements Runnable {
	

	/**
	 * all the buttons, ImageIcon variable needed for this class
	 */

	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
	private ImageIcon image4;
	private ImageIcon image5;
	
	private JLabel text1 = null;
	private JLabel text2 = null;
	private JLabel text3 = null;
	
	private JTextField userid = null;
	private JPasswordField password = null;
	
	private JButton login = null;
	private JButton signup = null;
	private JButton resetPass = null;
	private JButton back = null;
	
	private JPanel panelOne;
	

	
	public Login() {																					// constructor 
		super("LogIn");
	}
	
	public void run(){																					// thread t2 starts this run method 
		
		try {
		
			setLayout(null);
		
			Image icon = Toolkit.getDefaultToolkit().getImage("lock-icon.png");
	        setIconImage(icon);
	        
	        image1 = new ImageIcon("lock-icon.png");
			text1 = new JLabel(image1);
			text1.setBounds(160, 5, 80, 80);
			add(text1);
			
			
			text2 = new JLabel("User_id        : ",10);
		    text2.setBounds(50, 95, 100, 50);
			add(text2);
			
			userid = new JTextField(null,15);
			userid.setBounds(130, 100, 220, 40);
			add(userid);
			
			text3 = new JLabel("Password   : ");
			text3.setBounds(50, 140, 100, 50);
			add(text3);
			
			password = new JPasswordField(null,15);
			password.setBounds(130, 150, 220, 40);
			add(password);
			
			image4 = new ImageIcon("resetPass-button.png");
			resetPass = new JButton(image4);
			resetPass.setBounds(50, 210, 40, 40);
			add(resetPass);
			
			image2 = new ImageIcon("login-button.png");
			login = new JButton(image2);
			login.setBounds(170, 210, 80, 40);
			add(login);
			
			image3 = new ImageIcon("signup-button.png");
			signup = new JButton(image3);
			signup.setBounds(270, 210, 80, 40);
			add(signup);
			
			image5 = new ImageIcon("back-button1.png");
			back = new JButton(image5);
			back.setBounds(110, 210, 40, 40);
			add(back);
			
			panelOne = new JPanel();
			panelOne.setBounds(0, 0, 400, 300);
			panelOne.setBackground(Color.CYAN);
			add(panelOne);
			
			
			login.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){ 
					
					try {
						setVisible(false);
						int id1 = Integer.parseInt(userid.getText());
						char[] pass = password.getPassword();
						String passString = new String(pass);
						int password1 = Integer.parseInt(passString);
						DbConnection.searchData1(id1, password1);
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "WRONG ID OR PASSWORD ... !\nTRY AGAIN ...");
						Thread t2 = new Thread(new Login());
						t2.start();
					}
					
					
					
				}
			}); 
			
			signup.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					
					setVisible(false);
					new Signup();
					
					
				}
			}); 
			
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					setVisible(false);
					new SelectProfile();
					
				}
			});
			
			resetPass.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new Reset();
				}
			});
			
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400, 300);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);

		
		}catch(Exception ex) {
			System.out.println("Error in run - login...");
		}
	
	}
	
}
