package recursion_CodingBat;

import java.util.HashMap;
import java.util.HashSet;

public class Practice_Basic {

	/* 1. */
	public static int factorial(int n) {
		// base cond
		if (n <= 0)
			return Integer.MIN_VALUE;
		if (n == 1)
			return 1;

		// main cond
		return n * factorial(n - 1);

	}// end factorial

	/* 2. */
	public static int totalBunnyEars(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 2;

		if (n % 2 == 0)
			return 3 + totalBunnyEars(n - 1);
		else
			return 2 + totalBunnyEars(n - 1);
	}// end totalBunnyEars

	/* 3. */
	public static int triangle(int rows) {
		if (rows == 0)
			return 0;

		return rows + triangle(rows - 1);
	}// end triangle

	/* 4. */
	public static int count7(int n) {
		if (n <= 9) {
			if (n == 7)
				return 1;
			else
				return 0;
		} else {
			if (n % 10 == 7)
				return 1 + count7(n / 10);
			else
				return count7(n / 10);
		}
	}// count7 end

	/* 5. */
	public static int countX(String str) {
		return countX(str, 0, str.length());
	}

	public static int countX(String str, int idx, int len) {
		// base
		if (idx == len)
			return 0;

		// normal
		if (str.charAt(idx) == 'x')
			return 1 + countX(str, idx + 1, len);
		else
			return countX(str, idx + 1, len);
	}// count X end

	/* 6. */
	public static String changePi(String str) {

		StringBuilder builder = new StringBuilder();
		return changePi(str, 0, str.length(), builder);
	}

	public static String changePi(String str, int idx, int len, StringBuilder builder) {
		if (idx >= len)
			return builder.toString();

		if (str.charAt(idx) == 'p' && idx + 1 < len && str.charAt(idx + 1) == 'i') {
			builder.append("3.14");
			idx++;
		} else
			builder.append(str.charAt(idx));

		return changePi(str, idx + 1, len, builder);
	}// end changePi

	/* 7. */
	public static int array11(int[] nums, int index) {
		if (index >= nums.length)
			return 0;

		if (nums[index] == 11)
			return 1 + array11(nums, index + 1);
		else
			return array11(nums, index + 1);
	}// end array11

	/* 8. */
	public static String pairStar(String str) {
		if (str.length() == 0 || str.length() == 1)
			return str;

		StringBuilder builder = new StringBuilder();
		builder.append(str.charAt(0));

		return pairStar(str, 0, 1, str.length(), builder);
	}

	public static String pairStar(String str, int prev, int next, int len, StringBuilder builder) {
		if (next >= len)
			return builder.toString();

		if (str.charAt(prev) == str.charAt(next))
			builder.append("*");
		builder.append(str.charAt(next));

		return pairStar(str, prev + 1, next + 1, len, builder);
	}// end pairStar

	/* 9. */
	public static int countAbc(String str) {
		return countAbc(str, 0, str.length());
	}

	public static int countAbc(String str, int idx, int len) {
		if (idx >= len)
			return 0;
		if (idx + 2 < len && str.charAt(idx) == 'a' && str.charAt(idx + 1) == 'b'
				&& (str.charAt(idx + 2) == 'c' || str.charAt(idx + 2) == 'a')) {
			return 1 + countAbc(str, idx + 2, len);
		}

		return countAbc(str, idx + 1, len);
	}// end countAbc

	/* 10. */
	public static int countHi2(String str) {
		return countHi2(str, 0, str.length());
	}

	public static int countHi2(String str, int idx, int len) {
		if (idx >= len)
			return 0;

		if (idx + 1 < len && str.charAt(idx) == 'x' && str.charAt(idx + 1) == 'h')
			return countHi2(str, idx + 2, len);
		if (idx + 1 < len && str.charAt(idx) == 'h' && str.charAt(idx + 1) == 'i')
			return 1 + countHi2(str, idx + 1, len);
		return countHi2(str, idx + 1, len);
	}// end countHi2

	/* 11. */
	public static int strCount(String str, String sub) {
		return strCount(str, sub, str.length(), sub.length(), 0);
	}

