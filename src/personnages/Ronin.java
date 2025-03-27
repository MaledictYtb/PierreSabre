package personnages;

public class Ronin extends Humain {

	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentADonne = (int) (getArgent() * 0.1);
		perdreArgent(argentADonne);
		parler(beneficiaire.getNom() + " prend ces " + argentADonne + " sous. ");
		beneficiaire.recevoir(argentADonne);
	}

}
