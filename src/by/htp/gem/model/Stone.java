/**
 * simple model package
 */
package by.htp.gem.model;

/**
 * This is extended class from Figure. It includes such fields as density,
 * weight, hardness, color. And determines any stone with these parameters.
 * 
 * @author Artem_Kaptur
 *
 */
public class Stone extends Figure {

	/**
	 * int field density, weight, hardness
	 * String field color
	 */
	private int density;
	private int weight;
	private int hardness;
	private String color;

	public Stone() {
		super();
	}

	public Stone(double volume, int density, int weight, int hardness, String color) {
		super(volume);
		this.density = density;
		this.weight = weight;
		this.hardness = hardness;
		this.color = color;
	}

	public int getDensity() {
		return density;
	}

	public void setDensity(int density) {
		this.density = density;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHardness() {
		return hardness;
	}

	public void setHardness(int hardness) {
		this.hardness = hardness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVolume() {
		return super.getVolume();
	}

}
