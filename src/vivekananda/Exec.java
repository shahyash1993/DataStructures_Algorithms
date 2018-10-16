package vivekananda;

public class Exec {
	public static void main(String args[]) {

		int n = 3;
		int tWeight = 50;
		Item[] items = new Item[n];
		items[0] = new Item("a", 10, 60);
		items[1] = new Item("b", 20, 100);
		items[2] = new Item("c", 30, 120);
		/*items[3] = new Item("d", 5, 7);
		items[4] = new Item("e", 2, 4);
		*/
		int maxValue = Knapsack.knapsackIt(items, tWeight);
		System.out.println(">"+maxValue);
		
	}// end of main
}// end class
