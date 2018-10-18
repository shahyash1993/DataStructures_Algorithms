package recursion_CodingBat;

public class Practice_Harder {

	/* 1. */
	public static int i = 0;

	public static boolean groupSum(int start, int[] nums, int target) {
		// System.out.println("Called:"+ ++i);
		if (target == 0)
			return true;
		if (start >= nums.length)
			return false;

		boolean with = groupSum(start + 1, nums, target - nums[start]);
		boolean withOut = groupSum(start + 1, nums, target);

		boolean res = (with || withOut);

		return res;

	}// end groupSum

	/* 2. */
	public static boolean splitOdd10(int[] nums) {
		return splitOdd10(nums, nums.length, 0, 0, 0);
	}

	public static boolean splitOdd10(int[] nums, int len, int idx, int grp1, int grp2) {
		if (idx >= len) {
			if (grp1 % 10 == 0 && grp2 % 2 != 0)
				return true;
			else
				return false;
		}

		boolean ifInGrp1 = splitOdd10(nums, len, idx + 1, grp1 + nums[idx], grp2);
		boolean ifInGrp2 = splitOdd10(nums, len, idx + 1, grp1, grp2 + nums[idx]);

		System.out.println("After " + nums[idx] + " G1: " + grp1 + ", G2:" + grp2);

		return ifInGrp1 || ifInGrp2;
	}// end splitOdd10

	/* 3. */
	public static boolean split53(int[] nums) {
		return split53(nums, nums.length, 0, 0, 0);
	}

	public static boolean split53(int[] nums, int len, int idx, int grp3, int grp5) {
		if (idx >= len) {
			return grp3 == grp5;
		}

		if (nums[idx] % 5 == 0)
			return split53(nums, len, idx + 1, grp3, grp5 + nums[idx]);
		if (nums[idx] % 3 == 0)
			return split53(nums, len, idx + 1, grp3 + nums[idx], grp5);

		boolean res = split53(nums, len, idx + 1, grp3 + nums[idx], grp5)
				|| split53(nums, len, idx + 1, grp3, grp5 + nums[idx]);

		return res;
	}// end split53

	/* 4. */
	public static boolean splitArray(int[] nums) {
		return splitArray(nums, nums.length, 0, 0, 0);
	}

	public static boolean splitArray(int[] nums, int len, int idx, int grp1, int grp2) {
		if (idx >= len)
			return grp1 == grp2;

		boolean ifInGrp1 = splitArray(nums, len, idx + 1, grp1 + nums[idx], grp2);
		boolean ifInGrp2 = splitArray(nums, len, idx + 1, grp1, grp2 + nums[idx]);

		boolean res = ifInGrp1 || ifInGrp2;
		return res;

	}// end splitArray

	/* 5. */
	public static boolean groupNoAdj(int start, int[] nums, int target) {
		if (target == 0)
			return true;
		if (start >= nums.length)
			return false;

		boolean ifSelected = groupNoAdj(start + 2, nums, target - nums[start]);
		boolean ifNotSelected = groupNoAdj(start + 1, nums, target);

		return ifSelected || ifNotSelected;
	}// end groupNoAdj

	/* 6. */
	public static boolean groupSumClump(int start, int[] nums, int target) {

		if (start >= nums.length)
			return target == 0;

		int num = nums[start];

		if (start + 1 < nums.length && nums[start + 1] == nums[start]) {
			for (; start + 1 < nums.length && nums[start + 1] == nums[start]; start++) {
				num += num;
			}
		}

		boolean ifAdded = groupSumClump(start + 1, nums, target - num);
		boolean ifNotAdded = groupSumClump(start + 1, nums, target);

		boolean res = ifAdded || ifNotAdded;
		return res;
	}// end groupSumClump

	/* 7. */
	public static boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;

		int num = nums[start];
		if (num % 5 == 0)
			return groupSum5(start + 1, nums, target - nums[start]); // must include
		if (num == 1 && start != 0 && nums[start - 1] % 5 == 0)
			return groupSum5(start + 1, nums, target); // must not include

		boolean ifAdded = groupSum5(start + 1, nums, target - num);
		boolean ifNotAdded = groupSum5(start + 1, nums, target);

		boolean res = ifAdded || ifNotAdded;
		return res;

	}// end groupSum5

	/* 8. */
	public static boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;

		int num = nums[start];
		if (num % 6 == 0)
			return groupSum6(start + 1, nums, target - nums[start]); // must include

		boolean ifAdded = groupSum6(start + 1, nums, target - num);
		boolean ifNotAdded = groupSum6(start + 1, nums, target);

		boolean res = ifAdded || ifNotAdded;
		return res;

	}// end groupSum6s
}// end class
