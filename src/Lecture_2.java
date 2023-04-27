public class Lecture_2 {

	public static void main(String[] args) {
		Lecture_2 ob = new Lecture_2();
	int[] array = {3,4,5,6,7,0,1,2};
	int x = 0;
	int result = ob.binarySearch(array, x);
	if (result == 1) {
			System.out.println("Element is not found in the array.");
	}
	else {
		System.out.println("Element is found at index " + result + ".");
	}
}
		int binarySearch(int arr[], int x){
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - 1 / 2);
			
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] < x) {
				low = mid - 1;	
			}
			else {
				high = mid - 1;
			}
		}
		return - 1;
	}
}
