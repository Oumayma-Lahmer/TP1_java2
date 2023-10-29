package Généricité;

import java.util.ArrayList;
import java.util.List;

public class ListeTableau<T> implements ListeGenerique<T> {

	List <T> tab = new ArrayList<T>();
	
	@Override
	public void ajouter(T a) {
		// TODO Auto-generated method stub
		tab.add(a);
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return tab.get(0);
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return tab.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeTableau<Integer> tab = new ListeTableau<Integer>();
		tab.ajouter(10);
		tab.ajouter(15);
		System.out.println(tab.taille());
		System.out.println(tab.get());
	}

}
