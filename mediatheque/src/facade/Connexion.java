package facade;

import java.sql.Connection;
import java.sql.DriverManager;

import java.util.ResourceBundle;

public class Connexion {

	private boolean debug = true;
	
	final String ficProp = "facade/base";
	private String url;
	private String user;
	private String pwd;

	private Connection connection = null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.out.println("Base erreur Class.forName "+e.getMessage());
		}
	}
	
	public void ouvrir() {
		try {
				ResourceBundle rb = ResourceBundle.getBundle(ficProp);
				url = rb.getString("url");
				user = rb.getString("user");
				pwd = rb.getString("pwd");
				
				connection  = DriverManager.getConnection(url, user, pwd);
		}
		catch (Exception e) {
			System.out.println("Base.ouvrir erreur : "+e.getMessage());
		}
		message("url = "+url);
		message("user = "+user);
		message("Base.ouvrir connexion effectuée");
	}

	public void fermer() {
		try {
			if (connection != null) connection.close();
		}
		catch (Exception e) {
			System.out.println("Base.fermer erreur :"+e.getMessage());
		}
		connection = null;
	}
	
	private void message(String s) {
		if (debug) System.out.println(s);
	}

	
	public static void main(String [] args) {
		Connexion cxn = new Connexion();
		cxn.ouvrir();
		
		
		cxn.fermer();
	}
	
}