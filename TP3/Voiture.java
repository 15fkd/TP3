package TP3;

public class Voiture extends Vehicule {
	
  private int nbPortes;
  public Voiture() {
  }
  public Voiture(int nbPortes,String marque,String matricule) {
	  this.nbPortes = nbPortes ;
	  this.marque = marque ;
	  this.matricule = matricule ;
  }
  
  public void stationner() {
	  System.out.println("la voiture se gare dans une place standard");
  }
 
  public void afficher() {
	  super.afficher();
		System.out.println("le nombre de portes :"+nbPortes);
	}
   
  }
