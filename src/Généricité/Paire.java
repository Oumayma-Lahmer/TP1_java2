package Généricité;

public class Paire <T, U> {
	
	T contenu1;
	U contenu2;
	
	
	
	public Paire(T contenu1, U contenu2) {
		this.contenu1 = contenu1;
		this.contenu2 = contenu2;
	}

	public T getContenu1() {
		return contenu1;
	}

	public void setContenu1(T contenu1) {
		this.contenu1 = contenu1;
	}

	public U getContenu2() {
		return contenu2;
	}

	public void setContenu2(U contenu2) {
		this.contenu2 = contenu2;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paire <String, Integer> p1 = new Paire<String, Integer>("abc", 12);
		System.out.println("le contenu de la premier attribut: "+ p1.getContenu1()+ "\n"+ " le continu de second attribut : "+ p1.getContenu2());

	}

}
