import java.util.*;
public class Implement_2 {
	
	public static int[] Intersection(int[] array1, int[] array2) {
		int arr1[] = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
        int arr2[] = {6, 6, 9, 11, 21, 21, 21};

        int length1 = arr1.length;
        int length2 = arr2.length;

        length1 = deduplicate(arr1, length1);
        length2 = deduplicate(arr2, length2);

        print(getCommon(arr1, length1, arr2, length2));
		return arr2;
    }

    static int deduplicate(int arr[], int length) {
        int temp[] = new int[length];
        int j = 0;
        for (int i = 0; i < length - 1; i++)
        if (arr[i] != arr[i + 1])
            temp[j++] = arr[i];
        temp [j++] = arr [length - 1];
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    static int[] getCommon(int arr1[], int length1, int arr2[], int length2){
        ArrayList <Integer> common = new ArrayList<>();
        for(int i = 0; i < length1; i++) {
            int low = 0;
            int high = length2 - 1;
            boolean r = false;
            while((r != true) && (low <= high)) {
                int mid = (high + low) /2;
                if(arr2[mid] == arr1[i]) {
                    common.add(arr1[i]);
                    r = true;
                } else if (arr2[mid] < arr1[i]) {
                    low = mid + 1;
                } else if (arr2[mid] > arr1[i]) {
                    high = mid - 1;
                }
            }
    }
    int[] arr3 = common.stream().mapToInt(Integer::intValue).toArray();
    return arr3;
}

static void print(int arr[]){
    System.out.print("The sorted final array is: ["); 
    for (int i = 0; i < arr.length - 1; i++)
        System.out.print(arr[i] + ",");
    System.out.print(arr[arr.length - 1] + "]");
    }
}