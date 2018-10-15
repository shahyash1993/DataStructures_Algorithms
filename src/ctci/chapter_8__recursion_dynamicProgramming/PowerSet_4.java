package ctci.chapter_8__recursion_dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class PowerSet_4 {

	public static void findPowerSet(int[] setArr) {

		int len = setArr.length;
		ArrayList<Integer> subset = new ArrayList<Integer>(Collections.nCopies(len, -1));
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		findPowerSet(allSubsets, setArr, subset, 0);

		for (ArrayList<Integer> sub : allSubsets) {
			System.out.print("{");
			Iterator<Integer> itr = sub.iterator();
			while (itr.hasNext()) {
				Integer next = itr.next();
				if (next == null)
					continue;
				if (itr.hasNext())
					System.out.print(next + ",");
				else
					System.out.print(next);
			} // inner
			System.out.println("}");
		} // outer
	}// end func

	public static void findPowerSet(ArrayList<ArrayList<Integer>> allSubsets, int[] setArr, ArrayList<Integer> subset, int i) {

		if (i == setArr.length) {
			ArrayList<Integer> subsetClone = (ArrayList<Integer>) subset.clone();
			allSubsets.add(subsetClone);
			return;
		}

		subset.set(i, null);
		findPowerSet(allSubsets, setArr, subset, i + 1);

		subset.set(i, setArr[i]);
		findPowerSet(allSubsets, setArr, subset, i + 1);
		return;

	}// end func

}// end class
