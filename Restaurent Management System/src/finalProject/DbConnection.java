package finalProject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class DbConnection {
	
	public static void Connection() {         
	    Connection conn = null;
	    try {                   
	        String url = "jdbc:sqlite:C:/sqlite/db/rms.db";                     
	        conn = DriverManager.getConnection(url);                          
	        System.out.println("Connected!");
	    } catch (SQLException e) {             
	        System.out.println(e.getMessage());         
	    } finally {             
	        try {                 
	            if (conn != null) {                     
	                conn.close();                 
	            }             
	        } catch (SQLException ex) {                 
	            System.out.println(ex.getMessage());             
	        }         
	    }     
	    }
	
	public static void createDB1(String fileName) {
		 String url = "jdbc:sqlite:C:/sqlite/db/" + fileName;           
		 try (Connection conn = DriverManager.getConnection(url)) {             
			 if (conn != null) {                 
				 DatabaseMetaData meta = conn.getMetaData();                 
				 System.out.println("The driver name is " + meta.getDriverName());                 
				 System.out.println("A new database has been created.");             
				 }           
			 } catch (SQLException e) {             
				 System.out.println(e.getMessage()); 
	        }
	}
	
	public static void createTable1() {
		      
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "create table login(id integer, password integer, code integer);";      
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			stmt.execute(sql);         
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
	}
	
	public static void createTable2() {
	      
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "create table orderTable(orderNumber int, beefBurger int, chickenFry int, "
				+ "hotdog int, frenchFry int, sandwich int, pizza int, chickenNuggets int, "
				+ "pasta int, beefTaco int, chocolateCake int, cheeseCake int, panCake int, "
				+ "sevenup int, cocaCola int, mirinda int, mountainDue int, mangoJuice int, "
				+ "orangeJuice int, coconutJuice int, iceTea int, chocolateMilk int, "
				+ "strawberryMilk int, blackCoffee int, milkCoffee);";      
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			stmt.execute(sql);         
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
	}
	
	public static void insertData1(int id1, int password1, int code1) {
		int id=id1;
	    int password=password1;
	    int code=code1;
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "insert into login values("+id+", "+ password+","+code+");";      
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			stmt.execute(sql);         
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
	}
	
	public static void insertData2(int on, int f1, int f2, int f3, int f4, int f5, int f6, int f7,
								   int f8, int f9, int f10, int f11, int f12, int d1, int d2, int d3, 
								   int d4, int d5, int d6, int d7, int d8, int d9, int d10, int d11, 
								   int d12) {
		int on1 = on;
		int f1v = f1;
		int f2v = f2;
		int f3v = f3;
		int f4v = f4;
		int f5v = f5;
		int f6v = f6;
		int f7v = f7;
		int f8v = f8;
		int f9v = f9;
		int f10v = f10;
		int f11v = f11;
		int f12v = f12;
		int d1v = d1;
		int d2v = d2;
		int d3v = d3;
		int d4v = d4;
		int d5v = d5;
		int d6v = d6;
		int d7v = d7;
		int d8v = d8;
		int d9v = d9;
		int d10v = d10;
		int d11v = d11;
		int d12v = d12;
		
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		String sql = "insert into orderTable values("+on1+","+f1v+","+f2v+","+f3v+","+f4v+","+f5v+","+f6v+","+f7v+","+f8v+","+f9v+","+f10v+","+f11v+","+f12v+","+  
															  d1v+","+d2v+","+d3v+","+d4v+","+d5v+","+d6v+","+d7v+","+d8v+","+d9v+","+d10v+","+d11v+","+d12v+");";      
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			stmt.execute(sql);         
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
	}
	
	
	public static void deleteData1() {
	      
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "delete from login where id=4;";      
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			stmt.execute(sql);         
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
	}
	
	public static void deleteData2(int on) {
	    int on1 = on;
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql1 = "delete from orderTable where orderNumber="+on1+";"; 
		String sql2 = "select orderNumber from orderTable where orderNumber="+on1+";";
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			ResultSet rs = stmt.executeQuery(sql2);
			if(rs.next() == true) {
				stmt.execute(sql1); 
				JOptionPane.showMessageDialog(null, "DATA DELETED");
			}else {
				JOptionPane.showMessageDialog(null, "NO SUCH DATA FOUND");
			}
		} catch (SQLException e) {             
			System.out.println(e.getMessage());  
		}
	}
	

	public static void searchData1(int id1, int password1) {

		int id=id1;
	    int password=password1;
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "select id from login where id="+id+" and password="+password+";";
		
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
		
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()==true) {
				searchData2();
				displayTable1();
				Manage.display();
				new Manage();
			}else {
				JOptionPane.showMessageDialog(null,"WRONG ID OR PASSWORD ... !\nTRY AGAIN ...");
				Thread t2 = new Thread(new Login());
				t2.start();
			}
		
		
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
		
	}
	
	public static void searchData2() {
		
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "select max(orderNumber) from orderTable;";
		
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
		
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()==true) {
				Order.orderNumber = rs.getInt(rs.getRow()) + 1;
				
			}else {
				JOptionPane.showMessageDialog(null,"Theer is no data ... !");
			}
		
		
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
		
	}
	
	public static void searchData3(int id1, int pass1, int code1) {
		int id=id1;
	    int code=code1;
	    int pass=pass1;
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql1 = "select id from login where id="+id+" and code="+code+";";
		
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
		
			ResultSet rs = stmt.executeQuery(sql1);
			
			if(rs.next()==true) {
				String sql2 = "delete from login where id="+id+";";
				stmt.execute(sql2);
				String sql3 = "insert into login values("+id+","+pass+","+code+");";
				stmt.execute(sql3);
				JOptionPane.showMessageDialog(null, "PASSWORD SUCCESSFULLY UPDATED ... !");
				new Login();
			}else {
				JOptionPane.showMessageDialog(null,"WRONG ID OR CODE ... !\nTRY AGAIN ...");
				new Reset();
			}
		
		
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
		
	}
	
	public static void searchData4(int id, int pass) {
		
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "select id from login where id="+id+" and password="+pass+";";
		
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
		
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()==true) {
				Signup.counter+=1;
			}else {
				JOptionPane.showMessageDialog(null,"WRONG INSIDER INFORMATION ... !");
			}
		
		
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
		
	}
	
	
	public static void searchData5(int id) {
		
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "select id from login where id="+id+";";
		
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
		
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()==true) {
				
			}else {
				
				Signup.idCount+=1;
			}
		
		
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
		
	}
	
	public static void displayTable1() {
		
		String url = "jdbc:sqlite:C://sqlite/db/rms.db";  
		
		String sql = "select * from orderTable;";      
		try (Connection conn = DriverManager.getConnection(url);                 
			Statement stmt = conn.createStatement()) {                      
			ResultSet rs = stmt.executeQuery(sql);
			
			int row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, 
				row11, row12, row13, row14, row15, row16, row17, row18, row19, row20, 
				row21, row22, row23, row24, row25;
			
			while(rs.next()) {
				
				row1 = rs.getInt(1);
				row2 = rs.getInt(2);
				row3 = rs.getInt(3);
				row4 = rs.getInt(4);
				row5 = rs.getInt(5);
				row6 = rs.getInt(6);
				row7 = rs.getInt(7);
				row8 = rs.getInt(8);
				row9 = rs.getInt(9);
				row10 = rs.getInt(10);
				row11 = rs.getInt(11);
				row12 = rs.getInt(12);
				row13 = rs.getInt(13);
				row14 = rs.getInt(14);
				row15 = rs.getInt(15);
				row16 = rs.getInt(16);
				row17 = rs.getInt(17);
				row18 = rs.getInt(18);
				row19 = rs.getInt(19);
				row20 = rs.getInt(20);
				row21 = rs.getInt(21);
				row22 = rs.getInt(22);
				row23 = rs.getInt(23);
				row24 = rs.getInt(24);
				row25 = rs.getInt(25);
				
				Manage.arrayList1(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, 
								  row11, row12, row13, row14, row15, row16, row17, row18, row19, row20, 
								  row21, row22, row23, row24, row25);
			}
	
			
		} catch (SQLException e) {             
			System.out.println(e.getMessage());         
		}
	}

	
	       
	
}
