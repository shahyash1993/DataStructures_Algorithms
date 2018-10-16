package vivekananda;

public class Knapsack {

	public static int knapsackIt(Item[] items, int tWeight) { // tWeight = total Weight
		int n = items.length;
		return knapsackIt(items, tWeight, 0, 0, n);
	}// end knapsackIt

	public static int knapsackIt(Item[] items, int rWeight, int value, int idx, int n) {// rWeight = remaining Weight

		if (rWeight < 0)
			return value - items[idx - 1].getValue();

		if (idx >= n)
			return value;

		int valueWithItem = knapsackIt(items, rWeight - items[idx].getWeight(), value + items[idx].getValue(), idx + 1, n);
		int valueWOItem = knapsackIt(items, rWeight, value, idx + 1, n);

		return Math.max(valueWithItem, valueWOItem);
	}// end knapsackIt
}// end class

// Inner class
class Item {
	private String name;
	private int weight;
	private int value;

	public Item(String name, int weight, int value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}// end of inner class