package personnages;

public class Yakuza extends Humain {

	private int rep = 0;
	private String clan;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return rep;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ? ");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse ! ");
		int argent = victime.seFaireExtorquer();

		gagnerArgent(argent);

		parler("J'ai piqué les " + argent + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");

	}

	public int perdre() {
		int argent = getArgent();
		perdreArgent(argent);

		rep -= 1;

		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan);

		return argent;
	}
	
	public void gagner(int gain) {
		rep += 1;
		
		gagnerArgent(gain);
		
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de "  + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
}
