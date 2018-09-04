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
import javax.swing.JPanel;
									
public class SelectProfile extends JFrame implements ActionListener {									// class SelectProfile extends jframe implements ActionListener
	
	/**
	 * 
	 */

	private ImageIcon icon1;																			// variable for start select icon
	private JLabel label1;																				// label for adding the image 
	private JButton bt1, bt2;																			// twoo button bt1=order and bt2=manage 
	private JPanel panel1;																				// variable for panel
	
	
	
	public SelectProfile() {																			// constructor of this class
		
		super("Select Profile");																		// set title of gui
		setLayout(null);																				// set bounds manually
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("select-icon2.png");							// set icon to title bar
        setIconImage(icon);																				// add to frame 
		
        icon1 = new ImageIcon("select-icon1.png");														// create object of ImageIcon and add an image 
        label1 = new JLabel(icon1);																		// add image to label 
        label1.setBounds(200, 10, 100, 100);															// set bounds to label
        add(label1);																					// add to frame 
        
        bt1 = new JButton("ORDER");																		// object of order button
        bt1.setBounds(100, 150, 300, 75);																// set bounds 
        add(bt1);																						// add to frame 
        
        bt2 = new JButton("MANAGE");																	// manage button object 
        bt2.setBounds(100, 250, 300, 75);																// set bounds
        add(bt2);																						// add frame
        
        panel1 = new JPanel();																			// panel object 
        panel1.setBackground(Color.DARK_GRAY);															// set panel color
        panel1.setBounds(0, 0, 500, 400);																// set bounds 
        add(panel1);																					// add to frame 
        
        bt1.addActionListener(this);																	// connect to ActionListener 
        bt2.addActionListener(this);																	// connect to ActionListener
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);													// add terminate program
		setSize(500, 400);																				// set frame size
		setResizable(false);																			// frame size not resizeable
		setLocationRelativeTo(null);																	// frame starts at middle of the screen
		setVisible(true);																				// make the gui visible
		
		
	}
	
	

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {														// actionPerformed method

		if(e.getSource() == bt1) {																		// checking for order button press
			setVisible(false);																			// set visibility false
			Thread t1 = new Thread(new Order());														// thread object created
            t1.start();																					// thread started
		}else if(e.getSource() == bt2) {																// checking for manage button press
			setVisible(false);																			// set visibility false
			Thread t2 = new Thread(new Login());														// t2 object created 
            t2.start();																					// t2 thread started
		}
		
		
	}

}
