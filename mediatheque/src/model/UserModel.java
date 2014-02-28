package model;

import java.util.ArrayList;

public class UserModel {
	
	private int id;
	private String nom;
	private String prenom;
	private String adresseEmail;
	private String motDePasse;
	private ArrayList<EmpruntModel> emprunts = new ArrayList<EmpruntModel>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getAdresseEmail() {
		return adresseEmail;
	}
	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}
	
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public ArrayList<EmpruntModel> getEmprunts() {
		return emprunts;
	}
	public void setEmprunts(ArrayList<EmpruntModel> emprunts) {
		this.emprunts = emprunts;
	}
}
