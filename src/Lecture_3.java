public class Lecture_3 {

	public static void main(String[] args) {

		int[] array = {4,5,6,7,8,1,2,3};
		System.out.println("The minimum value for this code is " + findMin(array) + ".");
	}
		public static int findMin(int[] nums) {
	        int n = nums.length;
	        if (nums[0] <= nums[n - 1]) {
	            return nums[0];
	        }
	        int low = 0, high = n - 1;
	        while (low < high) {
	            int mid = (low + high) >> 1;
	            if (nums[0] <= nums[mid]) {
	            	low = mid + 1;
	            } else {
	            	high = mid;
	            }
	        }
	        return nums[low];
	  }
}