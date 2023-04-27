public class Recursive_Binary {

	public static void main(String[] args) {
	Recursive_Binary bs = new Recursive_Binary();
	int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
	int target = 597;
    int low = 0, high = arr.length;
    int result = bs.binarySearch(arr, target, low, high - 1);
    if(result == -1) {
        System.out.println("Element is not found in the array.");
    }else {
        System.out.println("Element is found at index " + result + ".");
    	}
	}
	
	int binarySearch(int arr[], int x, int low, int high) {
    if(high >= low) {
     int mid = (high + low) / 2;

     if(arr[mid] == x) {
    	 return mid;
     }
     if(arr[mid] > x) {
         return binarySearch(arr, x, low, mid - 1);
         }
     return binarySearch(arr, x, mid + 1, high);
    }
    return - 1;
	}
}
