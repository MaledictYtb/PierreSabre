package personnages;

public class Humain {

	private String nom;
	private String boissonFav;
	private int argent;

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFav + ". ");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix) {
		
		if (getArgent() < prix) {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix);
			return;
		}
		
		parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + " sous");
		perdreArgent(prix);
	}
	
	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int perte) {
		argent -= perte;
	}
	
	private void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}

}
