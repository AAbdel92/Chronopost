package fr.laposte.gestionflotte;

import java.util.ArrayList;

public class Flotte {
	private ArrayList<Vehicule> listeVehicule;
	
	public Flotte() {
		listeVehicule = new ArrayList<>();
	}
	
		public void ajoutVehicule(Vehicule nom) {
			listeVehicule.add(nom);
		}
		
		public void afficherListe(Vehicule blabla) {
			for (Vehicule machin : listeVehicule) {
				if (machin.getClass().equals(blabla.getClass()))
				machin.seDecrire();
			}
					
		}
		
		public void recup1() {
			System.out.println(listeVehicule.get(0).getClass()); 
		}
}
