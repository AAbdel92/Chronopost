package fr.laposte.gestionflotte;

import java.util.ArrayList;

public class Transporteur extends Vehicule {
	private int volume;
	private ArrayList<Colis> stockColis;
	

	public Transporteur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	
}
