/**
 * simple run package
 */
package by.htp.gem.run;

import by.htp.gem.model.Gemstone;
import by.htp.gem.model.Goldsmith;
import by.htp.gem.model.Necklace;

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
		goldsmith.printNecklace(necklace);

		goldsmith.printTotalWeigthCost(necklace);

		goldsmith.sortByCost(necklace);
		goldsmith.printNecklace(necklace);

		Gemstone[] gemstones = goldsmith.findGemstones(necklace);
		goldsmith.printGemstones(gemstones);

	}

}
