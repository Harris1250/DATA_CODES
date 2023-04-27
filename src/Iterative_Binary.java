public class Iterative_Binary {
	   
	public static void main(String[] args) {
	Iterative_Binary ob = new Iterative_Binary();
	int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    int x = 5;
    int result = ob.binarySearch(arr, x);
    if(result == -1){
    	  System.out.println("Element is not found in the array.");
	        }
      else{
    	  System.out.println("Element is found at index " + result + ".");
      }
	    }
	    int binarySearch(int arr[], int x){
	        int low = 0, high = arr.length - 1;
	        while(low <= high){
	            int mid = low + (high - low) / 2;

	            if(arr[mid] == x){
	                return mid;
	            }if(arr[mid] < x){
	                low = mid + 1;
	            }else{
	                high = mid - 1;
	            }
	        }
	        return -1;
	 }
}