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

	public void provoquer(Yakuza adversaire) {

		int force = honneur * 2;

		if (force >= adversaire.getReputation()) {
			
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakuza! ");
			

			honneur += 1;

			int argent = adversaire.perdre();
			gagnerArgent(argent);

		} else {
			
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur -= 1;
			int argent = getArgent();
			perdreArgent(argent);
			
			adversaire.gagner(argent);
			
		}

	}
}
