
class JC28ArrayPattern3 {

	public static void main(String[] args) {
		int matrix[][]={ {1,2,3},
				 {4,5,6},
				 {7,8,9},
				 {10,11,12},
				 {13,14,15}
						};
		System.out.println("\nThe Matrix is: ");
		for (int i=0;i<5 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
	}
}

	


