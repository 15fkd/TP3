package TP3;

public class Camion extends Vehicule {
	private double chargeMax ;
	public Camion () {
		
	}
	public Camion(double chargeMax, String marque, String matricule) {
        super(marque, matricule); 
        this.chargeMax = chargeMax;
    }
	
	public void stationner() {
		System.out.println("le camion se gare dans une zone pour vehicules lourds");
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Le charge Max est : "+chargeMax);
		}

}
