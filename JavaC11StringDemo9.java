class JavaC11StringDemo9 {
	public static void main(String[] args) {
		String s1="Nayan";
		boolean b=s1.equalsIgnoreCase("nayan");
		System.out.println(b);
		System.out.println(s1.equalsIgnoreCase("Nayan"));
		String s2="Prashant";
		boolean b1=s1.equalsIgnoreCase(s2);
		System.out.println(b1);
	}
}
	