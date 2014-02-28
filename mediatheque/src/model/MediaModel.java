package model;

public class MediaModel {
	
	private int id;
	private String duree;
	private String type;
	private String dateAjout;
	private int status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}	
}
