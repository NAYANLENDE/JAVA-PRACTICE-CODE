
class Java28NLPattern4 {

	public static void main(String[] args) {
		int n=65;
		for (int i=1; i<=6; ++i) {
			for (int j=1; j<=i; ++j) {
				System.out.print((char)n);
				++n;
			}
			System.out.println();
		}
	}

}
