import java.util.Scanner;

public class Orange {

	private double prix; // Prix en euros
	private String origine; // Pays de provenance

	public Orange(double prix, String origine) {
		try {
			this.prix = prix;
			this.origine = origine;
		} 
		catch (Exception e) {
			if (prix < 0 ) {
				System.out.println("Le prix ne peut pas etre negatif!");
			}
			else {
				System.out.println("Autre probleme");
			}
		}
	}

	public double getPrix() {
		return this.prix;
	}

	public String getOrigine() {
		return this.origine;
	}

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quel est le prix?");
		int prix = sc.nextInt();

		System.out.println("Quelle est l origine?");
		String origine = sc.nextLine();

		Orange orange = new Orange(prix, origine);

		System.out.println("Prix : "+orange.getPrix()+"\nOrigine : "+orange.getOrigine());

	}
}