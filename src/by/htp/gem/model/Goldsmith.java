/**
 * simple model package
 */
package by.htp.gem.model;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class Goldsmith determines a person who works with necklace: creates necklace,
 * prints necklace to the console, counts total cost and weight, sort gemstones
 * in necklace by cost,finds gemstones by transparency.
 * 
 * @author Artem_Kaptur
 *
 */
public class Goldsmith {

	/**
	 * String field name
	 */
	private String name;

	public Goldsmith() {

	}

	public Goldsmith(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return created necklace
	 */
	public Necklace createNecklace() {
		Scanner sc = new Scanner(System.in);
		int gemsNumber;
		System.out.println("Enter number of gemstones in your necklace ");
		gemsNumber = sc.nextInt();
		Gemstone[] gemstones = new Gemstone[gemsNumber];
		for (int i = 0; i < gemsNumber; i++) {
			gemstones[i] = chooseGemstone(i);
		}
		Necklace necklace = new Necklace(gemstones);
		return necklace;

	}
	
	/**
	 * @param a - counter
	 * @return initialized gemstone
	 */
	public Gemstone chooseGemstone(int i) {
		String[] arr = new String[] { "Ruby", "Supphire", "Emerald", "Diamond" };
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			System.out.println("Choose gemstone for " + (i + 1) + " position of your necklace from these variants "
					+ Arrays.toString(arr));
			s = sc.next();
		} // Check validation of typed info
		while ((!s.equals(arr[0])) && (!s.equals(arr[1])) && (!s.equals(arr[2])) && (!s.equals(arr[3])));
		System.out.println("Choose weight of gemstone for " + (i + 1) + " position of your necklace in carat ");
		int weight;
		weight = sc.nextInt();

		Gemstone gemstone = new Gemstone();
		switch (s) {
		case "Ruby":
			gemstone = new Gemstone((weight * 200 / 1000 / 4), 4, weight, 9, "Red", "Ruby", 5000 * weight,
					"Transparent");
			break;
		case "Supphire":
			gemstone = new Gemstone((weight * 200 / 1000 / 4), 4, weight, 9, "Blue", "Supphire", 3500 * weight,
					"Translucent");
			break;
		case "Emerald":
			gemstone = new Gemstone((weight * 200 / 1000 / 3), 3, weight, 8, "Green", "Emerald", 7000 * weight,
					"Translucent");
			break;
		case "Diamond":
			gemstone = new Gemstone((weight * 200 / 1000 / 3), 3, weight, 10, "Without color", "Diamond",
					10000 * weight, "Transparent");
			break;
		}
		return gemstone;

	}
	
	/**
	 * @param a - necklace
	 * @return nothing
	 */
	public void printNecklace(Necklace necklace) {
		System.out.println("Your necklace includes " + necklace.getGemstones().length + " gemstones, here they are:");
		for (int i = 0; i < necklace.getGemstones().length; i++) {
			System.out.print("The " + (i + 1) + " gemstone is " + necklace.getGemstones()[i].getTitle() + ", ");
			System.out.print(necklace.getGemstones()[i].getCost() + "$, ");
			System.out.print(necklace.getGemstones()[i].getTransparency() + ", ");
			System.out.print(necklace.getGemstones()[i].getColor() + ", ");
			System.out.print("hardness - " + necklace.getGemstones()[i].getHardness() + ", ");
			System.out.println(necklace.getGemstones()[i].getWeight() + " carat, ");
			System.out.println(necklace.getGemstones()[i].getVolume() + " cm^3");

		}
		System.out.println("=====================================================================");
	}
	/**
	 * @param a - array of gemstones
	 * @return nothing
	 */
	public void printGemstones(Gemstone[] gemstones) {
		for (int i = 0; i < gemstones.length; i++) {
			System.out.print("The " + (i + 1) + " gemstone is " + gemstones[i].getTitle() + ", ");
			System.out.print(gemstones[i].getCost() + "$, ");
			System.out.print(gemstones[i].getTransparency() + ", ");
			System.out.print(gemstones[i].getColor() + ", ");
			System.out.print("hardness - " + gemstones[i].getHardness() + ", ");
			System.out.println(gemstones[i].getWeight() + " carat, ");
			System.out.println(gemstones[i].getVolume() + " cm^3");

		}
		System.out.println("=====================================================================");
	}
	
	/**
	 * @param a - necklace
	 * @return weight of all gemstones
	 */
	public int countWeight(Necklace necklace) {
		int allWeight = 0;
		for (int i = 0; i < necklace.getGemstones().length; i++) {
			allWeight += necklace.getGemstones()[i].getWeight();
		}
		return allWeight;
	}

	/**
	 * @param a - necklace
	 * @return cost of all gemstones
	 */
	public int countCost(Necklace necklace) {
		int allCost = 0;
		for (int i = 0; i < necklace.getGemstones().length; i++) {
			allCost += necklace.getGemstones()[i].getCost();
		}
		return allCost;
	}

	/**
	 * @param a - necklace
	 * @return nothing
	 */
	public void printTotalWeigthCost(Necklace necklace) {
		int necklaceWeight;
		int necklaceCost;
		necklaceWeight = countWeight(necklace);
		necklaceCost = countCost(necklace);
		System.out.println(
				"The total weight and coast of necklace is " + necklaceWeight + " carat, " + necklaceCost + "$");
		System.out.println("=====================================================================");
	}

	/**
	 * @param a - necklace
	 * @return nothing
	 */
	public void sortByCost(Necklace necklace) {
		int startIndex = 0;
		int endIndex = necklace.getGemstones().length - 1;
		doSort(startIndex, endIndex, necklace);
	}

	private void doSort(int start, int end, Necklace necklace) {
		if (start >= end)
			return;
		int i = start, j = end;
		int cur = i - (i - j) / 2;
		while (i < j) {
			while (i < cur && (necklace.getGemstones()[i].getCost() <= necklace.getGemstones()[cur].getCost())) {
				i++;
			}
			while (j > cur && (necklace.getGemstones()[cur].getCost() <= necklace.getGemstones()[j].getCost())) {
				j--;
			}
			if (i < j) {
				Gemstone temp = necklace.getGemstones()[i];
				necklace.getGemstones()[i] = necklace.getGemstones()[j];
				necklace.getGemstones()[j] = temp;
				if (i == cur)
					cur = j;
				else if (j == cur)
					cur = i;
			}
		}
		doSort(start, cur, necklace);
		doSort(cur + 1, end, necklace);
	}

	/**
	 * @param a - necklace
	 * @return array of gemstones
	 */
	public Gemstone[] findGemstones(Necklace necklace) {
		Gemstone[] gemstones = new Gemstone[necklace.getGemstones().length];

		String[] arr = new String[] { "Transparent", "Translucent" };
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			System.out.println("Choose which gemstones you want to find from these variants " + Arrays.toString(arr));
			s = sc.next();
		} // Check validation of typed info
		while ((!s.equals(arr[0])) && (!s.equals(arr[1])));

		int count = 0;
		for (int i = 0, j = 0; i < necklace.getGemstones().length; i++) {
			if (s.equals(necklace.getGemstones()[i].getTransparency())) {
				gemstones[j] = necklace.getGemstones()[i];
				j++;
				count++;
			}
		}

		Gemstone[] gemstones2 = new Gemstone[count];
		for (int i = 0; i < count; i++) {
			gemstones2[i] = gemstones[i];
		}
		return gemstones2;
	}

}
