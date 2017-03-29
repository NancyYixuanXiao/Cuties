// Demonstrate recursive method to find the greatest common divisor.

public class GCDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 678;
		int y = 108;
//		System.out.println("The greatest common divisor of " + x +
//		           " and " + y + " is " + gcdRecurse(x, y));
//		System.out.println("The greatest common divisor of " + x +
//				           " and " + y + " is " + gcdIter(x, y));
		int[] nums = {8, 256, 36, 24, 64};
		System.out.println(gcd(nums));
	}
	public static int gcdRecurse(int x, int y)
	{
		if (x%y == 0)
		{
			return y;
		}
		return gcdRecurse(y, x%y);
	}
	public static int gcdIter(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	public static int gcd(int[] nums) {
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result = gcdIter(result, nums[i]);
		}
		return result;
	}
}
