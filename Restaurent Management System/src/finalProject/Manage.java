package finalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Manage extends JFrame implements ActionListener{																	// manage class 

	/**
	 * 
	 */

	private JPanel panel1;																										// variable for panel
	private JLabel labelOne;																									// variable for label - manage order
	private JLabel labelTwo;																									// variable fro label - enter number to delete order
	private JTable jt;																											// table variable to store data from database
	private  JTextField tf1;																									// take the input orderNumber to delete the order
	private JButton delete;																										// confirm delete button to delete the order
	private JButton exit;																										// button for exiting manage class
	private JScrollPane sp;																										// to scroll the table if it's to long
	
	static ArrayList<String> list0 = new ArrayList<String>();
	static ArrayList<String> list1 = new ArrayList<String>();																	// store temporary data from database
	
	private static String [][]row = new String[Order.orderNumber-1][25];
	private String column[] = {"Order Number","Beef Burger","Chicken Fry","Hotdog","French Fry","Sandwich",
							   "Pizza","Chicken Nuggets","Pasta","Beef Taco","Chocolate Cake","Cheese Cake",
							   "Pan Cake","SevenUP","CocaCola","Mirinda","Mountain Due","Mango Juice","Orange Juice",
							   "Coconut Juice","Ice Tea","Chocolate Milk","Strawberry Milk","Black Coffee","Milk Coffee"};		// table cloumn names
	
	public Manage() {																											// constructor of manage class
		
		super("Manage");																										// to set the title
		setLayout(null);																										// to set bounds manually
		
		Image icon = Toolkit.getDefaultToolkit().getImage("manage-icon.png");													// get title image 
        setIconImage(icon);																										// set the title image 
		
		labelOne = new JLabel("Manage Order");																					// set label Manage Orger 
		labelOne.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 25));															// to make font size larger, italic  and blod 
		labelOne.setBounds(675, 25, 200, 50);																					// set bounds for labelOne 
		add(labelOne);																											// add labelOne to frame
		
		jt = new JTable(row, column);																							// making object of jTable
		sp = new JScrollPane(jt);																								// add scrollPane with the jTable
		sp.setBounds(25, 100, 1450, 550);																						// add scrollPane to frame
		add(sp);
		
		labelTwo = new JLabel("Enter Order Number To Delete It : ");															// Entering labelTwo content 
		labelTwo.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 20));															// to make font size larger, italic  and blod 
		labelTwo.setBounds(25, 680, 300, 50);																					// set bounds of labelTwo
		add(labelTwo);																											// add labelTwo to frame
		
		tf1 = new JTextField(null,10);																							// it stores the orderNumber which needs to be deleted
		tf1.setBounds(330, 680, 100, 50);																						// set bounds of tf1 text field
		add(tf1);																												// add to frame
		
		delete = new JButton("CONFIRM DELETE");																					// making object of delete button and name it CONFIRM DELETE
		delete.setBounds(500, 680, 200, 50);																					// set bounds of delete button
		add(delete);																											// add to frame
		
		exit = new JButton("EXIT");																								// making object of exit button an name it EXIT
		exit.setBounds(1350, 680, 100, 50);																						// set bounds of exit button
		add(exit);																												// add to frame

		panel1 = new JPanel();																									// object of panel
		panel1.setBounds(0, 0, 1500, 800);																						// set bounds of panel
		panel1.setBackground(Color.GRAY);																						// set color of panel
		add(panel1);																											// add panel to frame
		
		exit.addActionListener(this);																							// exit button conection with actionListener
		delete.addActionListener(this);																							// delete button connection with actionListener
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);																			// add terminate option
		setSize(1500, 800);																										// set frame size
		setResizable(false);																									// frame size fixed
		setLocationRelativeTo(null);																							// frame starting location in the middle
		setVisible(true);																										// visible the frame 
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {																				// action performed method for this class

		if(e.getSource() == exit) {																								// checking press of exit button
			setVisible(false);																									// close this class gui
			new SelectProfile();																								// call selectProfile class
		}else if(e.getSource() == delete) {																						// checking press of delete button
			try {																												// check for error
				String str = tf1.getText();																						// store tf1 data to str variable
				int i = Integer.parseInt(str);																					// convert string variable str to integer variable i
				DbConnection.deleteData2(i);																					// pass the integer value to deleteData2 method in DbConnection class to delete data from database
			}catch (Exception ex) {																								// error handeling 
				JOptionPane.showMessageDialog(this, "INPUT IS EMPTY ... !");													// message output for error
			}
		}
	}
	
	
	static void arrayList1(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, 					// method arrayList1 for storing data in arrayList, it catches data passed from DbConnection.displayData1()
			   int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20,
			   int r21, int r22, int r23, int r24, int r25) {
		
		list0.add(Integer.toString(r1));
		
		list1.add(Integer.toString(r1));																						// adding 1st element of row
		list1.add(Integer.toString(r2));																						// adding 2nd element of row
		list1.add(Integer.toString(r3));																						// adding 3rd element of row
		list1.add(Integer.toString(r4));																						// adding 4th element of row
		list1.add(Integer.toString(r5));																						// adding 5th element of row
		list1.add(Integer.toString(r6));																						// adding 6th element of row
		list1.add(Integer.toString(r7));																						// adding 7th element of row
		list1.add(Integer.toString(r8));																						// adding 8th element of row
		list1.add(Integer.toString(r9));																						// adding 9th element of row
		list1.add(Integer.toString(r10));																						// adding 10th element of row
		list1.add(Integer.toString(r11));																						// adding 11th element of row
		list1.add(Integer.toString(r12));																						// adding 12th element of row	
		list1.add(Integer.toString(r13));																						// adding 13th element of row
		list1.add(Integer.toString(r14));																						// adding 14th element of row
		list1.add(Integer.toString(r15));																						// adding 15th element of row
		list1.add(Integer.toString(r16));																						// adding 16th element of row
		list1.add(Integer.toString(r17));																						// adding 17th element of row
		list1.add(Integer.toString(r18));																						// adding 18th element of row
		list1.add(Integer.toString(r19));																						// adding 19th element of row
		list1.add(Integer.toString(r20));																						// adding 20th element of row
		list1.add(Integer.toString(r21));																						// adding 21st element of row
		list1.add(Integer.toString(r22));																						// adding 22nd element of row
		list1.add(Integer.toString(r23));																						// adding 23rd element of row
		list1.add(Integer.toString(r24));																						// adding 24th element of row
		list1.add(Integer.toString(r25));																						// adding 25th element of row

	
	}

	static void display() {																										// display method to move data from arrayList1 to table data
		int k=0;																												// variable for counting row element number 
		try {																													// try block start
		for(int i=0; i<list0.size(); i+=1) {																					// fro loop for row
			for(int j=0; j<25; j+=1) {																							// for loop for column
				row[i][j]=list1.get(j+k);																						// inserting data to 2 dimentional array
			}
			k=k+25;																												// increment arrayList index row after row
		}																														// try block close
		}catch(Exception ex) {																									// catch block start
			JOptionPane.showMessageDialog(null, "Note : After every new order close the application \n"
											  + "and restart it to get all the data ... !");
			deleteArrayList();																									// call call deleteArrayList method
		}																														// catch block close
		
		deleteArrayList();																										// call call deleteArrayList method
		
	}
	
	static void deleteArrayList() {																								// deleteArrayList method start
		for(int i=list0.size()-1; i>=0; i-=1) {																					// for loop array length of list0
			list0.remove(i);																									// remove all elements from arrayList list0
		}
		for(int i=list1.size()-1; i>=0; i-=1) {																					// for loop array length of list1
			list1.remove(i);																									// remove all elements from arrayList list1
		}
	}
	

}
