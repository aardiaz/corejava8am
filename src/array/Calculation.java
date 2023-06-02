package array;

public class Calculation {
	
	public static void main(String[] args) {
		
		int mat1[][] = {{3,4,5},{70,90,88},{22,44,55}};
		int mat2[][] = {{4,3,2},{1,2,3},{6,7,8}};
		
		int mat3[][] = new int[3][3];
		
		//addition
		for(int i=0;i<3; i++) {
			for(int j=0; j<3; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
