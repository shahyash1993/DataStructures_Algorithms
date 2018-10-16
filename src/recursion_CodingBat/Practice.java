package recursion_CodingBat;

public class Practice {

	public static int factorial(int n) {
		
		//base cond
		if(n<=0) return Integer.MIN_VALUE;
		if(n==1) return 1;
		
		//main cond
		return n*factorial(n-1);
		
	}//end factorial
	
	public static int totalBunnyEars(int n) {
		if(n == 0) return 0;
		if(n == 1) return 2;
		
		if(n%2==0) return 3+totalBunnyEars(n-1);
		else return 2+totalBunnyEars(n-1);
	}//end totalBunnyEars
	
	public static int triangle(int rows) {
		  if(rows == 0) return 0;
		  
		  return rows+triangle(rows-1);
	}//end triangle

	public static int count7(int n) {
		if(n<=9) {
			if(n==7) return 1;
			else return 0;
		}
		else {
			if(n%10 == 7) return 1+count7(n/10);
			else return count7(n/10);
		}
	}//count7 end

	public static int countX(String str) {
		  return countX(str, 0, str.length());
	}//count X end

	public static int countX(String str, int idx, int len) {
		//base
		if(idx == len) return 0;

		//normal
		if(str.charAt(idx) == 'x') return 1+countX(str, idx+1, len);
		else return countX(str, idx+1, len);
	}//count X end

	public static String changePi(String str) {
		  
	StringBuilder builder = new StringBuilder();
	return changePi(str, 0, str.length(), builder);
		
	}//end changePi

	public static String changePi(String str, int idx, int len, StringBuilder builder) {  
		if(idx>=len) return builder.toString();
		
		if(str.charAt(idx) == 'p' && idx+1 < len &&str.charAt(idx+1) == 'i' ) {
			builder.append("3.14");
			idx++;
		}
		else builder.append(str.charAt(idx));
		
		return changePi(str, idx+1, len, builder);
	}//end changePi

	public static int array11(int[] nums, int index) {
		  if(index >= nums.length) return 0;
		  
		  if(nums[index] == 11) return 1+array11(nums, index+1);
		  else return array11(nums, index+1);
	}//end array11

	
	
	
	
	
}//end class
