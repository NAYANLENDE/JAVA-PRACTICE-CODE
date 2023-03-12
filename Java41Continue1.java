
class Java41Continue1 {

	public static void main(String[] args) {
		for (int i=1; i<=9; ++i) {
			for (int j=1; j<=4; ++j) {
				if (i==5) {
					continue;
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}


