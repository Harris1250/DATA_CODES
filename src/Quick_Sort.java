public class Quick_Sort{
	
	public static int partition(int[] array, int low, int high){
		
		int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
        	if(array[j] <= pivot){
        		i++;
        		
        		int temp = array[i];
        		array[i] = array[j];
        		array[j] = temp;
        	}
        }
        
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
	}
    
    public static void quickSort(int[] array, int low, int high){
    	if (low < high){
    		int pi = partition(array, low, high);
    		quickSort(array, low, pi - 1);
    		quickSort(array, pi + 1, high);
    	}
    }
    
    public static int[] deduplicate(int[] array){
    	quickSort(array, 0, array.length - 1);
    	int uniqueCount = 0;
    	for(int i = 1; i < array.length; i++){
    		if(array[i] != array[uniqueCount]){
    			uniqueCount++;
    			array[uniqueCount] = array[i];
    		}
    	}
    	int[] result = new int[uniqueCount + 1];
    	for(int i = 0; i <= uniqueCount; i++){
    		result[i] = array[i];
    		}
    	return result;
    	}
    
    public static void main(String[] args){
    	int[] array = {50, 11, 33, 21, 40, 50, 40, 40, 21};
    	int n = array.length;
    	if(n == 0){
    		System.out.println("Null input case, so no output?");
    		}
    	
    	if(n == 1){
    		System.out.println(array);
    		}
    	
    	int[] deDuplicateArray = deduplicate(array);
    	for (int result : deDuplicateArray){
    		System.out.print(result + ", ");
    	}
    }
}