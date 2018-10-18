package recursion_CodingBat;

public class Exec {

	public static void main(String[] args) {

		/*
		 * 1. Basic
		 * 
		 */

		System.out.println("factorial(5): " + Practice_Basic.factorial(5));
		System.out.println("totalBunnyEars(5): " + Practice_Basic.totalBunnyEars(5));
		System.out.println("triangle(5): " + Practice_Basic.triangle(5));
		System.out.println("count7(77575): " + Practice_Basic.count7(77575));
		System.out.println("count7(xyzzyspooon!x): " + Practice_Basic.countX("xyzzyspoon!x"));
		System.out.println("changePi(\"pip\"): " + Practice_Basic.changePi("pip"));
		System.out.println("array11([11,2,11]): " + Practice_Basic.array11(new int[] { 11, 2, 11 }, 0));
		System.out.println("pairStar(aaa): " + Practice_Basic.pairStar("abaa"));
		System.out.println("countAbc(aaabcabaaa): " + Practice_Basic.countAbc("aaabcaaabaaa"));
		System.out.println("countAbc(hihixhixhiihix): " + Practice_Basic.countHi2("xxhi"));
		System.out.println("strCount(\"cowcatcow\", \"cow\"): " + Practice_Basic.strCount("cowcatcow", "cow"));
		System.out.println("bunnyEars(3): " + Practice_Basic.bunnyEars(3));
		System.out.println("countHi(hihi1h): " + Practice_Basic.countHi("hi1hi1h"));
		System.out.println("noX(\"aaxxbbxx\"): " + Practice_Basic.noX("aaxxbbxx"));
		System.out.println("count11(\"111\"): " + Practice_Basic.count11("111"));
		System.out.println("fibonacci(5): " + Practice_Basic.fibonacci(5));
		System.out.println("sumDigits(5125): " + Practice_Basic.sumDigits(5125));
		System.out.println("powerN(3,2): " + Practice_Basic.powerN(3, 2));
		System.out.println("changeXY(\"xyzzy\"): " + Practice_Basic.changeXY("xyzzy"));
		System.out.println("allStar(\"hello\"): " + Practice_Basic.allStar("hello"));
		System.out.println("array6(1,4,6): " + Practice_Basic.array6(new int[] { 1, 4, 61 }, 0));
		System.out.println("count8(8818): " + Practice_Basic.count8(8818));
		System.out.println("array220(new int[] {1,2,20}, 0): " + Practice_Basic.array220(new int[] { 1, 2, 2 }, 0));
		System.out.println("endX(\"axxa\"): " + Practice_Basic.endX("axxa"));
		System.out.println("parentBit(\"ab(yps)ab\"): " + Practice_Basic.parentBit("ab(yps)ab"));
		System.out.println("strCopies(\"catcowcat\",\"cow\",1): " + Practice_Basic.strCopies("catcowcat", "cow", 1));
		System.out.println("countPairs(\"AxAxA\"): " + Practice_Basic.countPairs("AxAxA"));
		System.out.println("stringClean(\"aabbbcccc\"): " + Practice_Basic.stringClean("aabbbcccc"));
		System.out.println("nestParen(\"(())\"): " + Practice_Basic.nestParen("(())"));
		System.out.println("strDist(\"catcowcat\",\"cat\"): " + Practice_Basic.strDist("catcowcat", "cat"));

		/*
		 * 2. Harder
		 * 
		 */

		System.out.println(
				"groupSum(0, new int[] {2,2,8}, 10): " + Practice_Harder.groupSum(0, new int[] { 2, 2, 8 }, 10));
		System.out.println("splitOdd10(new int[] {5,5,6}): " + Practice_Harder.splitOdd10(new int[] { 5, 5, 6, 1 }));
		System.out.println("split53(new int[] {2,4,2}): " + Practice_Harder.split53(new int[] { 2, 4, 2 }));
		System.out.println("splitArray(new int[] {2,4,2}): " + Practice_Harder.splitArray(new int[] { 2, 4, 2, 2, 2 }));
		System.out.println(
				"groupNoAdj(new int[] {2,4,2}): " + Practice_Harder.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 12));
		System.out.println(
				"groupNoAdj(new int[] {2,4,2}): " + Practice_Harder.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 14));
		System.out.println("groupSumClump(0, new int[] {2,5,10,4}, 14): "
				+ Practice_Harder.groupSumClump(0, new int[] { 2, 5, 10, 10, 4 }, 14));
		System.out.println("groupSum5(0, new int[] {2,5,5,1}, 11): "
				+ Practice_Harder.groupSum5(0, new int[] { 2, 5, 5, 1, 1 }, 11));
		System.out.println(
				"groupSum6(0, new int[] {5,6,2}, 8): " + Practice_Harder.groupSum6(0, new int[] { 5, 6, 4 }, 9));

	}// end main
}// end class
