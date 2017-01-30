package fr.laposte.gestionflotte;

public class Vehicule {
	private String immatriculation;
	private String marque;
	private String modele;
	private int nombreChauffeur;
	private String energie;
	private String météo;
	private String distance;
	
	public void seDecrire() {
		System.out.println("ma classe : " + this.getClass() + " nb chauffeur : " + this.getNombreChauffeur() + " météo : " + this.getMétéo());
	}
	
	
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNombreChauffeur() {
		return nombreChauffeur;
	}
	public void setNombreChauffeur(int nombreChauffeur) {
		this.nombreChauffeur = nombreChauffeur;
	}
	public String getEnergie() {
		return energie;
	}
	public void setEnergie(String carburant) {
		this.energie = carburant;
	}
	public String getMétéo() {
		return météo;
	}
	public void setMétéo(String météo) {
		this.météo = météo;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	

}
