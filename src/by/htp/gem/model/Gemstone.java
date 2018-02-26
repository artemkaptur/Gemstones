/**
 * model package
 */
package by.htp.gem.model;

/**
 * This is extended class from Stone. It includes such fields as title, cost,
 * transparency. And determines any gemstone with these parameters.
 * 
 * @author Artem_Kaptur
 *
 */
public class Gemstone extends Stone {

	/**
	 * int field cost String field title, transparency
	 */
	private String title;
	private int cost;
	private String transparency;

	public Gemstone() {
		super();
	}

	public Gemstone(double volume, int density, int weight, int hardness, String color, String title, int cost,
			String transparency) {
		super(volume, density, weight, hardness, color);
		this.title = title;
		this.cost = cost;
		this.transparency = transparency;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getTransparency() {
		return transparency;
	}

	public void setTransparency(String transparency) {
		this.transparency = transparency;
	}

	public String getColor() {
		return super.getColor();
	}

	public int getHardness() {
		return super.getHardness();
	}

	public int getWeight() {
		return super.getWeight();
	}

	public double getVolume() {
		return super.getVolume();
	}

}
