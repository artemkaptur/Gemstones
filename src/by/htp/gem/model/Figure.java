/**
 * simple model package
 */
package by.htp.gem.model;

/**
 * This class include field volume, constructors and setters and getters. It
 * determines any figure with volume.
 * 
 * @author Artem_Kaptur
 *
 */
public class Figure {

	/**
	 * double field volume
	 */
	private double volume;

	public Figure() {

	}

	public Figure(double volume) {
		this.volume = volume;
	}
	
	/**	 
	 * @return double volume
	 */
	public double getVolume() {
		return volume;
	}
	
	/**
	 * @param a - volume
	 * @return nothing
	 */
	public void setVolume(double volume) {
		this.volume = volume;
	}

}
