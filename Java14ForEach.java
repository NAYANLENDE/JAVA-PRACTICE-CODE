class Java14ForEach {

	public static void main(String[] args) {
		int[] marks= {150,132,99,120,155};
		int max=marks[0];
		for (int num:marks ) {
			if (num>max) {
				max=num;
			}
		}
		System.out.println("Highest Marks Is: "+max);
		}

}
