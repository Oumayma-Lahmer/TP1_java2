package Généricité;

public class Boite <T> {
	
	T contenu ;
	
	public Boite (T contenu) {
		this.contenu= contenu;
	}
	
	public T getContenu() {
		return contenu;
	}

	public void setContenu(T contenu) {
		this.contenu = contenu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boite <Integer> g = new Boite<Integer>(10);
		Boite <Float> f = new Boite<Float>(2.5f);
		Boite <String> s = new Boite<String>("maymaa :p");
		System.out.println(g.getContenu());
		System.out.println(f.getContenu());
		System.out.println(s.getContenu());
		
	}

}
