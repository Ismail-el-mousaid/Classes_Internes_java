package Ex2;

public abstract class Vehicule {
	private String marque, modele, proprietaire;

	public String getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public String getProprietaire() {
		return proprietaire;
	}
	
	@Override
	public String toString() {
		return "Vehicule{" +getProprietaire()+ " , " +getMarque()+ ", " +getModele()+ " }"  ;
	}

}