	public static int strCount(String str, String sub, int strLen, int subLen, int idx) {
		if (idx >= strLen)
			return 0;

		if (idx + subLen <= strLen && str.substring(idx, idx + subLen).equals(sub))
			return 1 + strCount(str, sub, strLen, subLen, idx + subLen);

		return strCount(str, sub, strLen, subLen, idx + 1);
	}// end strCount

	/* 12. */
	public static int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;
		return 2 + bunnyEars(bunnies - 1);
	}// end bunnyEars

	/* 13. */
	public static int countHi(String str) {
		return countHi(str, str.length(), 0);
	}

	public static int countHi(String str, int len, int idx) {
		if (idx >= len)
			return 0;
		if (idx + 1 < len && str.charAt(idx) == 'h' && str.charAt(idx + 1) == 'i')
			return 1 + countHi(str, len, idx + 2);
		return countHi(str, len, idx + 1);
	}// end countHi

	/* 14. */
	public static String noX(String str) {
		StringBuilder builder = new StringBuilder();
		return noX(str, str.length(), 0, builder);
	}

	public static String noX(String str, int len, int idx, StringBuilder builder) {
		if (idx >= len)
			return builder.toString();

		if (str.charAt(idx) != 'x')
			builder.append(str.charAt(idx));

		return noX(str, len, idx + 1, builder);
	}// end noX

	/* 15. */
	public static int count11(String str) {
		return count11(str, str.length(), 0);
	}

	public static int count11(String str, int len, int idx) {
		if (idx >= len)
			return 0;
		if (idx + 1 < len && str.charAt(idx) == '1' && str.charAt(idx + 1) == '1')
			return 1 + count11(str, len, idx + 2);
		return count11(str, len, idx + 1);
	}// end count11

	/* 16. */
	public static int fibonacci(int n) {
		int[] memo = new int[n + 1];
		return fibonacci(n, memo);
	}

	public static int fibonacci(int n, int[] memo) {
		if (memo[n] != 0)
			return memo[n];
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
		return memo[n];
	}// end fibonacci

	/* 17. */
	public static int sumDigits(int n) {
		if (n <= 0)
			return 0;
		int digit = n % 10;
		int nextNumber = n / 10;

		return digit + sumDigits(nextNumber);
	}// end sumDigits

	/* 18. */
	public static int powerN(int base, int n) {
		if (n == 0)
			return 1;

		return base * powerN(base, n - 1);
	}// end powerN

	/* 19. */
	public static String changeXY(String str) {
		StringBuilder builder = new StringBuilder();
		return changeXY(str, 0, str.length(), builder);
	}

	public static String changeXY(String str, int idx, int len, StringBuilder builder) {
		if (idx >= len)
			return builder.toString();
		if (str.charAt(idx) == 'x')
			builder.append('y');
		else
			builder.append(str.charAt(idx));
		return changeXY(str, idx + 1, len, builder);
	}// end changeXY

	/* 20. */
	public static String allStar(String str) {

		if (str.length() == 0 || str.length() == 1)
			return str;

		StringBuilder builder = new StringBuilder();
		builder.append(str.charAt(0));
		return allStar(str, 0, 1, str.length(), builder);
	}

	public static String allStar(String str, int prev, int next, int len, StringBuilder builder) {
		if (next >= len)
			return builder.toString();

		if (next < len)
			builder.append("*" + str.charAt(next));
		return allStar(str, prev + 1, next + 1, len, builder);
	}// end allStar

	/* 21. */
	public static boolean array6(int[] nums, int index) {
		if (index >= nums.length)
			return false;
		if (nums[index] == 6)
			return true;

		return array6(nums, index + 1);
	}// end array6

	/* 22. */
	public static int count8(int n) {
		return count8(n, false);
	}

	public static int count8(int n, boolean wasPrev8) {
		if (n <= 0)
			return 0;

		int currentDigit = n % 10;
		int remainingN = n / 10;
		if (currentDigit == 8) {
			if (wasPrev8)
				return 2 + count8(remainingN, true);
			else
				return 1 + count8(remainingN, true);
		}
		return count8(remainingN, false);
	}// end count8

	/* 23. */
	public static boolean array220(int[] nums, int index) {
		HashSet<Integer> set = new HashSet<Integer>();
		return array220(nums, nums.length, index, set);
	}

	public static boolean array220(int[] nums, int len, int idx, HashSet<Integer> set) {
		if (idx >= len)
			return false;

		int numTesting = nums[idx];

		if (numTesting % 10 == 0 && set.contains(numTesting / 10))
			return true;
		else
			set.add(numTesting);

		return array220(nums, len, idx + 1, set);
	}// end array220

	/* 24. */
	public static String endX(String str) {
		StringBuilder builder = new StringBuilder();
		return endX(str, str.length(), 0, builder, 0);
	}

	public static String endX(String str, int len, int idx, StringBuilder builder, int count) {
		if (idx >= len) {
			if (count > 0) {
				builder.append("x");
				return endX(str, len, idx, builder, count - 1);
			}
			return builder.toString();
		}

		if (str.charAt(idx) == 'x')
			count++;
		else
			builder.append(str.charAt(idx));

		return endX(str, len, idx + 1, builder, count);

	}// end endX

	/* 25. */
	public static String parentBit(String str) {
		int startPara = -1, endPara = -1;
		return parentBit(str, 0, startPara, endPara);
	}

	public static String parentBit(String str, int idx, int startPara, int endPara) {
		if (idx >= str.length())
			return "()";

		char currChar = str.charAt(idx);
		if (currChar == '(')
			startPara = idx;
		if (currChar == ')' && startPara >= 0) {
			endPara = idx;
			return str.substring(startPara, endPara + 1);
		}

		return parentBit(str, idx + 1, startPara, endPara);

	}// end parentBit

	/* 26. */
	public static boolean strCopies(String str, String sub, int n) {
		if(n<=0) return true;
		if(str.length()<sub.length()) return false;
		
		if(str.substring(0, sub.length()).equals(sub)) {
			return strCopies(str.substring(sub.length()-1), sub, n-1);
		}
				
		return strCopies(str.substring(1), sub, n);
		
	}//end strCopies

	/* 27. */
	public static int countPairs(String str) {
		  if(str.length()<=2) return 0;
		  
		  if(str.charAt(0) == str.charAt(2)) return 1+countPairs(str.substring(1));
		  
		  return countPairs(str.substring(1));
		  
	}//end countPairs

	
	/* 28. */
	public static String stringClean(String str) {
		  StringBuilder builder = new StringBuilder();
		  return stringClean(str, str.length(), 0, builder);
	}//end stringClean
	
	public static String stringClean(String str, int len, int idx, StringBuilder builder) {
		  if(idx>=len) return builder.toString();
		  
		  if(idx+1<len && str.charAt(idx) == str.charAt(idx+1)) {}
		  else builder.append(str.charAt(idx));
		  
		  return stringClean(str, len, idx+1, builder);
		  
	}//end stringClean

	
	/* 29. */
	public static boolean nestParen(String str) {
			int len = str.length();
			if(len == 0) return true;
			
			if(str.charAt(0) == '(' && str.charAt(len-1) == ')') return nestParen(str.substring(1, len-1));
			else return false;
	}//end nestParen

	
	/* 30. */
	public static int strDist(String str, String sub) {
		return strDist(str, sub, 0, -1, -1);
	}

	public static int strDist(String str, String sub, int idx, int firstMatchIdx, int lastMatchIdx) {
		if(idx+sub.length()>str.length()) {
			if(lastMatchIdx < 0 && firstMatchIdx>=0) return sub.length();
			if(firstMatchIdx<0) return 0;
			
			return lastMatchIdx - firstMatchIdx + sub.length();
		}
		
		if(str.substring(idx,idx+sub.length()).equals(sub)) {
			System.out.println("Matched"+idx);
			if(firstMatchIdx<0) return strDist(str, sub, idx+1, idx, lastMatchIdx); 
			else return strDist(str, sub, idx+1, firstMatchIdx, idx);
		}
		
		return strDist(str, sub, idx+1, firstMatchIdx, lastMatchIdx);
	}//end strDist
	
	
}// end class
