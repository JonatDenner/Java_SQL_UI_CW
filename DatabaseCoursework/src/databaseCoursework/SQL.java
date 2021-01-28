package databaseCoursework;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {
	/**
	 * Takes user inputs from the GUI and inserts them into the database with DatabaseConnect
	 * @param n Client name
	 * @param s Client surname
	 * @param p Client phone number
	 * @param hn Client house number 
	 * @param st Client street name
	 * @param pc Client postcode
	 * @param a Medicine delivery checkbox
	 * @param b Grocery delivery checkbox
	 * @param c Dog walking checkbox
	 * @param d Social visit checkbox
	 * @param e Social call checkbox
	 */
	public static void iClient(String n, String s, String p, String hn, String st, String pc, Boolean a, Boolean b, Boolean c, Boolean d, Boolean e) {
		int a1, b1, c1, d1, e1;
		if(a == true) {a1 = 1;} else {a1 = 0;}
		if(b == true) {b1 = 1;} else {b1 = 0;}
		if(c == true) {c1 = 1;} else {c1 = 0;}
		if(d == true) {d1 = 1;} else {d1 = 0;}
		if(e == true) {e1 = 1;} else {e1 = 0;}
		
		String x = "INSERT INTO Client(client_id, name, surname, phone_number, house_number, street, postcode, med_del, gro_del,"
				+ " dog_walk, soc_vis, soc_call) VALUES (NULL, '"+n+"','"+s+"','"+p+"','"+hn+"','"+st+"','"+pc+"',"+a1+","+b1
						+ ","+c1+","+d1+","+e1+")";
		
		DatabaseConnect.insert(x);
	}
	/**
	 * Takes user inputs from the GUI and inserts them into the database with DatabaseConnect
	 * @param n Volunteer name
	 * @param s Volunteer surname
	 * @param p Volunteer phone number
	 * @param av Volunteer availability
	 * @param a Medicine delivery checkbox
	 * @param b Grocery delivery checkbox
	 * @param c Dog walking checkbox
	 * @param d Social visit checkbox
	 * @param e Social call checkbox
	 */
	public static void iVol(String n, String s, String p, String av, Boolean a, Boolean b, Boolean c, Boolean d, Boolean e) {		
		String x = "INSERT INTO Volunteer(volun_id, name, surname, phone_number, availability, gro_del, med_del,"
				+ " dog_walk, soc_vis, soc_call) VALUES (NULL, '"+n+"','"+s+"','"+p+"','"+av+"',"+a+","+b
						+ ","+c+","+d+","+e+")";
		
		DatabaseConnect.insert(x);
	}
	/**
	 * Takes user inputs from the GUI and inserts them into the database with DatabaseConnect
	 * @param cli Client ID
	 * @param vol1 First volunteer ID
	 * @param vol2 Second volunteer ID
	 * @param act Activity ID
	 * @param date Date
	 */
	public static void iLog(int cli, int vol1, String vol2, String act, String date) {
		int i;
		String j;
		if(act == "Medicine Delivery") {
			i = 1;
		}else if(act == "Grocery Delivery") {
			i = 2;
		}else if(act == "Dog Walking") {
			i = 3;
		}else if(act == "Social Check-Up") {
			i = 4;
		}else {
			i = 5;
		}
		if(vol2.equals("Volunteer 2 ID")) {
			j = "NULL";
		}else {j = vol2;}
		
		String x = "INSERT INTO `Logbook`(`log_id`, `client_id`, `volun1_id`, `volun2_id`, `activity_id`, `date`) "
				+ "VALUES (NULL, "+cli+","+vol1+","+j+","+i+",'"+date+"')";
		
		DatabaseConnect.insert(x);
	}
	/**
	 * Takes user inputs from the GUI and reads the designated database info with DatabaseConnect
	 * @param a Data entered into the form
	 * @param b Value selected in the choice box
	 * @return A string containing the formatted output from the SQL query
	 */
	public static String sClient(String a, String b) {
		String x, z = "";
		if(b.equals("Name")) {
			x = "name";
		}else if(b.equals("Surname")) {
			x = "surname";
		}else if(b.equals("Street")) {
			x = "street";
		}else {
			x = "postcode";
		}
		String y = "SELECT * FROM Client WHERE "+x+" LIKE '"+a+"'";
		
		ResultSet rs = DatabaseConnect.select(y);
		
		try {
			while (rs.next()) {
				int clientID = rs.getInt("client_id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String phone = rs.getString("phone_number");
				String house = rs.getString("house_number");
				String street = rs.getString("street");
				String postcode = rs.getString("postcode");
				Boolean med = rs.getBoolean("med_del");
				Boolean gro = rs.getBoolean("gro_del");
				Boolean dog = rs.getBoolean("dog_walk");
				Boolean vis = rs.getBoolean("soc_vis");
				Boolean call = rs.getBoolean("soc_call");
				
				z += ("ID: "+clientID+"\nName: "+name+"\nSurname: "+surname+"\nPhone Number: "+phone+"\nHouse Number: "
						+house+"\nStreet: "+street+"\nPostcode: "+postcode+"\nMedicine Delivery: "+med+"\nGrocery Delivery: "+
						gro+"\nDog Walking: "+dog+"\nSocial Visit: "+vis+"\nSocial Call: "+call+"\n");
			}
			rs.close();
			return z;
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			z = ex.getMessage();
			return z;
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
			z = ex.getMessage();
			return z;
		}
	}
	/**
	 * Takes user inputs from the GUI and reads the designated database info with DatabaseConnect
	 * @param a Data entered into the form
	 * @param b Value selected in the choice box
	 * @return A string containing the formatted output from the SQL query
	 */
	public static String sVolunteer(String a, String b) {
		String x, y = "", c = "", z = "";
		
		if(b.equals("Name")) {
			x = "name";
		}else if(b.equals("Surname")) {
			x = "surname";
		}else {
			x = "activity";
		}
		if(x.equals("activity")) {
			if(a.equals("Medicine Delivery")) {
				c = "med_del";
			}else if(a.equals("Grocery Delivery")) {
				c = "gro_del";
			}else if(a.equals("Dog Walking")) {
				c = "dog_walk";
			}else if(a.equals("Social Check-Up")) {
				c = "soc_vis";
			}else {
				c = "soc_call";
			}
		}
		
		if(x.equals("activity")) {
			y = "SELECT * FROM Volunteer WHERE "+c+" IS TRUE";
		}else {
			y = "SELECT * FROM Volunteer WHERE "+x+" LIKE '"+a+"'";
		}
		
		ResultSet rs = DatabaseConnect.select(y);
		
		try {
			while (rs.next()) {
				int volunID = rs.getInt("volun_id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String phone = rs.getString("phone_number");
				String ava = rs.getString("availability");
				Boolean med = rs.getBoolean("med_del");
				Boolean gro = rs.getBoolean("gro_del");
				Boolean dog = rs.getBoolean("dog_walk");
				Boolean vis = rs.getBoolean("soc_vis");
				Boolean call = rs.getBoolean("soc_call");
				
				z += ("ID: "+volunID+"\nName: "+name+"\nSurname: "+surname+"\nPhone Number: "+phone+"\nAvailability: "+ava+
						"\nMedicine Delivery: "+med+"\nGrocery Delivery: "+gro+"\nDog Walking: "+dog+
						"\nSocial Visit: "+vis+"\nSocial Call: "+call+"\n\n");
			}
			rs.close();
			return z;
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			z = ex.getMessage();
			return z;
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
			z = ex.getMessage();
			return z;
		}
	}
	/**
	 * Takes user inputs from the GUI and reads the designated database info with DatabaseConnect
	 * @param a Data entered into the form
	 * @param b Value selected in the choice box
	 * @return A string containing the formatted output from the SQL query
	 */
	public static String sLog(String a, String b ) {
		String x, y, z = "";
		if(b.equals("Client ID")) {
			x = "client_id";
		}else if(b.equals("Volunteer ID")) {
			x = "volunteer";
		}else if(b.equals("Activity")) {
			x = "activity_id";
		}else {
			x = "date";
		}
		
		if(x.equals("activity_id")) {
			if(a.equals("Medicine Delivery")) {
				a = "1";
			}else if(a.equals("Grocery Delivery")) {
				a = "2";
			}else if(a.equals("Dog Walking")) {
				a = "3";
			}else if(a.equals("Social Check-Up")) {
				a = "4";
			}else {
				a = "5";
			}
		}
		
		if(x.equals("volunteer")) {
			y = "SELECT l.*, a.act_name FROM Logbook l, Volunteer v, Activity a WHERE l.log_id IN(SELECT l.log_id FROM Logbook l, Volunteer v1 "
					+ "WHERE l.volun1_id = '"+a+"' OR l.volun2_id = '"+a+"') AND l.volun1_id = v.volun_id AND l.activity_id = a.activity_id ";
		}else {
			y = "SELECT l.*, a.act_name FROM Logbook l, Activity a WHERE l."+x+" = '"+a+"' AND a.activity_id = l.activity_id";
		}
		
		ResultSet rs = DatabaseConnect.select(y);
		
		try {
			while (rs.next()) {
				int logID = rs.getInt("log_id");
				int clientID = rs.getInt("client_id");
				int vol1ID = rs.getInt("volun1_id");
				int vol2ID = rs.getInt("volun2_id");
				String act = rs.getString("act_name");
				String date = rs.getString("date");
				String vol2IDstr = "";
				if(vol2ID == 0) {
					vol2IDstr = "None";
				}else {vol2IDstr += vol2ID;}
				
				z += ("Log ID: "+logID+"\nClient ID: "+clientID+"\nVolunteer 1 ID: "+vol1ID+"\nVolunteer 2 ID: "+vol2IDstr+
						"\nActivity: "+act+"\nDate: "+date+"\n\n");}
			rs.close();
			return z;
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			z = ex.getMessage();
			return z;
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			ex.printStackTrace();
			z = ex.getMessage();
			return z;
		}
	}
	/**
	 * Takes user inputs from the GUI and updates a designated database value with DatabaseConnect
	 * @param a Data entered into the form
	 * @param b Value selected in the choice box
	 * @param c Bool value of checkbox 1
	 * @param d Bool value of checkbox 2
	 * @param e Bool value of checkbox 3
	 * @param f Bool value of checkbox 4
	 * @param g Bool value of checkbox 5
	 */
	public static void uClient(int id, String a, String b, boolean c, boolean d, boolean e, boolean f, boolean g) {
		String x, y;
		if(b.equals("Name")) {
			x = "name";
		}else if(b.equals("Surname")) {
			x = "surname";
		}else if(b.equals("Phone Number")) {
			x = "phone_number";
		}else if(b.equals("House Number")) {
			x = "house_number";
		}else if(b.equals("Street")) {
			x = "street";
		}else {
			x = "postcode";
		}
		y = "UPDATE Client SET "+x+" = '"+a+"', med_del = "+c+", gro_del = "+d+", dog_walk = "+e+", soc_vis = "+f+
				", soc_call = "+g+" WHERE client_id = "+id;
		
		DatabaseConnect.insert(y);
	}
	
	/**
	 * Takes user inputs from the GUI and updates a designated database value with DatabaseConnect
	 * @param a Data entered into the form
	 * @param b Value selected in the choice box
	 * @param c Bool value of checkbox 1
	 * @param d Bool value of checkbox 2
	 * @param e Bool value of checkbox 3
	 * @param f Bool value of checkbox 4
	 * @param g Bool value of checkbox 5
	 */
	public static void uVolunteer(int id, String a, String b, boolean c, boolean d, boolean e, boolean f, boolean g) {
		String x, y;
		if(b.equals("Name")) {x = "name";}
		else if(b.equals("Surname")) {x = "surname";}
		else if(b.equals("Phone Number")) {x = "phone_number";}
		else{x = "availability";}
		
		y = "UPDATE Volunteer SET "+x+" = '"+a+"', med_del = "+c+", gro_del = "+d+", dog_walk = "+e+", soc_vis = "+f+
				", soc_call = "+g+" WHERE volun_id = "+id;
		
		DatabaseConnect.insert(y);
	}
	
	/**
	 * Deletes chosen information from the database with DatabaseConnect
	 * @param a Data entered into the form
	 * @param b Value selected in the choice box
	 */
	public static void delete(String a, String b) {
		String x, y, z;
		
		if(b.equals("Delete Client")) {
			x = "Client";
			y = "client_id";
		}else if(b.equals("Delete Volunteer")) {
			x = "Volunteer";
			y = "volun_id";
		}else {
			x = "Logbook";
			y = "log_id";
		}
		
		z = "DELETE FROM "+x+" WHERE "+y+" = "+a;
		DatabaseConnect.insert(z);
	}
}
