package TP3;

public class Vehicule {
	protected  String marque ;
	protected String matricule ;
	public Vehicule () {
		
	}
	public Vehicule(String marque,String matricule) {
		this.marque = marque ;
		this.matricule = matricule ;
	
	}
	
	public void stationner() {
		System.out.println("le vehicule se gare dans le parcking");
	}
	public void afficher() {
		System.out.println("Marticule:"+ matricule+",Marque"+ marque);
	}

}
