package gestion_fournisseur_Produit;

public class Produit <T>{
	String nom , codeProduit;
	double prix;
	
	public Produit (String nom, String cp, double px){
		this.nom=nom;
		this.codeProduit = cp;
		this.prix= px;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
