package TP3;

public class Moto extends Vehicule {
	private boolean avecCasque ;
	public Moto() {
		
	}
	public Moto(boolean avecCasque, String marque, String matricule) {
	        super(marque, matricule); 
	        this.avecCasque = avecCasque;
	}
	
	public void stationner() {
		System.out.println("la moto se gare dans une place reservee aux deux-roues");
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Avec casque : "+avecCasque);
		}

}
