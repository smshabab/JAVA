package finalProject;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Reset extends JFrame implements ActionListener{													// class Reset exteds jframe implements actionListener
	

	/**
	 * 
	 */

	private JLabel labelOne;																					// variable for adding the gif image 
	private JLabel user_id;																						// variable for user_id label
	private JLabel securityCode;																				// variable for securityCode label
	private JLabel newPassword;																					// variable for newPassword label
	private JLabel repeatPass;																					// variabe for repeatPassword label
		
	private ImageIcon iconOne;																					// variable for adding start image 
	
	private JTextField tf1;																						// variable for taking user_id input 
	private JTextField tf2;																						// variable for taking securityCode input 
	private JPasswordField pf1;																					// variable for new password input 
	private JPasswordField pf2;																					// variable for repeatPassword input
		
	private JButton reset;																						//
	private JButton cancel;																						//
	
	private int id,pass,code;																					//
	
	public Reset() {																							//
		super("Reset Password");																				//
		setLayout(null);																						//
		
		Image icon = Toolkit.getDefaultToolkit().getImage("reset-icon1.png");									//
        setIconImage(icon);																						//
		
        
		iconOne = new ImageIcon("reset-icon2.gif");																//
		labelOne = new JLabel(iconOne);																			//
		labelOne.setBounds(150, 10, 100, 100);																	//
		add(labelOne);																							//
		
		
		user_id = new JLabel("User ID                      : ");												//
		user_id.setBounds(30, 140, 120, 40);																	//
		add(user_id);																							//
		
		tf1 = new JTextField(null,15);																			//
		tf1.setBounds(160, 140, 200, 40);																		//
		add(tf1);																								//
			
		securityCode = new JLabel("Security Code         : ");													//
		securityCode.setBounds(30, 190, 120, 40);																//
		add(securityCode);																						//
		
		tf2 = new JTextField(null, 15);																			//
		tf2.setBounds(160, 190, 200, 40);																		//
		add(tf2);																								//
		
		newPassword = new JLabel("New Password       : ");														//
		newPassword.setBounds(30, 240, 120, 40);																//
		add(newPassword);																						//
		
		pf1 = new JPasswordField(null, 15);																		//
		pf1.setBounds(160, 240, 200, 40);																		//
		add(pf1);																								//
		
			
		repeatPass = new JLabel("Repeat Password  : ");															//
		repeatPass.setBounds(30, 290, 120, 40);																	//
		add(repeatPass);																						//
		
		pf2 = new JPasswordField(null, 15);																		//
		pf2.setBounds(160, 290, 200, 40);																		//
		add(pf2);																								//
		
		cancel = new JButton("Cancel");																			//
		cancel.setBounds(30, 350, 150, 50);																		//
		add(cancel);																							//
		
		reset = new JButton("Reset");																			//
		reset.setBounds(210, 350, 150, 50);																		//
		add(reset);																								//
		
		cancel.addActionListener(this);																			//
		reset.addActionListener(this);																			//
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);															//
		setSize(400, 450);																						//
		setResizable(false);																					//
		setLocationRelativeTo(null);																			//
		setVisible(true);																						//
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {																//

		if(e.getSource() == cancel) {																			//
			setVisible(false);																					//
			Thread t2 = new Thread(new Login());																//
			t2.start();																							//
		}else if(e.getSource() == reset) {																		//
			try {																								//
			String str1 = tf1.getText();																		//	
			id = Integer.parseInt(str1);																		//
			String str2 = tf2.getText();																		//
			code = Integer.parseInt(str2);																		//
			
			char[] pass1 = pf1.getPassword();																	//
			String passString1 = new String(pass1);																//
			int password1 = Integer.parseInt(passString1);														//
																
			char[] pass2 = pf2.getPassword();																	//
			String passString2 = new String(pass2);																//
			int password2 = Integer.parseInt(passString2);														//
			
			pass = password1;																					//
			
			if(password1 == password2) {																		//
				setVisible(false);																				//
				DbConnection.searchData3(id, pass, code);														//
			}else {																								//
				JOptionPane.showMessageDialog(this, "PASSWORD DIDN'T MATCH ... !");								//
			}
			}catch(Exception ex) {																				//
				JOptionPane.showMessageDialog(this, "INPUT SHOULD BE INTEGER ... !");							//
			}
		}
	}



}
