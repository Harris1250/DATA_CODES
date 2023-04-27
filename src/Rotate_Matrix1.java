public class Rotate_Matrix1 {

	public static void main(String[] args) {
		int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int [][] mat2 = new int[4][4];
		System.out.println("The orignal output would be: ");
		for(int i=0; i <= 3;i++) {
			for(int j = 0; j<=3; j++) {
				System.out.print(mat[i][j] + "   ");
			}
			System.out.println();
		}
		swap(mat,mat2);
	}
	
	static void swap(int s[][], int s2[][]) {
		int n = s.length;
		
		for(int y = 0; y < n ; y++) {
			for (int x = 0; x < n ; x++) {
				s2[y][x] = s[n-x-1][y];
				}
			}
	System.out.println("The rotated output would be: ");
		for(int i=0; i <= 3;i++) {
			for(int j = 0; j<=3; j++) {
				System.out.print(s2[i][j] + "   ");
			}
			System.out.println();
		}
	}

}