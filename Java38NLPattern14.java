
class Java38NLPattern14 {

	public static void main(String[] args) {
		int n=10;
		for (int i=0; i<=n; ++i) {
			for (int j=1; j<=n-i; ++j) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
		System.out.print("*");
		}
			System.out.println();
	}
		
		for (int i=n-1; i>=1; --i) {
			for (int j=n; j>i; --j) {
				System.out.print(" ");
			}
			for (int j=2; j<3+i; j++) {
		System.out.print("*");
		}
			System.out.println();
	}
  }
}	
  
	
  
	


	


