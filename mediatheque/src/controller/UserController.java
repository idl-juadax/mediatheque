package controller;

import view.Accueil;
import model.UserModel;
import facade.Connexion;

public class UserController {
	
	Connexion facade = new Connexion();

	public String inscription(String identifiant, String password){
		return facade.addUser(identifiant, password);
	}
	
	public UserModel connexion(String identifiant, String password){
		
		UserModel user = null;
		user = facade.checkUser(identifiant, password);
		
		return user;
	}
}
