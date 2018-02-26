/**
 * logic package 
 */
package by.htp.gem.logic;

import by.htp.gem.model.Gemstone;
import by.htp.gem.model.Necklace;

/**
 * Interface Manager includes signatures of methods of Goldsmith and Apprentice:
 * creates necklace, counts total cost and weight, sort gemstones in necklace by
 * cost,finds gemstones by transparency.
 * 
 * @author Artem_Kaptur
 */
public interface Manager {

	Necklace createNecklace();

	int chooseNumberOfGems();

	public Gemstone chooseGemstone(int i);

	Gemstone createGemstone(String s, int weight);

	void printTotalWeigthCost(Necklace necklace);

	int countWeight(Necklace necklace);

	int countCost(Necklace necklace);

	void sortByCost(Necklace necklace);

	Gemstone[] findTransparentOrTransluentGems(Necklace necklace);

	String chooseParameter();

}
