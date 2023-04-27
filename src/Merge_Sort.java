public class Merge_Sort{
	
	//removes duplicates from a sorted array 
	public static int[] removeDuplicates(int[] arr){
		//Test case
		if (arr.length <= 1){
			return arr;
			}
		
		// keep track of the index of the last non-duplicate element in the array 
		int j = 0;
		
		// iterate through the array and copy non-duplicate elements into the beginning 
		// of the array up to index j 
		for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != arr[i + 1]){
                arr[j++] = arr[i];
            }
		}
		
		// adds last element of the original array to the unique array 
		arr[j++] = arr[arr.length - 1];
		
		// new array with length equal to j
		int[] uniqueArr = new int[j];
		
		// copies the first j elements of the input array into the uniqueArr array
		for (int i = 0; i < j; i++){
			uniqueArr[i] = arr[i];
			}
		
		//returns the uniqueArr array
		return uniqueArr;
	}
	
	//merges two sorted arrays into one sorted array
	public static int[] merge(int[] left, int[] right){
		
		// new array with a length equal to the sum of the lengths of the
		//left and right arrays
		int[] result = new int[left.length + right.length];
		
		// variable to iterate through the left, right, and result arrays 
		int i = 0, j = 0, k = 0;
		
		// compares the values i and j of the left and right arrays 
		while (i < left.length && j < right.length){
			//inserts the smaller value into the result array 
			if (left[i] < right[j]){
				result[k++] = left[i++];
				}
			else{
				result[k++] = right[j++];
			}
		}
		
		// copies any remaining values from left to right arrays into the result array
		while (i < left.length){
			result[k++] = left[i++];
		}
		
		while (j < right.length){
			result[k++] = right[j++];
		}
		
		//returns the sorted array 
		return result;
	}
	
	// sort the array in ascending order 
	public static int[] mergeSort(int[] arr){
		// Test case for the array
		//checks if the length of the array is less than or equal one 
		// it returns the array 
		if (arr.length <= 1){
			return arr;
		}
		
		// Initializing the mid index 
        int mid = arr.length / 2;
        
        // Creates two new arrays to the left and right halves of the input array
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        // Fills the left array
        for (int i = 0; i < mid; i++){
        	left[i] = arr[i];
        }
        
        // Fills the right array
        for (int i = mid; i < arr.length; i++){
        	right[i - mid] = arr[i];
        }
        
        // recursively calls mergeSort method on the left and right arrays 
        left = mergeSort(left);
        right = mergeSort(right);

        // returns sorted array 
        return merge(left, right);
        }
	public static void main(String[] args){
		// Initializing the array
		int[] arr = {50, 11, 33, 21, 40, 50, 40, 40, 21};
		
		// calls the mergeSort method to sort the array 
		int[] sortedArr = mergeSort(arr);
		
		// remove duplicates from the sorted array
		int[] uniqueArr = removeDuplicates(sortedArr);
		
		// print the array 
		for (int i = 0; i < uniqueArr.length; i++){
			System.out.print(uniqueArr[i] + " ");
		}
	}
}