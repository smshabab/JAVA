package finalProject;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Order extends JFrame implements ActionListener, Runnable{
	
	
	
	/**
	 * all the variable for this class like button,
	 * ImageIcon, Scrollpane, panel etc are here....
	 */


	private JLabel labelOne, labelTwo, labelThree, labelFour, labelFive;
	
	private ImageIcon fIcon1, fIcon2, fIcon3, fIcon4, fIcon5, fIcon6, fIcon7, fIcon8, fIcon9, fIcon10, fIcon11, fIcon12;
	private JButton fbt1, fbt2, fbt3, fbt4, fbt5, fbt6, fbt7, fbt8, fbt9, fbt10, fbt11, fbt12;
	private ImageIcon dIcon1, dIcon2, dIcon3, dIcon4, dIcon5, dIcon6, dIcon7, dIcon8, dIcon9, dIcon10, dIcon11, dIcon12;
	private JButton dbt1, dbt2, dbt3, dbt4, dbt5, dbt6, dbt7, dbt8, dbt9, dbt10, dbt11, dbt12;
	
	
	private JScrollPane tasp;
	private JTextArea rta1;
	private JTextField rtf2, rtf3;
	private JButton rbt1,rbt2;
	
	
	
	private JPanel panelOne, panelTwo, panelThree;
	
	
	public static int totalCost = 0;
	
	private static int food1Cost = 5;
	private static int food2Cost = 4;
	private static int food3Cost = 2;
	private static int food4Cost = 1;
	private static int food5Cost = 2;
	private static int food6Cost = 13;
	private static int food7Cost = 1;
	private static int food8Cost = 7;
	private static int food9Cost = 2;
	private static int food10Cost = 2;
	private static int food11Cost = 2;
	private static int food12Cost = 2;
	
	private static int countf1 = 0;
	private static int countf2 = 0;
	private static int countf3 = 0;
	private static int countf4 = 0;
	private static int countf5 = 0;
	private static int countf6 = 0;
	private static int countf7 = 0;
	private static int countf8 = 0;
	private static int countf9 = 0;
	private static int countf10 = 0;
	private static int countf11 = 0;
	private static int countf12 = 0;
	
	private static int countd1 = 0;
	private static int countd2 = 0;
	private static int countd3 = 0;
	private static int countd4 = 0;
	private static int countd5 = 0;
	private static int countd6 = 0;
	private static int countd7 = 0;
	private static int countd8 = 0;
	private static int countd9 = 0;
	private static int countd10 = 0;
	private static int countd11 = 0;
	private static int countd12 = 0;
	
	private static int drink1Cost = 1;
	private static int drink2Cost = 1;
	private static int drink3Cost = 1;
	private static int drink4Cost = 1;
	private static int drink5Cost = 5;
	private static int drink6Cost = 5;
	private static int drink7Cost = 2;
	private static int drink8Cost = 2;
	private static int drink9Cost = 2;
	private static int drink10Cost = 2;
	private static int drink11Cost = 3;
	private static int drink12Cost = 4;
	
	private static int itemNumber = 1;
	
	public static int orderNumber = 1;
	
	static String text;
	
	private ImageIcon deleteIcon;
	private JButton fdbt1, fdbt2, fdbt3, fdbt4, fdbt5, fdbt6, fdbt7, fdbt8, fdbt9, fdbt10, fdbt11, fdbt12;
	private JButton ddbt1, ddbt2, ddbt3, ddbt4, ddbt5, ddbt6, ddbt7, ddbt8, ddbt9, ddbt10, ddbt11, ddbt12;
	
	
	public Order() {																						// constructor
		super("Order");
	}
	
	
	public void run() {																						// thread t1 starts this run method
		
		try {
			
			setLayout(null);
			
			Image icon = Toolkit.getDefaultToolkit().getImage("order-icon.png");
	        setIconImage(icon);
			
	        
	        labelOne = new JLabel("SELECT FOOD");															// lable for select food
	        labelOne.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 20));									// increase the size of font 
	        labelOne.setBounds(185, 25, 200, 50);															// set bounds
	        add(labelOne);																					// add to frame 
	        
	        deleteIcon = new ImageIcon("single-delete-icon.png");											// add image to object 
	        fdbt1 = new JButton(deleteIcon);																// add image to food1 delete button
	        fdbt1.setBounds(10, 130, 40, 40);																// add bounds 
	        add(fdbt1);																						// add to frame 
	        
	        fIcon1 = new ImageIcon("fIcon1.png");															
	        fbt1 = new JButton(fIcon1);																		// food1 add button
	        fbt1.setBounds(50, 100, 100, 100);
	        add(fbt1);
	        
	        fdbt2 = new JButton(deleteIcon);
	        fdbt2.setBounds(160, 130, 40, 40);
	        add(fdbt2);
	        
	        fIcon2 = new ImageIcon("fIcon2.png");
	        fbt2 = new JButton(fIcon2);
	        fbt2.setBounds(200, 100, 100, 100);
	        add(fbt2);	
	        
	        fdbt3 = new JButton(deleteIcon);
	        fdbt3.setBounds(310, 130, 40, 40);
	        add(fdbt3);
	        
	        fIcon3 = new ImageIcon("fIcon3.png");
	        fbt3 = new JButton(fIcon3);
	        fbt3.setBounds(350, 100, 100, 100);
	        add(fbt3);
	        
	        fdbt4 = new JButton(deleteIcon);
	        fdbt4.setBounds(10, 280, 40, 40);
	        add(fdbt4);
	        
	        fIcon4 = new ImageIcon("fIcon4.png");
	        fbt4 = new JButton(fIcon4);
	        fbt4.setBounds(50, 250, 100, 100);
	        add(fbt4);
	        
	        fdbt5 = new JButton(deleteIcon);
	        fdbt5.setBounds(160, 280, 40, 40);
	        add(fdbt5);
	        
	        fIcon5 = new ImageIcon("fIcon5.png");
	        fbt5 = new JButton(fIcon5);
	        fbt5.setBounds(200, 250, 100, 100);
	        add(fbt5);
	        
	        fdbt6 = new JButton(deleteIcon);
	        fdbt6.setBounds(310, 280, 40, 40);
	        add(fdbt6);
	        
	        fIcon6 = new ImageIcon("fIcon6.png");
	        fbt6 = new JButton(fIcon6);
	        fbt6.setBounds(350, 250, 100, 100);
	        add(fbt6);
	        
	        fdbt7 = new JButton(deleteIcon);
	        fdbt7.setBounds(10, 430, 40, 40);
	        add(fdbt7);
	        
	        fIcon7 = new ImageIcon("fIcon7.png");
	        fbt7 = new JButton(fIcon7);
	        fbt7.setBounds(50, 400, 100, 100);
	        add(fbt7);
	        
	        fdbt8 = new JButton(deleteIcon);
	        fdbt8.setBounds(160, 430, 40, 40);
	        add(fdbt8);
	        
	        fIcon8 = new ImageIcon("fIcon8.png");
	        fbt8 = new JButton(fIcon8);
	        fbt8.setBounds(200, 400, 100, 100);
	        add(fbt8);
	        
	        fdbt9 = new JButton(deleteIcon);
	        fdbt9.setBounds(310, 430, 40, 40);
	        add(fdbt9);
	        
	        fIcon9 = new ImageIcon("fIcon9.png");
	        fbt9 = new JButton(fIcon9);
	        fbt9.setBounds(350, 400, 100, 100);
	        add(fbt9);
	        
	        fdbt10 = new JButton(deleteIcon);
	        fdbt10.setBounds(10, 580, 40, 40);
	        add(fdbt10);
	        
	        fIcon10 = new ImageIcon("fIcon10.png");
	        fbt10 = new JButton(fIcon10);
	        fbt10.setBounds(50, 550, 100, 100);
	        add(fbt10);
	        
	        fdbt11 = new JButton(deleteIcon);
	        fdbt11.setBounds(160, 580, 40, 40);
	        add(fdbt11);
	        
	        fIcon11 = new ImageIcon("fIcon11.png");
	        fbt11 = new JButton(fIcon11);
	        fbt11.setBounds(200, 550, 100, 100);
	        add(fbt11);
	        
	        fdbt12 = new JButton(deleteIcon);
	        fdbt12.setBounds(310, 580, 40, 40);
	        add(fdbt12);
	        
	        fIcon12 = new ImageIcon("fIcon12.png");
	        fbt12 = new JButton(fIcon12);
	        fbt12.setBounds(350, 550, 100, 100);
	        add(fbt12);
	        
	        labelTwo = new JLabel("SELECT DRINKS");
	        labelTwo.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 20));
	        labelTwo.setBounds(665, 25, 200, 50);
	        add(labelTwo);
	        
	        ddbt1 = new JButton(deleteIcon);
	        ddbt1.setBounds(510, 130, 40, 40);
	        add(ddbt1);
	        
	        dIcon1 = new ImageIcon("dIcon1.png");
	        dbt1 = new JButton(dIcon1);
	        dbt1.setBounds(550, 100, 100, 100);
	        add(dbt1);
	        
	        ddbt2 = new JButton(deleteIcon);
	        ddbt2.setBounds(660, 130, 40, 40);
	        add(ddbt2);
	        
	        dIcon2 = new ImageIcon("dIcon2.png");
	        dbt2 = new JButton(dIcon2);
	        dbt2.setBounds(700, 100, 100, 100);
	        add(dbt2);
	        
	        ddbt3 = new JButton(deleteIcon);
	        ddbt3.setBounds(810, 130, 40, 40);
	        add(ddbt3);
	        
	        dIcon3 = new ImageIcon("dIcon3.png");
	        dbt3 = new JButton(dIcon3);
	        dbt3.setBounds(850, 100, 100, 100);
	        add(dbt3);
	        
	        ddbt4 = new JButton(deleteIcon);
	        ddbt4.setBounds(510, 280, 40, 40);
	        add(ddbt4);
	        
	        dIcon4 = new ImageIcon("dIcon4.png");
	        dbt4 = new JButton(dIcon4);
	        dbt4.setBounds(550, 250, 100, 100);
	        add(dbt4);
	        
	        ddbt5 = new JButton(deleteIcon);
	        ddbt5.setBounds(660, 280, 40, 40);
	        add(ddbt5);
	        
	        dIcon5 = new ImageIcon("dIcon5.png");
	        dbt5 = new JButton(dIcon5);
	        dbt5.setBounds(700, 250, 100, 100);
	        add(dbt5);
	        
	        ddbt6 = new JButton(deleteIcon);
	        ddbt6.setBounds(810, 280, 40, 40);
	        add(ddbt6);
	        
	        dIcon6 = new ImageIcon("dIcon6.png");
	        dbt6 = new JButton(dIcon6);
	        dbt6.setBounds(850, 250, 100, 100);
	        add(dbt6);
	        
	        ddbt7 = new JButton(deleteIcon);
	        ddbt7.setBounds(510, 430, 40, 40);
	        add(ddbt7);
	        
	        dIcon7 = new ImageIcon("dIcon7.png");
	        dbt7 = new JButton(dIcon7);
	        dbt7.setBounds(550, 400, 100, 100);
	        add(dbt7);
	        
	        ddbt8 = new JButton(deleteIcon);
	        ddbt8.setBounds(660, 430, 40, 40);
	        add(ddbt8);
	        
	        dIcon8 = new ImageIcon("dIcon8.png");
	        dbt8 = new JButton(dIcon8);
	        dbt8.setBounds(700, 400, 100, 100);
	        add(dbt8);
	        
	        ddbt9 = new JButton(deleteIcon);
	        ddbt9.setBounds(810, 430, 40, 40);
	        add(ddbt9);
	        
	        dIcon9 = new ImageIcon("dIcon9.png");
	        dbt9 = new JButton(dIcon9);
	        dbt9.setBounds(850, 400, 100, 100);
	        add(dbt9);
	        
	        ddbt10 = new JButton(deleteIcon);
	        ddbt10.setBounds(510, 580, 40, 40);
	        add(ddbt10);
	        
	        dIcon10 = new ImageIcon("dIcon10.png");
	        dbt10 = new JButton(dIcon10);
	        dbt10.setBounds(550, 550, 100, 100);
	        add(dbt10);
	        
	        ddbt11 = new JButton(deleteIcon);
	        ddbt11.setBounds(660, 580, 40, 40);
	        add(ddbt11);
	        
	        dIcon11 = new ImageIcon("dIcon11.png");
	        dbt11 = new JButton(dIcon11);
	        dbt11.setBounds(700, 550, 100, 100);
	        add(dbt11);
	        
	        ddbt12 = new JButton(deleteIcon);
	        ddbt12.setBounds(810, 580, 40, 40);
	        add(ddbt12);
	        
	        dIcon12 = new ImageIcon("dIcon12.png");
	        dbt12 = new JButton(dIcon12);
	        dbt12.setBounds(850, 550, 100, 100);
	        add(dbt12);
	        
	        
	        labelThree = new JLabel("RECIPT");
	        labelThree.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 20));
	        labelThree.setBounds(1200, 25, 200, 50);
	        add(labelThree);
	        
	        rta1 = new JTextArea("");
	        tasp = new JScrollPane(rta1);
	        tasp.setBounds(1050, 100, 400, 450);
	        add(tasp);
	        
	        labelFour = new JLabel("ORDER  NO : ");
	        labelFour.setBounds(1050, 560, 100, 50);
	        add(labelFour);
	        
	        rtf2 = new JTextField(null, 5);
	        DbConnection.searchData2();
	        String str1 = Integer.toString(orderNumber);
	        rtf2.setText(str1);
	        rtf2.setBounds(1150, 560, 100, 50);
	        add(rtf2);
	        
	        
	        labelFive = new JLabel("TOTAL COST : ");
	        labelFive.setBounds(1050, 620, 100, 50);
	        add(labelFive);
	        
	        rtf3 = new JTextField(null, 5);
	        rtf3.setBounds(1150, 620, 100, 50);
	        add(rtf3);
	        
	        
	        
	        rbt1 = new JButton("Cancel Order");
	        rbt1.setBounds(1300, 620, 150, 50);
	        add(rbt1);
	        
	        rbt2 = new JButton("Confirm Order");
	        rbt2.setBounds(1300, 560, 150, 50);
	        add(rbt2);
	        
	        panelOne = new JPanel();
	        panelOne.setBounds(0, 0, 500, 800);
	        panelOne.setBackground(Color.CYAN);
	        add(panelOne);
	        
	        
	        panelTwo = new JPanel();
	        panelTwo.setBounds(500, 0, 500, 800);
	        panelTwo.setBackground(Color.YELLOW);
	        add(panelTwo);
	        
	        panelThree = new JPanel();
	        panelThree.setBounds(1000, 0, 500, 800);
	        panelThree.setBackground(Color.PINK);
	        add(panelThree);
	        
	        
	        
	        
	        
	        fbt1.addActionListener(this);
	        fbt2.addActionListener(this);
	        fbt3.addActionListener(this);
	        fbt4.addActionListener(this);
	        fbt5.addActionListener(this);
	        fbt6.addActionListener(this);
	        fbt7.addActionListener(this);
	        fbt8.addActionListener(this);
	        fbt9.addActionListener(this);
	        fbt10.addActionListener(this);
	        fbt11.addActionListener(this);
	        fbt12.addActionListener(this);
	        
	        dbt1.addActionListener(this);
	        dbt2.addActionListener(this);
	        dbt3.addActionListener(this);
	        dbt4.addActionListener(this);
	        dbt5.addActionListener(this);
	        dbt6.addActionListener(this);
	        dbt7.addActionListener(this);
	        dbt8.addActionListener(this);
	        dbt9.addActionListener(this);
	        dbt10.addActionListener(this);
	        dbt11.addActionListener(this);
	        dbt12.addActionListener(this);
	        
	        fdbt1.addActionListener(this);
	        fdbt2.addActionListener(this);
	        fdbt3.addActionListener(this);
	        fdbt4.addActionListener(this);
	        fdbt5.addActionListener(this);
	        fdbt6.addActionListener(this);
	        fdbt7.addActionListener(this);
	        fdbt8.addActionListener(this);
	        fdbt9.addActionListener(this);
	        fdbt10.addActionListener(this);
	        fdbt11.addActionListener(this);
	        fdbt12.addActionListener(this);
	        
	        ddbt1.addActionListener(this);
	        ddbt2.addActionListener(this);
	        ddbt3.addActionListener(this);
	        ddbt4.addActionListener(this);
	        ddbt5.addActionListener(this);
	        ddbt6.addActionListener(this);
	        ddbt7.addActionListener(this);
	        ddbt8.addActionListener(this);
	        ddbt9.addActionListener(this);
	        ddbt10.addActionListener(this);
	        ddbt11.addActionListener(this);
	        ddbt12.addActionListener(this);
	        
	        rbt1.addActionListener(this);
	        rbt2.addActionListener(this);
	        
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(1500, 750);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
			
		}catch(Exception ex) {
			System.out.println("Error in run - order");
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {																	// actionPerformed class
		
		
		if(e.getSource() == rbt1) {																					// checking cancle button press
			
			setVisible(false);
			totalCost = 0;
			food1Cost = 5;	
			food2Cost = 4;
			food3Cost = 2;
			food4Cost = 1;
			food5Cost = 2;
			food6Cost = 13;
			food7Cost = 1;
			food8Cost = 7;
			food9Cost = 2;
			food10Cost = 2;
			food11Cost = 2;
			food12Cost = 2;
			drink1Cost = 1;
			drink2Cost = 1;
			drink3Cost = 1;
			drink4Cost = 1;
			drink5Cost = 5;
			drink6Cost = 5;
			drink7Cost = 2;
			drink8Cost = 2;
			drink9Cost = 2;
			drink10Cost = 2;
			drink11Cost = 3;
			drink12Cost = 4;
			countf1 = 0;
			countf2 = 0;
			countf3 = 0;
			countf4 = 0;
			countf5 = 0;
			countf6 = 0;
			countf7 = 0;
			countf8 = 0;
			countf9 = 0;
			countf10 = 0;
			countf11 = 0;
			countf12 = 0;
			countd1 = 0;
			countd2 = 0;
			countd3 = 0;
			countd4 = 0;
			countd5 = 0;
			countd6 = 0;
			countd7 = 0;
			countd8 = 0;
			countd9 = 0;
			countd10 = 0;
			countd11 = 0;
			countd12 = 0;
			itemNumber = 1;
			new SelectProfile();
			
		}else if(e.getSource() == rbt2) {
			
			if(totalCost != 0) {
				
			text = rta1.getText();
			JOptionPane.showMessageDialog(this, text+"\nTotal Cost : "+totalCost+" $\nPaid Confirmed");
			DbConnection.searchData2();
			new PdfGenerator();
			orderDB(orderNumber, countf1, countf2, countf3, countf4, countf5, countf6, countf7, countf8, countf9, countf10, countf11, countf12,
								 countd1, countd2, countd3, countd4, countd5, countd6, countd7, countd8, countd9, countd10, countd11, countd12);
			
			setVisible(false);
			totalCost = 0;
			food1Cost = 5;	
			food2Cost = 4;
			food3Cost = 2;
			food4Cost = 1;
			food5Cost = 2;
			food6Cost = 13;
			food7Cost = 1;
			food8Cost = 7;
			food9Cost = 2;
			food10Cost = 2;
			food11Cost = 2;
			food12Cost = 2;
			drink1Cost = 1;
			drink2Cost = 1;
			drink3Cost = 1;
			drink4Cost = 1;
			drink5Cost = 5;
			drink6Cost = 5;
			drink7Cost = 2;
			drink8Cost = 2;
			drink9Cost = 2;
			drink10Cost = 2;
			drink11Cost = 3;
			drink12Cost = 4;
			itemNumber = 1;
			countf1 = 0;
			countf2 = 0;
			countf3 = 0;
			countf4 = 0;
			countf5 = 0;
			countf6 = 0;
			countf7 = 0;
			countf8 = 0;
			countf9 = 0;
			countf10 = 0;
			countf11 = 0;
			countf12 = 0;
			countd1 = 0;
			countd2 = 0;
			countd3 = 0;
			countd4 = 0;
			countd5 = 0;
			countd6 = 0;
			countd7 = 0;
			countd8 = 0;
			countd9 = 0;
			countd10 = 0;
			countd11 = 0;
			countd12 = 0;
			new SelectProfile();
			}else {
				JOptionPane.showMessageDialog(this, "NO ITEM SELECTED ... !");
			}
		
		}else if(e.getSource() == fbt1) {																								//adding food
				
			totalCost = totalCost + food1Cost;
			rta1.setText(rta1.getText()+itemNumber+". Beef Burger added"+"		"+"   Cost : "+food1Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf1++;
			
		}else if(e.getSource() == fbt2) {
			
			totalCost = totalCost + food2Cost;
			rta1.setText(rta1.getText()+itemNumber+". Chicken Fry added"+"		"+"   Cost : "+food2Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf2++;
			
		}else if(e.getSource() == fbt3) {
			
			totalCost = totalCost + food3Cost;
			rta1.setText(rta1.getText()+itemNumber+". Hotdog added"+"		"+"   Cost : "+food3Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf3++;
			
		}else if(e.getSource() == fbt4) {
			
			totalCost = totalCost + food4Cost;
			rta1.setText(rta1.getText()+itemNumber+". French Fry added"+"		"+"   Cost : "+food4Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf4++;
			
		}else if(e.getSource() == fbt5) {
			
			totalCost = totalCost + food5Cost;
			rta1.setText(rta1.getText()+itemNumber+". Sandwich added"+"		"+"   Cost : "+food5Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf5++;
			
		}else if(e.getSource() == fbt6) {
			
			totalCost = totalCost + food6Cost;
			rta1.setText(rta1.getText()+itemNumber+". Pizza added"+"	 	 	"+"   Cost : "+food6Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf6++;
			
		}else if(e.getSource() == fbt7) {
			
			totalCost = totalCost + food7Cost;
			rta1.setText(rta1.getText()+itemNumber+". Chicken Nuggets added"+"		"+"   Cost : "+food7Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf7++;
			
		}else if(e.getSource() == fbt8) {
			
			totalCost = totalCost + food8Cost;
			rta1.setText(rta1.getText()+itemNumber+". Pasta added"+"			"+"   Cost : "+food8Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf8++;
			
		}else if(e.getSource() == fbt9) {
			
			totalCost = totalCost + food9Cost;
			rta1.setText(rta1.getText()+itemNumber+". Beef Taco added"+"		"+"   Cost : "+food9Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf9++;
			
		}else if(e.getSource() == fbt10) {
			
			totalCost = totalCost + food10Cost;
			rta1.setText(rta1.getText()+itemNumber+". Chocolate Cake added"+"		"+"   Cost : "+food10Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf10++;
			
		}else if(e.getSource() == fbt11) {
			
			totalCost = totalCost + food11Cost;
			rta1.setText(rta1.getText()+itemNumber+". Cheese Cake added"+"		"+"   Cost : "+food11Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf11++;
			
		}else if(e.getSource() == fbt12) {
			
			totalCost = totalCost + food12Cost;
			rta1.setText(rta1.getText()+itemNumber+". Pan Cake added"+"		"+"   Cost : "+food12Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countf12++;
			
		}else if(e.getSource() == dbt1) {
		
			totalCost = totalCost + drink1Cost;
			rta1.setText(rta1.getText()+itemNumber+". Sevenup added"+"		"+"   Cost : "+drink1Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd1++;
			
		}else if(e.getSource() == dbt2) {
			
			totalCost = totalCost + drink2Cost;
			rta1.setText(rta1.getText()+itemNumber+". CocaCola added"+"		"+"   Cost : "+drink2Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd2++;
			
		}else if(e.getSource() == dbt3) {
			
			totalCost = totalCost + drink3Cost;
			rta1.setText(rta1.getText()+itemNumber+". Mirinda added"+"		"+"   Cost : "+drink3Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd3++;
			
		}else if(e.getSource() == dbt4) {
			
			totalCost = totalCost + drink4Cost;
			rta1.setText(rta1.getText()+itemNumber+". Mountain Due added"+"		"+"   Cost : "+drink4Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd4++;
			
		}else if(e.getSource() == dbt5) {
			
			totalCost = totalCost + drink5Cost;
			rta1.setText(rta1.getText()+itemNumber+". Mango Juice added"+"		"+"   Cost : "+drink5Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd5++;
			
		}else if(e.getSource() == dbt6) {
			
			totalCost = totalCost + drink6Cost;
			rta1.setText(rta1.getText()+itemNumber+". Orange Juice added"+"		"+"   Cost : "+drink6Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd6++;
			
		}else if(e.getSource() == dbt7) {
			
			totalCost = totalCost + drink7Cost;
			rta1.setText(rta1.getText()+itemNumber+". Coconut Juice added"+"		"+"   Cost : "+drink7Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd7++;
			
		}else if(e.getSource() == dbt8) {
			
			totalCost = totalCost + drink8Cost;
			rta1.setText(rta1.getText()+itemNumber+". Ice Tea added"+"		"+"   Cost : "+drink8Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd8++;
			
		}else if(e.getSource() == dbt9) {
			
			totalCost = totalCost + drink9Cost;
			rta1.setText(rta1.getText()+itemNumber+". Chocolate Milk added"+"		"+"   Cost : "+drink9Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd9++;
			
		}else if(e.getSource() == dbt10) {
			
			totalCost = totalCost + drink10Cost;
			rta1.setText(rta1.getText()+itemNumber+". Strawberry Milk added"+"		"+"   Cost : "+drink10Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd10++;
			
		}else if(e.getSource() == dbt11) {
			
			totalCost = totalCost + drink11Cost;
			rta1.setText(rta1.getText()+itemNumber+". Black Coffee added"+"		"+"   Cost : "+drink11Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd11++;
			
		}else if(e.getSource() == dbt12) {
			
			totalCost = totalCost + drink12Cost;
			rta1.setText(rta1.getText()+itemNumber+". Milk Coffee added"+"		"+"   Cost : "+drink12Cost+" $\n");
			rtf3.setText(totalCost+" $");
			itemNumber++;
			countd12++;
			
		}else if(e.getSource() == fdbt1) {																										// food1 delete button
			if(countf1 == 0) {
				JOptionPane.showMessageDialog(this, "Beef Burger count = 0");
			}else {
				totalCost = totalCost - food1Cost;
				rta1.setText(rta1.getText()+itemNumber+". Beef Burger deleted-1"+"		"+"   Cost : -"+food1Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf1--;
			}
		}else if(e.getSource() == fdbt2) {
			if(countf2 == 0) {
				JOptionPane.showMessageDialog(this, "Chicken Fry count = 0");
			}else {
				totalCost = totalCost - food2Cost;
				rta1.setText(rta1.getText()+itemNumber+". Chicken Fry deleted-1"+"		"+"   Cost : -"+food2Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf2--;
			}
		}else if(e.getSource() == fdbt3) {
			if(countf3 == 0) {
				JOptionPane.showMessageDialog(this, "Hotdog count = 0");
			}else {
				totalCost = totalCost - food3Cost;
				rta1.setText(rta1.getText()+itemNumber+". Hotdog deleted-1"+"		"+"   Cost : -"+food3Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf3--;
			}
		}else if(e.getSource() == fdbt4) {
			if(countf4 == 0) {
				JOptionPane.showMessageDialog(this, "French Fry count = 0");
			}else {
				totalCost = totalCost - food4Cost;
				rta1.setText(rta1.getText()+itemNumber+". French Fry deleted-1"+"		"+"   Cost : -"+food4Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf4--;
			}
		}else if(e.getSource() == fdbt5) {
			if(countf5 == 0) {
				JOptionPane.showMessageDialog(this, "Sandwich count = 0");
			}else {
				totalCost = totalCost - food5Cost;
				rta1.setText(rta1.getText()+itemNumber+". Sandwich deleted-1"+"		"+"   Cost : -"+food5Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf5--;
			}
		}else if(e.getSource() == fdbt6) {
			if(countf6 == 0) {
				JOptionPane.showMessageDialog(this, "Pizza count = 0");
			}else {
				totalCost = totalCost - food6Cost;
				rta1.setText(rta1.getText()+itemNumber+". Pizza deleted-1"+"		"+"   Cost : -"+food6Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf6--;
			}
		}else if(e.getSource() == fdbt7) {
			if(countf7 == 0) {
				JOptionPane.showMessageDialog(this, "Chicken Nuggets count = 0");
			}else {
				totalCost = totalCost - food7Cost;
				rta1.setText(rta1.getText()+itemNumber+". Chicken Nuggets deleted-1"+"		"+"   Cost : -"+food7Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf7--;
			}
		}else if(e.getSource() == fdbt8) {
			if(countf8 == 0) {
				JOptionPane.showMessageDialog(this, "Pasta count = 0");
			}else {
				totalCost = totalCost - food8Cost;
				rta1.setText(rta1.getText()+itemNumber+". Pasta deleted-1"+"		"+"   Cost : -"+food8Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf8--;
			}
		}else if(e.getSource() == fdbt9) {
			if(countf9 == 0) {
				JOptionPane.showMessageDialog(this, "Beef Taco count = 0");
			}else {
				totalCost = totalCost - food9Cost;
				rta1.setText(rta1.getText()+itemNumber+". Beef Taco deleted-1"+"		"+"   Cost : -"+food9Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf9--;
			}
		}else if(e.getSource() == fdbt10) {
			if(countf10 == 0) {
				JOptionPane.showMessageDialog(this, "Chocolate Cake count = 0");
			}else {
				totalCost = totalCost - food10Cost;
				rta1.setText(rta1.getText()+itemNumber+". Chocolate Cake deleted-1"+"		"+"   Cost : -"+food10Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf10--;
			}
		}else if(e.getSource() == fdbt11) {
			if(countf11 == 0) {
				JOptionPane.showMessageDialog(this, "Cheese Cake count = 0");
			}else {
				totalCost = totalCost - food11Cost;
				rta1.setText(rta1.getText()+itemNumber+". Cheese Cake deleted-1"+"		"+"   Cost : -"+food11Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf11--;
			}
		}else if(e.getSource() == fdbt12) {
			if(countf12 == 0) {
				JOptionPane.showMessageDialog(this, "Pan Cake count = 0");
			}else {
				totalCost = totalCost - food12Cost;
				rta1.setText(rta1.getText()+itemNumber+". Pan Cake deleted-1"+"		"+"   Cost : -"+food12Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countf12--;
			}
		}else if(e.getSource() == ddbt1) {
			if(countd1 == 0) {
				JOptionPane.showMessageDialog(this, "SevenUP count = 0");
			}else {
				totalCost = totalCost - drink1Cost;
				rta1.setText(rta1.getText()+itemNumber+". SevenUP deleted-1"+"		"+"   Cost : -"+drink1Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd1--;
			}
		}else if(e.getSource() == ddbt2) {
			if(countd2 == 0) {
				JOptionPane.showMessageDialog(this, "CocaCola count = 0");
			}else {
				totalCost = totalCost - drink2Cost;
				rta1.setText(rta1.getText()+itemNumber+". CocaCola deleted-1"+"		"+"   Cost : -"+drink2Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd2--;
			}
		}else if(e.getSource() == ddbt3) {
			if(countd3 == 0) {
				JOptionPane.showMessageDialog(this, "Mirinda count = 0");
			}else {
				totalCost = totalCost - drink3Cost;
				rta1.setText(rta1.getText()+itemNumber+". Mirinda deleted-1"+"		"+"   Cost : -"+drink3Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd3--;
			}
		}else if(e.getSource() == ddbt4) {
			if(countd4 == 0) {
				JOptionPane.showMessageDialog(this, "Mountain Due count = 0");
			}else {
				totalCost = totalCost - drink4Cost;
				rta1.setText(rta1.getText()+itemNumber+". Mountain Due deleted-1"+"		"+"   Cost : -"+drink4Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd4--;
			}
		}else if(e.getSource() == ddbt5) {
			if(countd5 == 0) {
				JOptionPane.showMessageDialog(this, "Mango Juice count = 0");
			}else {
				totalCost = totalCost - drink5Cost;
				rta1.setText(rta1.getText()+itemNumber+". Mango Juice deleted-1"+"		"+"   Cost : -"+drink5Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd5--;
			}
		}else if(e.getSource() == ddbt6) {
			if(countd6 == 0) {
				JOptionPane.showMessageDialog(this, "Orange Juice count = 0");
			}else {
				totalCost = totalCost - drink6Cost;
				rta1.setText(rta1.getText()+itemNumber+". Orange Juice deleted-1"+"		"+"   Cost : -"+drink6Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd6--;
			}
		}else if(e.getSource() == ddbt7) {
			if(countd7 == 0) {
				JOptionPane.showMessageDialog(this, "Coconut Juice count = 0");
			}else {
				totalCost = totalCost - drink7Cost;
				rta1.setText(rta1.getText()+itemNumber+". Coconut Juice deleted-1"+"		"+"   Cost : -"+drink7Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd7--;
			}
		}else if(e.getSource() == ddbt8) {
			if(countd8 == 0) {
				JOptionPane.showMessageDialog(this, "Ice Tea count = 0");
			}else {
				totalCost = totalCost - drink8Cost;
				rta1.setText(rta1.getText()+itemNumber+". Ice Tea deleted-1"+"		"+"   Cost : -"+drink8Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd8--;
			}
		}else if(e.getSource() == ddbt9) {
			if(countd9 == 0) {
				JOptionPane.showMessageDialog(this, "Chocolate Milk count = 0");
			}else {
				totalCost = totalCost - drink9Cost;
				rta1.setText(rta1.getText()+itemNumber+". Chocolate Milk deleted-1"+"		"+"   Cost : -"+drink9Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd9--;
			}
		}else if(e.getSource() == ddbt10) {
			if(countd10 == 0) {
				JOptionPane.showMessageDialog(this, "Strawberry Milk count = 0");
			}else {
				totalCost = totalCost - drink10Cost;
				rta1.setText(rta1.getText()+itemNumber+". Strawberry Milk deleted-1"+"		"+"   Cost : -"+drink10Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd10--;
			}
		}else if(e.getSource() == ddbt11) {
			if(countd11 == 0) {
				JOptionPane.showMessageDialog(this, "Black Coffee count = 0");
			}else {
				totalCost = totalCost - drink11Cost;
				rta1.setText(rta1.getText()+itemNumber+". Black Coffee deleted-1"+"		"+"   Cost : -"+drink11Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd11--;
			}
		}else if(e.getSource() == ddbt12) {
			if(countd12 == 0) {
				JOptionPane.showMessageDialog(this, "Milk Coffee count = 0");
			}else {
				totalCost = totalCost - drink12Cost;
				rta1.setText(rta1.getText()+itemNumber+". Milk Coffee deleted-1"+"		"+"   Cost : -"+drink12Cost+" $\n");
				rtf3.setText(totalCost+" $");
				itemNumber++;
				countd12--;
			}
		}
		
		
		
	}

	private void orderDB(int on, int f1, int f2, int f3, int f4, int f5, int f6, int f7, int f8, int f9, int f10, int f11, int f12, int d1, int d2, int d3,
						 int d4, int d5, int d6, int d7, int d8, int d9, int d10, int d11, int d12) {																//catch data trown by confirm button part
		
		DbConnection.insertData2(on, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12);							// send data to database
	
	}
	

	
}
