import java.util.ArrayList;

public class Panier {

	private ArrayList<Orange> listeOranges;
	private int nbMaxOranges;

	public Panier(int nbMax) {
		this.nbMaxOranges = nbMax;
		this.listeOranges = new ArrayList<Orange>();
	}

	public int getNbMaxOranges() {
		return this.nbMaxOranges;
	}

	public void setNbMaxOrange(int nbMax) {
		this.nbMaxOranges = nbMax;
	}

	public int nbOranges() {
		return this.listeOranges.size();
	}

	public boolean estPlein() {
		return this.nbOranges() == this.getNbMaxOranges();
	}

	public boolean estVide() {
		return this.listeOranges.isEmpty();
	}

	public boolean ajoute(Orange o) {
		if (this.getNbMaxOranges() >= this.nbOranges()+1) {
			this.listeOranges.add(o);
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {

		if(this.estVide()) {
			return "Le panier est vide!";
		}
		else if(this.getNbMaxOranges() == this.nbOranges()) {
			return "Le panier est plein!";
		}
		else {
			return "Le panier contient "+this.nbOranges()+" oranges";
		}
	}

	public void retire() {
		this.listeOranges.remove(this.listeOranges.size()-1);
	}

	public double getPrix() {
		double prix = 0;
		for (int i = 0; i<this.listeOranges.size(); i++) {
			prix += this.listeOranges.get(i).getPrix();
		}
		return prix;
	}

	public static void main(String [] args) {
		Orange orange1 = new Orange(2, "a");
		Orange orange2 = new Orange(5, "b");
		Orange orange3 = new Orange(4, "c");
		Orange orange4 = new Orange(1, "d");

		Panier panier = new Panier(3);

		System.out.println(panier.toString());

		panier.ajoute(orange1);

		System.out.println(panier.toString());

		panier.ajoute(orange2);
		panier.ajoute(orange3);

		System.out.println(panier.toString());

		panier.ajoute(orange4);

		System.out.println("Le panier contient "+panier.nbOranges()+" oranges!");

		System.out.println("Prix du panier : "+panier.getPrix());

		panier.retire();

		System.out.println("Prix du panier : "+panier.getPrix());


	}

}







