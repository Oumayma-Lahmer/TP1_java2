package gestion_fournisseur_Produit;

import java.util.ArrayList;
import java.util.*;

public class Fournisseur <T> {
	
	String ID ;
	List<T> Produits = new ArrayList<T>();
	
	public void ajoutProduit (T produit) {
		Produits.add(produit);
	}
	
	public void afficherListeProduit() {
		System.out.println("La liste de produit de fournisseur est: ");
		for (T produit: Produits) {
			System.out.println(produit);
		}
	}
}
