public class Implement_1 {
	
	public static void main(String[] args) {
		 int array1[] = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
		 int array2[] = {6, 6, 9, 11, 21, 21, 21};
		 
		 int size;
		 if(array1.length < array2.length){
			 size = array1.length;
		 }
		 else{
			 size = array2.length;
		 }
	        int array[] = new int[size];
	        int t=0, temp = -1;
	        for(int i=0; i<array1.length; i++){
	            for(int j=0; j<array2.length; j++){
	                if(array2[j] == array1[i] && array2[j]!=temp && array1[i]!=temp){
	                    array[t] = array2[j];
	                    temp = array[t];
	                    t++;
	                }
	            }
	        }
	        for(int i=0; i<array.length; i++){
	            if(array[i]>0){
	                System.out.print("[" + array[i] + "]" + " ");	            }
	        }
	}
}