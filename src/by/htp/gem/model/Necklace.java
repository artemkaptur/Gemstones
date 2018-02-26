/**
 * model package
 */
package by.htp.gem.model;

/**
 * Necklace is the class which is determined as array of gemstones. Includes
 * constructors and getters&setter.
 * 
 * @author Artem_Kaptur
 *
 */
public class Necklace {

	/**
	 * Gemstone[] field gemstones
	 */
	private Gemstone[] gemstones;

	public Necklace() {

	}

	public Necklace(Gemstone[] gemstones) {
		this.gemstones = gemstones;
	}

	/**
	 * @return Gemstone[] gemstones
	 */
	public Gemstone[] getGemstones() {
		return gemstones;
	}

	/**
	 * @param a
	 *            - necklace
	 * @return nothing
	 */
	public void setGemstones(Gemstone[] gemstones) {
		this.gemstones = gemstones;
	}

}
