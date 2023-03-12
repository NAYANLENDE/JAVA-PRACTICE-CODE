class Java15ForEachMin {

	public static void main(String[] args) {
		int[] marks= {233,456,355,489,476};
		int min=marks[0];
		for (int num:marks ) {
			if (num<min) {
				min=num;
			}
		}
		System.out.println("Lowest Marks Is: "+min);
		}

}
