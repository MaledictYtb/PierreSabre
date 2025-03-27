package personnages;

public class Yakuza extends Humain {

	private String clan;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ? ");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse ! ");
		int argent = victime.seFaireExtorquer();

		gagnerArgent(argent);

		parler("J'ai piqué les " + argent + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");

	}
}
