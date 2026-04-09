package TP3;

public class TestPacking extends Vehicule {
  public static void main (String[] args) {
	  Vehicule[] v =  new Vehicule[4];
	  v[0]= new Voiture(4,"Dacia","DJ1238");
	  v[1]= new Voiture(4,"BMW","kj1396");
	  v[2]= new Moto(true,"hhkd","djjdb");
	  v[3]= new Camion(1234.27,"toyota","d");
	  for (int i = 0; i < 4; i++) {
		    v[i].stationner();
		    v[i].afficher();
		}
	  for (Vehicule ve : v) {
		    if (ve instanceof Voiture) {
		        ve.stationner();
		        ve.afficher();
		    }
		}
	  Vehicule x = new Voiture(4, "yamaha", "11µC22");
      Voiture v1= (Voiture) x;
      System.out.println("Downcasting reussi !");
	  
  }
}
