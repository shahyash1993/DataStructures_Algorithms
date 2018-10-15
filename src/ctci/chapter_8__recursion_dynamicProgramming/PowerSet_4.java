package ctci.chapter_8__recursion_dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PowerSet_4 {
	
	public void findPowerSet(int[] setArr) {
		
		int len = setArr.length;
		ArrayList<Integer> subset = new ArrayList<Integer>(Collections.nCopies(len, -1));
		
		findPowerSet(setArr, subset, 0);
		
	}//end func

	public void findPowerSet(int[] setArr, ArrayList<Integer> subset, int i) {

		
			if(i==setArr.length) {

				System.out.println(subset.toString());
				return;
			}
		
			subset.set(i,null);
			findPowerSet(setArr, subset, i+1);
			
			subset.set(i,setArr[i]);
			findPowerSet(setArr, subset, i+1);
			return;
		
	}//end func
	
}//end class
