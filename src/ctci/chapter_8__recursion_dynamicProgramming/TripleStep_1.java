package ctci.chapter_8__recursion_dynamicProgramming;

import java.util.Arrays;

public class TripleStep_1 {

	public static int possibleWays(int n) {
		int[] memo = new int[n+1];
		Arrays.fill(memo, -1);
		return possibleWays(n,memo);
	}// end func

	public static int possibleWays(int n, int[] memo) {
		
		if(n<0) return 0;
		if(n==0) return 1;
		
		if(memo[n]>-1) return memo[n];

		memo[n]= possibleWays(n-1, memo)+possibleWays(n-2,  memo)+possibleWays(n-3, memo);
		return memo[n];
	}// end func
	
}// end class
