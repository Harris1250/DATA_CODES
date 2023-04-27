public class Re_Arrange2 {
	public static void main(String[] args) {
		        int[] a = {3, 5, 2, 6, 8, 4, 4, 6, 4, 4, 3};
		        int x = 5;
		        
		        int pivot = a[x];
		        int less = 0;
		        int equal = 0;
		        int greater = a.length - 1;

		        while (equal <= greater) {
		            if (a[equal] < pivot) {
		                swap(a, less++, equal++);
		            } else if (a[equal] == pivot) {
		                equal++;
		            } else {
		                swap(a, equal, greater--);
		            }
		        }

		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i] + " ");
		        }
		    }

		    public static void swap(int[] a, int i, int j) {
		        int temp = a[i];
		        a[i] = a[j];
		        a[j] = temp;
		    }
}