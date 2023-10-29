package gestion_fournisseur_Produit;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fournisseur<String> f1 = new Fournisseur<String>();
		Produit <String> p1 = new Produit<String>("keyBoard","01",4.2);
		Produit <Integer> p2 = new Produit<Integer>("b", "c", 12);
		
		f1.ajoutProduit(p1);
		f1.ajoutProduit(p2);
		f1.afficherListeProduit();
	}

}
