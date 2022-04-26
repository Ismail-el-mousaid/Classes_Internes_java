package Ex1;

import java.util.Comparator;



public class Personne {
	String nom, prenom, cin;

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + "]";
	}

	static class Comparateur implements Comparator<Personne>{

		@Override
		public int compare(Personne p1, Personne p2) {
			// TODO Auto-generated method stub
			if (p1.getNom().compareTo(p2.getNom())!=0)
				return p1.getNom().compareTo(p2.getNom());
			else if(p1.getNom().compareTo(p2.getNom())==0 & p1.getPrenom().compareTo(p2.getPrenom())!=0)
				return p1.getPrenom().compareTo(p2.getPrenom());
			else if(p1.getNom().compareTo(p2.getNom())==0 & p1.getPrenom().compareTo(p2.getPrenom())==0 & p1.getCin().compareTo(p2.getCin())!=0)
				return p1.getCin().compareTo(p2.getCin());
			return 0;					
		}
		
	}
	
	public Personne(String nom, String prenom, String cin) {
		this.nom=nom;
		this.prenom=prenom;
		this.cin=cin;
	}
	
	public Personne() {
		
	}

}
