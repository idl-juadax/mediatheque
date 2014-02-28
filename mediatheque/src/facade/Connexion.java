package facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import model.UserModel;

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

	
	public ArrayList<UserModel>listerUsers() {
		ArrayList<UserModel> lst = new ArrayList<UserModel>();
		Statement st = null;
		ResultSet rs = null;
		
		String sql = "select * from users";
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				UserModel user = new UserModel();
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setAdresseEmail(rs.getString("email"));
				user.setMotDePasse(rs.getString("password"));
				lst.add(user);
			}
		}
		catch (Exception e) {
			System.out.println("Connexion.liste user erreur "+e.getMessage());
		}
		try {if (rs !=null) rs.close();} catch (Exception e) {}
		try {if (st !=null) st.close();} catch (Exception e) {}

		return lst;
	}
	
	public UserModel checkUser (String usermail,String passwd){
		
		UserModel user = null;
		
		Statement st = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM users WHERE email ='"+usermail+"' AND password = '"+passwd+"'";
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			if(rs.first()){
				user = new UserModel();
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setAdresseEmail(rs.getString("email"));
				user.setMotDePasse(rs.getString("password"));
			}
			
		}
		catch (Exception e) {
			System.out.println("Connexion.liste user erreur "+e.getMessage());
		}
		try {if (rs !=null) rs.close();} catch (Exception e) {}
		try {if (st !=null) st.close();} catch (Exception e) {}
		
		return user;
	}
	
	public String addUser(String identifiant, String password){
		
		return "";
	}
	
	
	
	public static void main(String [] args) {
		Connexion cxn = new Connexion();
		cxn.ouvrir();
		
		System.out.println("Liste des users");
		UserModel usr = cxn.checkUser("contact@julienKermarec.com","password");
		System.out.println("Utilisateur = "+usr.getNom());
		
		cxn.fermer();
	}
	
}
