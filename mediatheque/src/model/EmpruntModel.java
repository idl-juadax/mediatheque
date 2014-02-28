package model;

public class EmpruntModel {
	
	private int id;
	private MediaModel media;
	private String duree;
	private String dateDebutEmprunt;
	private String dateFinEmprunt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public MediaModel getMedia() {
		return media;
	}
	public void setMedia(MediaModel media) {
		this.media = media;
	}
	
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	public String getDateDebutEmprunt() {
		return dateDebutEmprunt;
	}
	public void setDateDebutEmprunt(String dateDebutEmprunt) {
		this.dateDebutEmprunt = dateDebutEmprunt;
	}
	
	public String getDateFinEmprunt() {
		return dateFinEmprunt;
	}
	public void setDateFinEmprunt(String dateFinEmprunt) {
		this.dateFinEmprunt = dateFinEmprunt;
	}
	
}
