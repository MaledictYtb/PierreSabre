package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		/*
		 * Humain prof = new Humain("Prof", "kombucha", 54); prof.direBonjour();
		 * prof.acheter("une boisson", 12); prof.boire(); prof.acheter("un jeu", 2);
		 * prof.acheter("un kimono", 50);
		 */

		/*
		 * Commercant marco = new Commercant("Marco", 20); marco.direBonjour();
		 * marco.seFaireExtorquer(); marco.recevoir(15); marco.boire();
		 */

		/*
		 * Commercant marco = new Commercant("Marco", 15); Yakuza yaku = new
		 * Yakuza("Yaku Le Noir", "whisky", 30, "Warsong"); yaku.direBonjour();
		 * yaku.extorquer(marco);
		 */

		/*
		 * Ronin roro = new Ronin("Roro", "shochu", 60); roro.direBonjour(); Commercant
		 * marco = new Commercant("Marco", 15); roro.donner(marco);
		 */
		
		Ronin roro = new Ronin("Roro", "shochu", 54);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		roro.provoquer(yaku);

	}
}
