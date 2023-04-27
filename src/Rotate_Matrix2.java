public class Rotate_Matrix2 {

	public static void main (String[] args){
	int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int n = mat.length;
	System.out.println("The orignal output would be: ");
	for(int i=0; i <= 3;i++) {
		for(int j = 0; j<=3; j++) {
			System.out.print(mat[i][j] + "   ");
		}
		System.out.println();
	}
	transpose(mat,n);
	swap(mat,n);
	System.out.println("The rotated output would be: ");
	for(int i=0; i <= 3;i++) {
		for(int j = 0; j<=3; j++) {
			System.out.print(mat[i][j] + "   ");
		}
		System.out.println();
	}
}
	public static void transpose(int[][] s, int n) {
    
    for(int i = 0; i < n; i++) {
    	for(int j = i+1; j < n; j++) {
    		int tempo = s[i][j];
    		s[i][j] = s[j][i];
    		s[j][i] = tempo;
    	}
    }
}
	public static void swap(int[][] s, int n) {
	 for(int i = 0; i < n; i++) {
		 int left = 0; 
		 int right = n-1;
		while(left < right) {
			 int tempo = s[i][left];
			 s[i][left] = s[i][right];
	    	s[i][right] = tempo;
	    	right--;
	    	left++;
		}
	 }
	}
}