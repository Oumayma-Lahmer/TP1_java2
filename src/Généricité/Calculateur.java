package Généricité;

public class Calculateur {

	public <T extends Number> double somme(T[] tab){
		double s =0;
		for(int i =0 ; i<tab.length; i++) {
			s+= tab[i].doubleValue();
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}