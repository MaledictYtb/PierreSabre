package personnages;

public class Humain {

	private String nom;
	private String boissonFav;
	private int argent;
	protected int nbConnaissance;
	private int tailleMemoire = 30;
	protected Humain[] memoire = new Humain[tailleMemoire];

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
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à "
					+ prix + " sous. ");
			return;
		}

		parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + " sous");
		perdreArgent(prix);
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	protected void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);

	}

	public void memoriser(Humain humain) {
		if (nbConnaissance < tailleMemoire) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
			return;
		}
		if (nbConnaissance == tailleMemoire) {
			for (int i = 1; i < tailleMemoire; i++) {
				memoire[i - 1] = memoire[i];
			}
			memoire[tailleMemoire-1] = humain;
			return;
		}
	}
	
	public void listerConnaissances() {
		
		if (nbConnaissance == 0) {
			parler("Je ne connais personne :(");
			return;
		}
		
		String aDire;
		aDire = "Je connais beaucoup de monde dont : ";
		
		for (int i = 0; i < nbConnaissance-1; i++) {
			aDire += memoire[i].getNom();
			aDire += ", ";
		}
		aDire += memoire[nbConnaissance-1].getNom();
		
		parler(aDire);
	}

}
