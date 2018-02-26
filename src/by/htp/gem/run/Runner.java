/**
 * run package
 */
package by.htp.gem.run;

import by.htp.gem.model.Gemstone;
import by.htp.gem.model.Necklace;
import by.htp.gem.logic.Apprentice;
import by.htp.gem.logic.Goldsmith;

/**
 * This is main class, which runs our program
 * 
 * @author Artem_Kaptur
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Goldsmith goldsmith = new Goldsmith("Tom");
		Necklace necklace;
		necklace = goldsmith.createNecklace();
		Goldsmith.printInfo(necklace);

		goldsmith.printTotalWeigthCost(necklace);

		goldsmith.sortByCost(necklace);
		Goldsmith.printInfo(necklace);

		Gemstone[] gemstones = goldsmith.findTransparentOrTransluentGems(necklace);
		Goldsmith.printInfo(gemstones);

		Apprentice apprentice = new Apprentice("Billy");
		necklace = apprentice.createNecklace();
		Apprentice.printInfo(necklace);

	}

}
